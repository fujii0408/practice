package jp.co.illmatics.apps.shoping.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import jp.co.illmatics.apps.shoping.service.AdminLoginService;
import jp.co.illmatics.apps.shopping.model.AdminUser;
import jp.co.illmatics.apps.shopping.repository.AdminUserMapper;

public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	private AdminUserMapper adminUserMapper;
	
	@Override
	public AdminUser findAdminLogin(String email) {
		return adminUserMapper.findAdminLogin(email);
	}

}
