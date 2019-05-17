package TLL;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
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
        learner.studentSubjectSelection(Subjects.English);
        learner.studentSubjectSelection(Subjects.Accounting);

        Learner learner1 = new Learner();
        learner1.setFirstName("Andre");
        learner1.studentSubjectSelection(Subjects.Maths);
        learner1.studentSubjectSelection(Subjects.English);
        learner1.studentSubjectSelection(Subjects.Accounting);


        lesson.attend(learner);
        lesson.attend(learner1);
        lesson.teacherRegistration(teacher);

        Enum maths = Subjects.Maths;
        Enum english = Subjects.English;

        assertEquals(Arrays.asList("Richard", "Andre"), lesson.studentsOfLesson());
        assertEquals(Arrays.asList(maths, english),teacher.getQualifiedSubjects() );
        assertEquals("Lesson cancelled", lesson.startLesson(lesson.studentsAttendingLesson));
    }
    @Test
    public void lesson2Test(){
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
        learner.studentSubjectSelection(Subjects.English);
        learner.studentSubjectSelection(Subjects.Accounting);

        Learner learner1 = new Learner();
        learner1.setFirstName("Andre");
        learner1.studentSubjectSelection(Subjects.Maths);
        learner1.studentSubjectSelection(Subjects.English);
        learner1.studentSubjectSelection(Subjects.Accounting);

        Learner learner2 = new Learner();
        learner2.setFirstName("Alice");
        learner2.studentSubjectSelection(Subjects.Maths);
        learner2.studentSubjectSelection(Subjects.English);
        learner2.studentSubjectSelection(Subjects.Accounting);

        Learner learner3 = new Learner();
        learner3.setFirstName("Busisile");
        learner3.studentSubjectSelection(Subjects.Maths);
        learner3.studentSubjectSelection(Subjects.English);
        learner3.studentSubjectSelection(Subjects.Accounting);

        Learner learner4 = new Learner();
        learner4.setFirstName("Paul");
        learner4.studentSubjectSelection(Subjects.Maths);
        learner4.studentSubjectSelection(Subjects.English);
        learner4.studentSubjectSelection(Subjects.Accounting);

        lesson.attend(learner);
        lesson.attend(learner1);
        lesson.attend(learner2);
        lesson.attend(learner3);
        lesson.attend(learner4);

        lesson.teacherRegistration(teacher);

        assertEquals("Let's begin todays Lesson", lesson.startLesson(lesson.studentsAttendingLesson));
    }
}
