package vmgs.model.data;

import java.util.List;

public interface PersonRepository {
	List<Person> findPeople(long max, int count);

	Person findPerson(long id);
}
