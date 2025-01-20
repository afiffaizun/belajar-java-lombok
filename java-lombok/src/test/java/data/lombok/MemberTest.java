package data.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    void testConstructorNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            new Member(null, null); // Directly test the constructor
        });
    }

    @Test
    void testSetterNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member("Fai", "Fai");
            member.setName(null); 
        });
    }
    
    @Test
    void testMethodNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member("Fai", "Fai");
            member.sayHello(null); 
        });
    }
}
