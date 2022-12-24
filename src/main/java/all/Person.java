package all;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person implements Observer{
    private String name;
    @Override
    public void update(String availability) {
        System.out.println("hello\t"+getName()+"product is now "+availability+"in store");
    }
}
