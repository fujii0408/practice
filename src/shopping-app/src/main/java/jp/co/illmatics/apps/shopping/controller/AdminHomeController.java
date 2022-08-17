package jp.co.illmatics.apps.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import jp.co.illmatics.apps.shopping.form.SearchForm;
import jp.co.illmatics.apps.shopping.model.AdminUser;
import jp.co.illmatics.apps.shopping.service.AdminUsersService;

@Controller
public class AdminHomeController {
	
	@Autowired
	private AdminUsersService adminUsersService;
	
	@GetMapping("/admin/home")
	public String getAdminHome(Model model, AdminUser adminUser, @ModelAttribute SearchForm form) {
		if(form == null) {
//			ユーザーのリストを取得してセット
			List<AdminUser> adminUsers = adminUsersService.findAdminUsers();
			model.addAttribute("adminUsers", adminUsers);
		} else if(form != null) {
//			adminUserにformで渡されたnameとemailをセット
			adminUser.setName(form.getSearchName());
			adminUser.setEmail(form.getSearchEmail());
			
//			検索された名前orメールアドレスに一致するユーザーのリストをセット
			List<AdminUser> searchAdminUsers = adminUsersService.searchAdminUsers(adminUser);
			model.addAttribute("searchAdminUsers", searchAdminUsers);
		}
		
		return "admin/adminHome";
	}
}
