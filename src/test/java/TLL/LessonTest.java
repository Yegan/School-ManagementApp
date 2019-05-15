package TLL;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessonTest {
    @Test
    public void lesson1Test(){
        Teacher teacher = new Teacher();
        Lesson lesson = new Lesson(teacher, Subjects.Maths);
        teacher.setFirstName("Yegan");
        teacher.setQualifiedSubjects("Maths");
        teacher.setQualifiedSubjects("English");

        Learner learner = new Learner();
        learner.setFirstName("Richard");
        learner.setLastName("Ross");
        learner.setEmail("richard@example.com");
        learner.studentSubjectSelection(Subjects.Maths);

        Learner learner1 = new Learner();
        learner1.setFirstName("Andre");
        learner1.studentSubjectSelection(Subjects.Maths);

        lesson.attend(learner);
        lesson.attend(learner1);
        assertEquals(Arrays.asList("Richard", "Andre"), lesson.studentsOfLesson());

    }
}
