package TLL;

import org.junit.jupiter.api.Test;

import static TLL.Subjects.Maths;
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
        learner.studentSubjectSelection(Maths);
        learner.studentSubjectSelection(Subjects.English);
        learner.studentSubjectSelection(Subjects.Accounting);
        Enum maths = Maths;
        assertEquals(maths, learner.subject(learner.listOfSubjects));
        assertEquals("[Maths, English, Accounting]",learner.subjectOfStudent().toString());
        assertEquals(3, learner.listOfSubjects.size());
    }

//    @Test
//    public void learnerSubjectsTestInvalidSubject(){
//        String name = "Yegan";
//        String surname = "James";
//        String email = "yegan@example.com";
//        Learner learner = new Learner();
//        learner.setFirstName(name);
//        learner.setLastName(surname);
//        learner.setEmail(email);
//        learner.studentSubjectSelection(Subjects.valueOf("Technology"));
//        assertEquals("You have not selected a languaged offered by the School",learner.studentSubjectSelection(Subjects.valueOf("Technology")));
//    }


}
