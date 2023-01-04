package jp.co.illmatics.apps.shopping.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.illmatics.apps.shopping.form.AdminLoginForm;
import jp.co.illmatics.apps.shopping.form.SearchForm;
import jp.co.illmatics.apps.shopping.model.AdminUser;
import jp.co.illmatics.apps.shopping.model.Category;
import jp.co.illmatics.apps.shopping.model.User;
import jp.co.illmatics.apps.shopping.service.AdminUsersService;
import jp.co.illmatics.apps.shopping.service.CategoryService;
import jp.co.illmatics.apps.shopping.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminUsersService adminUsersService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/login")
	public String adminGetLogin(@ModelAttribute AdminLoginForm form) {
		return "admin/adminLogin";
	}
	
	//管理者管理
	@GetMapping("/home")
	public String getAdminHome(Model model, AdminUser adminUser, @ModelAttribute SearchForm form) {
		if(form == null) {
//			検索されなかった場合、ユーザーのリストを取得してセット
			List<AdminUser> adminUsers = adminUsersService.findAdminUsers();
			model.addAttribute("adminUsers", adminUsers);
		} else {
//			検索された場合、adminUserにformで渡されたnameとemailをセット
			adminUser.setName(form.getSearchName());
			adminUser.setEmail(form.getSearchEmail());
			
//			検索された名前orメールアドレスに一致するユーザーのリストをセット
			List<AdminUser> searchAdminUsers = adminUsersService.searchAdminUsers(adminUser);
			model.addAttribute("searchAdminUsers", searchAdminUsers);
		}
		
		return "admin/adminHome";
	}
	
	@GetMapping("/admin_users")
	public String getAdminUser(Model model) {
//		admin_usersリストを取得しmodelにセット
		List<AdminUser> adminUsers = adminUsersService.findAdminUsers();
		model.addAttribute("adminUsers", adminUsers);
		return "admin/adminUsers";
	}
	
	@GetMapping("/admin_users/create")
	public String getCreateAdminUser() {
		return "admin/adminCreate";
	}
	
	@PostMapping("/admin_users/create")
	public String postCreateAdminUsers(AdminLoginForm form) {
		AdminUser adminUser = mapper.map(form, adminUser.class)
		adminUsersService.updateAdminUser(form);
	}
	
	@GetMapping("/admin_users/2")
	public String updateAdminUser(@PathVariable String id, Model model) {
		AdminUser adminUser = adminUsersService.findById(id);
		model.addAttribute("adminUser", adminUser);
		return "admin/adminDetails";
	}
	
	@GetMapping("/admin_users/2/edit")
	public String editAdminUsers() {
		return "admin/adminEdit";
	}
	
	//顧客管理
	@GetMapping("/users")
	public String getUsers(Model model, User user, SearchForm form) {
		if(form == null) {
//			検索されなかった場合、ユーザーのリストを取得してセット
			List<User> Users = userService.findUsers();
			model.addAttribute("Users", Users);
		} else {
//			検索された場合、adminUserにformで渡されたnameとemailをセット
			user.setName(form.getSearchName());
			user.setEmail(form.getSearchEmail());
			
//			検索された名前orメールアドレスに一致するユーザーのリストをセット
			List<User> searchUsers = userService.searchUsers(user);
			model.addAttribute("searchUsers", searchUsers);
		}
		
		return "user/users";
	}
	
	@GetMapping("/users/create")
	public String getCreateUser() {
		return "user/createUsers";
	}
	
	@GetMapping("/users/1")
	public String updateUser(@PathVariable String id, Model model) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "user/userDetails";
	}

	@GetMapping("/users/1/edit")
	public String editUsers() {
		return "user/editUsers";
	}
	
	//商品カテゴリ管理
	@GetMapping("/product_categories")
	public String getUsers(Model model, Category category, SearchForm form) {
		if(form == null) {
//			検索されなかった場合、カテゴリのリストを取得してセット
			List<Category> categories = categoryService.findCategory();
			model.addAttribute("Categories", categories);
		} else {
//			検索された場合、formで渡されたnameをセット
			category.setName(form.getSearchName());
//			検索された名前に一致するカテゴリのリストをセット
			List<Category> categories = categoryService.searchCategory(category);
			model.addAttribute("categories", categories);
		}
		
		return "category/categories";
	}
	
	@GetMapping("/priduct_categories/create")
	public String getCreateCategory() {
		return "/createCategory";
	}
	
	@GetMapping("/product_categories/1")
	public String updateCategory(@PathVariable int id, Model model) {
		Category category = categoryService.findById(id);
		model.addAttribute("category", category);
		return "category/categoryDetails";
	}

	@GetMapping("/product_categories/1/edit")
	public String editCateogry() {
		return "category/editCategory";
	}
}
