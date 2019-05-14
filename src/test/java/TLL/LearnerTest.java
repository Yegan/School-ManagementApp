package TLL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LearnerTest {

    @Test
    public void learnerSubjectsTest(){
        String name = "Yegan";
        String surname = "James";
        String email = "yegan@example.com";
        Learner learner = new Learner();
        learner.setEmail(email);
        learner.setFirstName(name);
        learner.setLastName(surname);
        String subject = "Maths";
        String subject1 = "English";
        learner.studentSubjectSelection(subject);
        learner.studentSubjectSelection(subject1);
        assertEquals("[Maths, English]",learner.subjectOfStudent().toString());
    }

    @Test
    public void learnerSubjectsTestInvalidSubject(){
        String name = "Yegan";
        String surname = "James";
        String email = "yegan@example.com";
        Learner learner = new Learner();
        learner.setFirstName(name);
        learner.setLastName(surname);
        learner.setEmail(email);
        String subject = "Technology";
        learner.studentSubjectSelection(subject);
        assertEquals("You have not selected a languaged offered by the School",learner.studentSubjectSelection(subject));
    }


}
