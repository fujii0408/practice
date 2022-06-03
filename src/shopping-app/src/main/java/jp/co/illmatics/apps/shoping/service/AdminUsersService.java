package jp.co.illmatics.apps.shoping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.co.illmatics.apps.shopping.model.AdminUser;

@Service
public interface AdminUsersService {

	public List<AdminUser> findAdminUsers();
	
	public List<AdminUser> searchAdminUsers(AdminUser adminUser);
}
