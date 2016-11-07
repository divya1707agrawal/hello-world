package helloworldexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
@RequestMapping("/login")
public ModelAndView login(Model model)
{
	model.addAttribute mv=new ModelAndView("index"); 
	mv.addObject("isUserClickedLogin","true");
	return "mv";

}
@RequestMapping("/registration")
public String registrer(Model model)
{
	model.addAttribute("isUserClickedRegister","true");
	return "index";
}

@RequestMapping("validate")
public String validate(@RequestParam(name="userID")String id,@RequestParam(name="password")String pwd,Model model)
{
 if(id.equals("niit")&&pwd.equals("niit"))
	 return "index";
else
{
	model.addAttribute("errorMessage","Invalid credentials...please try again");
	return "index";
}
}
@RequestMapping("/register")
public String register(Model m)
{
	m.addAttribute("registreMessage","you are successfully.....");
	return "index";
}
}