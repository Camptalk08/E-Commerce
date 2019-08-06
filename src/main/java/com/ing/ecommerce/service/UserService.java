package com.ing.ecommerce.service;

import com.ing.ecommerce.dto.UserDTO;

public interface UserService {

	UserDTO saveUserDetails(UserDTO request);

	String login(long userId, String password) throws Exception;


}
