package com.StudentManagmentSystem.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagmentSystem.ModelClasses.LoginSignupModule;
import com.StudentManagmentSystem.Repository.LoginSignUpRepo;

@Service
public class LoginSignUpService {
	@Autowired
	private LoginSignUpRepo signuprepo;
	
	public LoginSignupModule registration(LoginSignupModule admin) {
		admin.setRole("ROLE_"+admin.getRole().toUpperCase());
		
	LoginSignupModule adminSign=signuprepo.save(admin);
		
		return adminSign;
		
		
	}

}
