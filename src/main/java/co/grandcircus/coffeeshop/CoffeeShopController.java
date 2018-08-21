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
			@RequestParam("number") String number, @RequestParam("password") String password,
			@RequestParam("password2") String password2, @RequestParam("age") String age) {

		User user = new User();
		String confirmedPassword = user.confirmedPassword(password, password2);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setNumber(number);
		user.setPassword(password);
		user.setAge(age);
		user.setPassword2(password2);
		user.setConfirmedPassword(confirmedPassword);

		ModelAndView mav = new ModelAndView("registerresult");
		mav.addObject("user", user);

		return mav;
	}

}
