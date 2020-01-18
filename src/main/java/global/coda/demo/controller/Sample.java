package global.coda.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import global.coda.demo.bean.User;

@RestController
public class Sample {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloWorld()
	{
		return "hellllloooooo";
	}
	@GetMapping(value = "/getbean")
	public User getUser()
	{   User user = new User();
		return user;
	}
	@PostMapping(value = "/postbean")
	public User postUser(@RequestBody User user)
	{
		return user;
	}

}
