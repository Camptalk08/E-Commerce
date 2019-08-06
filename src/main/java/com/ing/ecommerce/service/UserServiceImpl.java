package com.ing.ecommerce.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.ecommerce.dto.UserDTO;
import com.ing.ecommerce.entity.User;
import com.ing.ecommerce.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	public UserDTO saveUserDetails(UserDTO request) {

		User user = new User();
		user.setUserName(request.getUserName());
		user.setPassword(request.getPassword());
		user.setRole(request.getRole());
		user.setEmail(request.getEmail());
		user.setMobile(request.getMobile());
		userRepository.save(user);
		BeanUtils.copyProperties(request, user);
		;

		UserDTO userResponseDTO = new UserDTO();
		BeanUtils.copyProperties(user, userResponseDTO);

		return userResponseDTO;
	}

	@Override
	public String login(long userId, String password) throws Exception {
	
		UserDTO userDTO=new UserDTO();
		
		User user = userRepository.findByUserIdAndPassword(userId, password);
		
		if (user != null) {
			BeanUtils.copyProperties(user, userDTO);
			} else {
					throw new Exception("Customer not found for "+userId);
			}
		
		
		return "Login Successful";
	}

}
