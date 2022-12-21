package com.StudentManagmentSystem.UserDetailServiceProvider;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.StudentManagmentSystem.ModelClasses.LoginSignupModule;

public class UserService implements UserDetails {
	private LoginSignupModule userImpl;
	public UserService() {
		
	}
	
	public UserService(LoginSignupModule userImpl) {
		this.userImpl=userImpl;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority simple=new SimpleGrantedAuthority(userImpl.getRole());
		return Arrays.asList(simple);
		
	}

	@Override
	public String getPassword() {
		
		return userImpl.getPassword();
	}

	@Override
	public String getUsername() {
	
		return userImpl.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
	
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
