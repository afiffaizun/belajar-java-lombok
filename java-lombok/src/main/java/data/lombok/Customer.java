package data.lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class Customer {
    
    private String id;
    
    private String name;
}
