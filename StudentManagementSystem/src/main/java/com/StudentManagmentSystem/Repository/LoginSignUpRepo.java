package com.StudentManagmentSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentManagmentSystem.ModelClasses.LoginSignupModule;

public interface LoginSignUpRepo extends JpaRepository<LoginSignupModule, Integer> {
	public LoginSignupModule findByUserName(String username);

}
