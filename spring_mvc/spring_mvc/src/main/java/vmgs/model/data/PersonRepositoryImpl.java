package vmgs.model.data;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

	private List<Person> createMockPersonList(int count) {
		List<Person> people = new ArrayList<Person>();
		for (int i = 0; i < count; i++) {
			Person mock = mock(Person.class);
			people.add(mock);
		}
		return people;
	}

	public List<Person> findPeople(long max, int count) {
		return createMockPersonList(count);
	}

	public Person findPerson(long id) {
		Person p = new Person();
		p.setAddress("carrera 11 b # "+ id + "-30");
		p.setAge(25);
		p.setFirtsName("Person "+ id);
		p.setLastName("Person last "+ id);
		p.setSalary(5600000);
		return p;
	}

}
