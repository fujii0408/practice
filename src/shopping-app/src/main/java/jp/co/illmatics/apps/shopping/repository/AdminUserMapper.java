package jp.co.illmatics.apps.shopping.repository;

import org.apache.ibatis.annotations.Mapper;

import jp.co.illmatics.apps.shopping.model.AdminUser;

@Mapper
public interface AdminUserMapper {
	public AdminUser findAdminLogin(String email);
}
