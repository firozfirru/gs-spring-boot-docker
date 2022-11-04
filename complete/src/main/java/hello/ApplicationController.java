package hello;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {


	//@RequestMapping(value="/", method = RequestMethod.GET)
    @RequestMapping("/")
	public String sayHello() {
		return "index.html";
		// return "Hello Guys! I am Firoz from Java Springboot Application";
	}
//	public ModelAndView index () {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("index");
//		return modelAndView;
//	}

}
