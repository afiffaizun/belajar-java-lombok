package data.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode

public class Employee {
	
	private String id;
	private String name;
}
