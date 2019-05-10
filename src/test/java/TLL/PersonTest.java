package TLL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void personTest(){
        Person person = new Person();

        String name = "Yegan";
        String surname = "James";
        String email = "yegan@example.com";

        person.setFirstName(name);
        person.setLastName(surname);
        person.setEmail(email);

        assertEquals("Yegan",person.getFirstName());
        assertEquals("James",person.getLastName());
        assertEquals("yegan@example.com",person.getEmail());
    }
}
