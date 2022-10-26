package com.cg.spring.mvc.training.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.mvc.training.models.Employee;
import com.cg.spring.mvc.training.models.Register;
import com.cg.spring.mvc.training.models.User;
import com.cg.spring.mvc.training.repository.RegisterRespository;
import com.cg.spring.mvc.training.service.RegisterService;

@Controller
public class LoginController {
	
	
	/*
	 * @RequestMapping("/sayhello/{id}")
	 * 
	 * @ResponseBody public String sayHello(@RequestParam("name") String
	 * personName, @PathVariable("id") Integer id) { return "Hello!  "+personName+
	 * ". Your ID is :: "+id; }
	 */
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/login")
	public ModelAndView showLogin() {
		ModelAndView mv = new ModelAndView("login","user", new User());
		return mv;
	}
	
	@RequestMapping(value = "/validate", method=RequestMethod.POST)
	public ModelAndView validate(@ModelAttribute("user") User user, BindingResult bindingResults) {
		ModelAndView mv = new ModelAndView();
		
		if(user.getUserName().equals("admin") && user.getPassword().equals("password")) {
			mv.setViewName("home");
		}else {
			mv.setViewName("login");
			mv.addObject("error", "Invalid username/password");
		}		
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView userRegistration() {
		ModelAndView mv = new ModelAndView("register","register", new Register());
		return mv;
	}
	
	@RequestMapping(value = "/register-user", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("register") @Valid Register register, BindingResult errors) {
		ModelAndView mv = new ModelAndView();
		if(errors.hasErrors()) {
			mv.setViewName("register");
		}else {
			Register reg = registerService.registerUer(register);
			mv.addObject("message", "Successfully Registered");	
			mv.setViewName("register");
		}
		return mv;
	}

	@RequestMapping("/employees")
	@ResponseBody
	public ModelAndView getEmployees() {
		
		List<Employee> employees = new ArrayList<Employee>();
		for(int i=1; i<=10; i++) {
			Employee emp = new Employee();
			emp.setId(i*30);
			emp.setName("Emp"+i);
			emp.setSalary((156*2*i));
			employees.add(emp);
		}
		
		ModelAndView mv =new ModelAndView();
		mv.setViewName("ShowEmployees");
		mv.addObject("employees", employees);
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView doLogout() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("logout");
		return mv;
	}
	
	
}
