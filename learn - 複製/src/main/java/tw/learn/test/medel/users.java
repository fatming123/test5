package tw.learn.test.medel;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	private String email;
	private String password;
	
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//------------------------
	@OneToOne(mappedBy = "users" ,cascade = CascadeType.ALL)
	private userinfo userinfo;
	public userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(userinfo userinfo) {
		this.userinfo = userinfo;
		this.userinfo.setUsers(this);
	}
	
}
