package TLL;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessonTest {
    @Test
    public void lesson1Test(){
        Teacher teacher = new Teacher();
        Lesson lesson = new Lesson(teacher, Subjects.Maths, LocalDateTime.now());
        teacher.setFirstName("Yegan");
        teacher.setQualifiedSubjects(Subjects.Maths);
        teacher.setQualifiedSubjects(Subjects.English);

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
        lesson.teacherRegistration(teacher);

        Enum maths = Subjects.Maths;
        Enum english = Subjects.English;

        assertEquals(Arrays.asList("Richard", "Andre"), lesson.studentsOfLesson());
        assertEquals(Arrays.asList(maths, english),teacher.getQualifiedSubjects() );
        assertEquals("Lesson cancelled", lesson.startLesson(lesson.studentsAttendingLesson));
    }
}
