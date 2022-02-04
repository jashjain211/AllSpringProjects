package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//typed below line so that spring identifies it as a controller
@Controller
public class CoursesController {
	@RequestMapping("/courses")
	//what line 12 does is like returns the strring not the web page
//	@ResponseBody
//	public String courses(@RequestParam("cname")String coursename,HttpSession session) {
//		
////		@RequestParam("cname")String coursename
//		//what above line does is from your query whatever is in cname is store
////		in courswename
//		
//		
//		// made this method so that when controller 
//		//accepts request and its taken forward
////		HttpSession session = req.getSession();
//		
//		
//		System.out.println("Welcome to Edureka");
//		// below line doesnt work becoause apring boot doesnt know how to convert 
//		// jsp file to a servlet
//		
////		return "course.jsp";
////		String cname = req.getParameter("cname");
//		session.setAttribute("cname", coursename);
//		//alternate way is the one below
//		return "course";
//	}
	public ModelAndView courses(@RequestParam("cname")String coursename) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname",coursename);
		mv.setViewName("course");
		return mv;
	}
}
