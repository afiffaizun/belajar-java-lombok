package data.lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor(staticName = "create")
@NoArgsConstructor(staticName = "createEmpty")
@Getter
@ToString(exclude = {
	"password"
})

public class Login {
	@Setter(value = AccessLevel.PROTECTED)
	private String username;
	
	@Setter(value = AccessLevel.PROTECTED)
	private String password;

	
	
	
	
}
