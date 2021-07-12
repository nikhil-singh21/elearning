package net.javaguides.springboot.springsecurity.web;
import net.javaguides.springboot.springsecurity.model.*;
import net.javaguides.springboot.springsecurity.service.CourseRepositoryService;
import net.javaguides.springboot.springsecurity.service.EmployeeService;
import net.javaguides.springboot.springsecurity.service.contentService;
import net.javaguides.springboot.springsecurity.service.sectionService;
import net.javaguides.springboot.springsecurity.web.dto.EmployeeRegistrationDto;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

	
	 private EmployeeService userService;
	 @Autowired
	    private CourseRepositoryService courseservice;
	 
	 @Autowired
	    private sectionService sectionService;
	 
	 @Autowired
	    private contentService contentService;
	 
	 @Autowired
	    private contentService contentservice;
	
	
	@ModelAttribute("employee")
    public EmployeeRegistrationDto userRegistrationDto() {
        return new EmployeeRegistrationDto();
    }
	@GetMapping("/i")
    public String root(Model model) {
        return "i";
    }
	
//	@GetMapping("/")
//    public String index1(Model model) {
//        return "i";
//    }
//	@GetMapping("")
//    public String rt() {
//        return "i";
//    }
	
    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    
 
    @GetMapping("/")
    public String index(Model model) {
    	  
		  List<NewCourse> courselist1= (List<NewCourse>) courseservice.findall();
		  model.addAttribute("courselist1",courselist1);
        return "i";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
    

}