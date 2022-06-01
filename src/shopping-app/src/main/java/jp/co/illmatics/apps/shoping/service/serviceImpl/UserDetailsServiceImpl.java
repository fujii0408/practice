package jp.co.illmatics.apps.shoping.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import jp.co.illmatics.apps.shoping.service.AdminLoginService;
import jp.co.illmatics.apps.shopping.model.AdminUser;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AdminLoginService adminLoginService;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		AdminUser adminUser = adminLoginService.findAdminLogin(email);
		
		if(adminUser == null) {
			throw new UsernameNotFoundException("user not found");
		}
		
		return adminUser;
	}

}
