package jp.co.illmatics.apps.shopping.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class AdminUser implements UserDetails {
//	@Id
//	private Integer id;
	private String email;
	private String password;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}
