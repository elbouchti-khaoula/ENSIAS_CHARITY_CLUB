package com.cindh.project.cindh_project.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cindh.project.cindh_project.models.User;
import com.cindh.project.cindh_project.repositories.UserRepository;

@Controller
public class UserController 
{
	@Autowired
	UserRepository urepo;
	
	@RequestMapping("/")
	public String home()
	{
		return "";
	}
	
	@RequestMapping("/signup")
	public String getSignup()
	{
		return "register";
	}
	
	@RequestMapping("/login")
	public String getHome()
	{
		return "login";
	}

	
	@PostMapping("log")
	public ModelAndView addUser(@RequestParam(name="user_email", required=true) String user_email, User user)
	{
		ModelAndView mv=new ModelAndView("login");
		ModelAndView mv_err=new ModelAndView("register_error");
		List<User> list=urepo.findByEMAIL(user_email);
		
		if(list.size()!=0)
		{

			return mv_err;
		}
		else
		{
		urepo.save(user);

		}

		return mv;
	}

	
	@PostMapping("/home")
	public String login_user(@RequestParam(name= "username", required = true) String username,@RequestParam(name="password") String password,
			HttpSession session,ModelMap modelMap)
	{
		
	User auser=urepo.findByUsernamePassword(username, password);
	
	if(auser!=null)
	{
		String uname=auser.getUser_email();
		String upass=auser.getUser_pass();
	
		if(username.equalsIgnoreCase(uname) && password.equalsIgnoreCase(upass)) 
		{
			session.setAttribute("username",username);
			return "Home";
		}
		else 
		{

			return "login_error";
		}
	}
	else
	{

		return "login_error";
	}
	
	}
	
	@GetMapping(value = "/logout")
	public String logout_user(HttpSession session)
	{
		session.removeAttribute("username");
		session.invalidate();
		return "redirect:/login";
	}
	
	
}
