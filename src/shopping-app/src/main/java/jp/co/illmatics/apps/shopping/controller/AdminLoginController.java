package jp.co.illmatics.apps.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.illmatics.apps.shopping.form.AdminLoginForm;

//import jp.co.illmatics.apps.shopping.repository.AdminUserRepository;

@Controller
public class AdminLoginController {

//	@Autowired
//	private AdminUserRepository adminUserRepository;
	
	@GetMapping("/admin/login")
	public String adminGetLogin(@ModelAttribute AdminLoginForm form) {
		return "adminLogin";
	}
	
//	@PostMapping("/admin/home")
//	public String adminPostLogin() {
//		if(adminUserRepository.findAll() != null) {
//			return "adminHome";
//		} else {
//			return "redirect:/admin/login";
//		}
//	}
}
