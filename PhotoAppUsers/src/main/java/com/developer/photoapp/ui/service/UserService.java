package com.developer.photoapp.ui.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.photoapp.ui.model.Users;
import com.developer.photoapp.ui.repository.UsersRepository;

@Service
@Transactional
public class UserService  {

	@Autowired
	UsersRepository usersRepository;
	
	
	public Users createUser(Users user) {
		user.setUserId(UUID.randomUUID().toString());
		return usersRepository.save(user);
	}


	/*
	 * @Override public UserDetails loadUserByUsername(String username) throws
	 * UsernameNotFoundException { Users user =
	 * usersRepository.findByEmail(username); if (user == null) { throw new
	 * UsernameNotFoundException(username); } return new User(user.getEmail(),
	 * user.getPassword(), true, true, true, true, new ArrayList<>()); }
	 */
}
