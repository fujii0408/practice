package jp.co.illmatics.apps.shoping.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.illmatics.apps.shoping.service.AdminUsersService;
import jp.co.illmatics.apps.shopping.model.AdminUser;
import jp.co.illmatics.apps.shopping.repository.AdminUserMapper;

@Service
public class AdminUsersServiceImpl implements AdminUsersService {

	@Autowired
	private AdminUserMapper adminUserMapper;
	
	@Override
	public List<AdminUser> findAdminUsers() {
		return adminUserMapper.findAdminUsers();
	}

	@Override
	public List<AdminUser> searchAdminUsers(AdminUser adminUser) {
		return adminUserMapper.searchAdminUsers(adminUser);
	}

}
