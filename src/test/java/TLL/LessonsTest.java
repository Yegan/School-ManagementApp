package TLL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessonsTest {
    @Test
    public void lesson1Test(){
        Teacher teacher = new Teacher();
        teacher.setFirstName("Yegan");
        teacher.setQualifiedSubjects("Maths");
        teacher.setQualifiedSubjects("English");

        Learner learner = new Learner();
        learner.setFirstName("Richard");
        String Richard =  learner.getFirstName();
        String RichardSubject = learner.studentSubjectSelection("Maths");

        learner.setFirstName("Nat");
        String Nat = learner.getFirstName();
        String NatSubject = learner.studentSubjectSelection("Maths");

        learner.setFirstName("Mzwa");
        String Mzwa = learner.getFirstName();
        String MzwaSubject = learner.studentSubjectSelection("Maths");

        Lessons lessons = new Lessons(teacher,);

        assertEquals("Richard", Richard);
        assertEquals("Nat",  Nat);

    }
}
