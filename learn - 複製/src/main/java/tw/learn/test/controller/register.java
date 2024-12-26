package tw.learn.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpSession;
import tw.learn.test.medel.userinfo;
import tw.learn.test.medel.users;
import tw.learn.test.repository.Usersrepository;

@RestController
@RequestMapping("/user")
public class register {
	@Autowired
	private Usersrepository Usersrepository;
	
	@PostMapping("/register")
	public RedirectView register(@RequestParam String email,@RequestParam String password,@RequestParam String username) {
		users user = new users();
		user.setEmail(email);
		user.setPassword(password);
		userinfo userinfo = new userinfo();
		userinfo.setUsername(username);
		user.setUserinfo(userinfo);
		System.out.println(user.getUserinfo());
		Usersrepository.save(user);
		RedirectView redirect = new RedirectView();
		redirect.setUrl("../pages/profile.html");
		return redirect;
	}
	

}
