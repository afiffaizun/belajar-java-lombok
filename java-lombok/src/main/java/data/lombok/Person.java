package data.lombok;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.Builder;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Person {
	
	private String id;
	private String name;
	private Integer age;
	@Singular
	private List<String> hobbies;
}
