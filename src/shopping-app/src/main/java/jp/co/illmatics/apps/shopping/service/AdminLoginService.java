package jp.co.illmatics.apps.shopping.service;

import org.springframework.stereotype.Service;

import jp.co.illmatics.apps.shopping.model.AdminUser;

@Service
public interface AdminLoginService {
	public AdminUser findAdminLogin(String email);
}