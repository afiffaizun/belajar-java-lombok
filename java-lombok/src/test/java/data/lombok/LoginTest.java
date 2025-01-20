package data.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testCreate() {
        var login1 = Login.createEmpty();
        
        Assertions.assertNull(login1.getUsername());
        Assertions.assertNull(login1.getPassword());
        
        var login2 = Login.create("Afif", "1234");
        
        Assertions.assertEquals("Afif", login2.getUsername());
        Assertions.assertEquals("1234", login2.getPassword()); 
    }
    
    @Test
    void testToString() {
    	var login = Login.create("Afif" , "Rahasia");
    	System.out.println(login);
    }
}
