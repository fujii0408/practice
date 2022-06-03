package jp.co.illmatics.apps.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.illmatics.apps.shoping.service.AdminUsersService;
import jp.co.illmatics.apps.shopping.model.AdminUser;

@Controller
public class AdminUsersController {
	
	@Autowired
	private AdminUsersService adminUsersService;
	
	@GetMapping("/admin/admin_user")
	public String getAdminUser(Model model) {
//			admin_usersリストを取得しmodelにセット
			List<AdminUser> adminUsers = adminUsersService.findAdminUsers();
			model.addAttribute("adminUsers", adminUsers);
		return "admin/adminUsers";
	}

}
