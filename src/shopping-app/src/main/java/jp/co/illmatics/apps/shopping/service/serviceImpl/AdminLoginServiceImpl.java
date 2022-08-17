package jp.co.illmatics.apps.shopping.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import jp.co.illmatics.apps.shopping.model.AdminUser;
import jp.co.illmatics.apps.shopping.repository.AdminUserMapper;
import jp.co.illmatics.apps.shopping.service.AdminLoginService;

public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	private AdminUserMapper adminUserMapper;
	
	@Override
	public AdminUser findAdminLogin(String email) {
		return adminUserMapper.findAdminLogin(email);
	}

}
