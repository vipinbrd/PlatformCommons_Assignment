package com.StudentManagmentSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentManagmentSystem.ModelClasses.LoginSignupModule;
import com.StudentManagmentSystem.ServiceIMPL.LoginSignUpService;

@RestController
@RequestMapping("/")
public class SignUpController {
	@Autowired
	private LoginSignUpService  loginSignup;
	@PostMapping("/signup")
	public ResponseEntity<LoginSignupModule> signUpProvider(@RequestBody LoginSignupModule  LogSign) {
		LoginSignupModule logs=loginSignup.registration(LogSign);
		return new ResponseEntity<LoginSignupModule>(logs,HttpStatus.CREATED) ;
		
		
		
	}

}
