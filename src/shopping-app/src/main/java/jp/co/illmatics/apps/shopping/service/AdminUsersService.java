package jp.co.illmatics.apps.shopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.co.illmatics.apps.shopping.model.AdminUser;

@Service
public interface AdminUsersService {

	public List<AdminUser> findAdminUsers();
	
	public List<AdminUser> searchAdminUsers(AdminUser adminUser);
	
	public void updateAdminUser(String id);
	
	public void insertAdminUser(AdminUser adminUser);
	
	public AdminUser findById(String id);
}
