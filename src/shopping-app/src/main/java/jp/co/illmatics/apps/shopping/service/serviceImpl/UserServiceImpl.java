package jp.co.illmatics.apps.shopping.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jp.co.illmatics.apps.shopping.model.User;
import jp.co.illmatics.apps.shopping.repository.UserMapper;
import jp.co.illmatics.apps.shopping.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findUsers() {
		return userMapper.findUsers();
	}

	@Override
	public List<User> searchUsers(User user) {
		return userMapper.searchUsers(user);
	}

	@Override
	public User findById(String id) {
		return userMapper.searchById(id);
	}

}
