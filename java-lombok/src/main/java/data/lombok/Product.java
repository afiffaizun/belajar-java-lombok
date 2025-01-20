package data.lombok;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"price"})
public class Product {
    
    private final String id;
    private String nama;
    private Long price;
}
