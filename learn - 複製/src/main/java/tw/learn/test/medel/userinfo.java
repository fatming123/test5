package tw.learn.test.medel;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class userinfo {
	@Id
	private Integer userid;
	private String gender;
	private String birthday;
	private byte[] avatar;
	private String phone;
	private String username;
	private String userintro;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public byte[] getAvatar() {
		return avatar;
	}
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserIntro() {
		return userintro;
	}
	public void setUserIntro(String userintro) {
		this.userintro = userintro;
	}
	//---------------------
	@OneToOne
	@MapsId("userid")
	@JoinColumn(name = "userid")
	private users users;
	public users getUsers() {
		return users;
	}
	public void setUsers(users users) {
		this.users = users;
	}
}
