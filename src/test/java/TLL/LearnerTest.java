package TLL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LearnerTest {

    @Test
    public void learnerSubjectsTest(){
        Person person = new Person();
        String name = "Yegan";
        String surname = "James";
        String email = "yegan@example.com";
        person.setFirstName(name);
        person.setLastName(surname);
        person.setEmail(email);
        Learner learner = new Learner(person);
        String subject = "Maths";
        String subject1 = "English";
        learner.studentSubjectSelection(subject);
        learner.studentSubjectSelection(subject1);
        assertEquals("[Maths, English]",learner.subjectOfStudent().toString());
    }

    @Test
    public void learnerSubjectsTestInvalidSubject(){
        Person person = new Person();
        String name = "Yegan";
        String surname = "James";
        String email = "yegan@example.com";
        person.setFirstName(name);
        person.setLastName(surname);
        person.setEmail(email);
        Learner learner = new Learner(person);
        String subject = "Technology";
        learner.studentSubjectSelection(subject);
        assertEquals("You have not selected a languaged offered by the School",learner.studentSubjectSelection(subject));
    }
}
