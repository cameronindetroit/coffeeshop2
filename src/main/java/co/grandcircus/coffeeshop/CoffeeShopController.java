package co.grandcircus.coffeeshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {

	@RequestMapping("/")
	public ModelAndView showHomePage() {

		ModelAndView mav = new ModelAndView("index");

		return mav;

	}

	// setting up form
	@RequestMapping("/register-form")
	public ModelAndView showForm() {

		ModelAndView mav = new ModelAndView("registerform");

		return mav;

	}

	// results to be sent back
	@RequestMapping("/register-result")
	public ModelAndView registrationResults(@RequestParam("firstname") String firstName,
			@RequestParam("lastname") String lastName, @RequestParam("email") String email,
			@RequestParam("number") String number, @RequestParam("password") String password) {
		ModelAndView mav = new ModelAndView("registerresult");
		mav.addObject("firstname", firstName);

		return mav;
	}

}
