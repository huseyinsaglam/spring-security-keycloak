package com.example.springsecuritykeycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@GetMapping(value = {"/", "/login"})
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView; // /login ile gelindigi zaman login.html sayfasının gorunumu sunacaktır.
	}

	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}

	@GetMapping("/manage-students")
	@PreAuthorize("hasAuthority('PROFESSOR')")
	//@PreAuthorize("hasAuthority('PROFESSOR') or hasAuthority('STUDENT')")
	public ModelAndView manageStudents() {
		ModelAndView modelAndView = new ModelAndView("manage-students");
		return modelAndView;
	}

	@GetMapping("/access-denied")
	public ModelAndView accessDenied() {
		ModelAndView modelAndView = new ModelAndView("/access-denied");
		return modelAndView;
	}
}
