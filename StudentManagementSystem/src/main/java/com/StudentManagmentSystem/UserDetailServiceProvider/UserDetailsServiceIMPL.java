package com.StudentManagmentSystem.UserDetailServiceProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.StudentManagmentSystem.ModelClasses.LoginSignupModule;
import com.StudentManagmentSystem.Repository.LoginSignUpRepo;

@Service
public class UserDetailsServiceIMPL implements UserDetailsService {
@Autowired
private LoginSignUpRepo logsignrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LoginSignupModule module=logsignrepo.findByUserName(username);
		if(module==null) throw new UsernameNotFoundException("UnAuthenticate User please register first");
		return new UserService(module);
	}

}
