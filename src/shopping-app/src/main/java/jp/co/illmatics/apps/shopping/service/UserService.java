package jp.co.illmatics.apps.shopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.co.illmatics.apps.shopping.model.User;

@Service
public interface UserService {

	public List<User> findUsers();
	
	public List<User> searchUsers(User user);
	
	public User findById(String id);
}
