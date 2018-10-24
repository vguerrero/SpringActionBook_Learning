package vmgs.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vmgs.model.data.Person;
import vmgs.model.data.PersonRepository;

@Controller
@RequestMapping("/person")
public class PersonController {


	PersonRepository personRepo;

	@Autowired
	public PersonController(PersonRepository personRepo) {
		super();
		this.personRepo = personRepo;
	}

	@RequestMapping(value="/{id}", method= RequestMethod.GET)
	public ModelAndView getPerson(@PathVariable("id") long id ){
		ModelAndView view = new ModelAndView("personPage");
		Person p =personRepo.findPerson(id);
		System.out.print("person " + p);
		view.addObject("p", p);
		return view;
	}

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String  getPersons(@RequestParam("max") long max, @RequestParam("count") int count, Model model) {
		System.out.println("max "+ max +" ,count: " + count);
		 List<Person> persons = personRepo.findPeople(max, count);
		 System.out.println(persons.get(0).getFirtsName());
		model.addAttribute("personList",persons);
		return "personList";
	}

}
