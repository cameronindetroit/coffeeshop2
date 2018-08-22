package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {

	@Autowired
	private userDao usersDao;

	@Autowired
	private ItemsDao itemsDao;

	@RequestMapping("/")
	public ModelAndView showHomePage() {

		List<Items> items = itemsDao.findAll();

		ModelAndView mav = new ModelAndView("index", "item", items);

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

	@RequestMapping("/add-submit")
	public ModelAndView submitAddForm(@RequestParam("firstname") String firstName,
			@RequestParam("lastname") String lastName, @RequestParam("email") String email,
			@RequestParam("number") String number, @RequestParam("password") String password,
			@RequestParam("age") String age) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setNumber(number);
		user.setPassword(password);
		user.setAge(age);

		usersDao.create(user);

		return new ModelAndView("registerresult");
	}

//	@RequestMapping("/")
//	public ModelAndView index() {
//		List<Items> items = itemsDao.findAll();
//		return new ModelAndView("list", "item", items);
//
//	}

	@RequestMapping("/items/{id}")
	public ModelAndView showItems(@PathVariable("id") Integer id) {
		System.out.println(id);
		ModelAndView mav = new ModelAndView("details");
		mav.addObject("items", itemsDao.findById(id));
		return mav;

	}

}
