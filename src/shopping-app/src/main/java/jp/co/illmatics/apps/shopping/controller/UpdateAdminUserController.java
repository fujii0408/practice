package jp.co.illmatics.apps.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import jp.co.illmatics.apps.shopping.service.AdminUsersService;

public class UpdateAdminUserController {

	@Autowired
	AdminUsersService adminUsersService;
	
	public String updateAdminUser(@PathVariable String id) {
		AdminUser adminUser = 
	}
}
