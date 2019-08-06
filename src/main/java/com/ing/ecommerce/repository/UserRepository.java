package com.ing.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.ecommerce.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserIdAndPassword(long userId, String password);

}
