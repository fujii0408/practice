package jp.co.illmatics.apps.shopping.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.illmatics.apps.shopping.model.AdminUser;

@Mapper
public interface AdminUserMapper {
	public AdminUser findAdminLogin(String email);
	
	public List<AdminUser> findAdminUsers();
	
	public List<AdminUser> searchAdminUsers(AdminUser adminUser);
	
	public void updateAdminUser(String id);
	
	public void insertAdminUser(AdminUser adminUser);
	
	public AdminUser findById(String id);

}
