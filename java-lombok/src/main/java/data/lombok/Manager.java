package data.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Manager extends Employee{
	
	private Integer totalEmployee;
}
