package jp.co.illmatics.apps.shopping.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.illmatics.apps.shopping.model.User;

@Mapper
public interface UserMapper {

	public List<User> findUsers();
	
	public List<User> searchUsers(User user);
	
	public User searchById(String id);
}
