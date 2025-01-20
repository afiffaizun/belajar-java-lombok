package data.lombok;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class PersonTest {
	
	@Test
	void createViaConstructor() {
		
		var hobbies = new ArrayList<String>();
		hobbies.add("Game");
		hobbies.add("PUBG");
		hobbies.add("FF");
		
		var person = new Person("id", "name", 30, hobbies);
	}
	
	@Test
	void createViaSetter() {
		
		var hobbies = new ArrayList<String>();
		hobbies.add("Game");
		hobbies.add("PUBG");
		hobbies.add("FF");
		
		var person = new Person();
		person.setId("id");
		person.setName("name");
		person.setAge(30);
		person.setHobbies(hobbies);
	}
	
	@Test
	void createViaBuilder() {
		var hobbies = new ArrayList<String>();
		hobbies.add("Game");
		hobbies.add("PUBG");
		hobbies.add("FF");
		
		var person = Person.builder()
				.id("id")
				.name("name")
				.age(30)
				.hobbies(hobbies)
				.hobby("PUBG")
				.hobby("FF")
				.build();
		System.out.println(person);
	}
}
