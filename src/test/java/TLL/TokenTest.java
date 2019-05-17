package TLL;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TokenTest {
    @Test
    public void tokenTest1(){
        Teacher teacher = new Teacher();
        Lesson lesson = new Lesson(teacher, Subjects.Maths, LocalDateTime.now());
        Tokens tokens = new Tokens();

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
        tokens.getStudentLesson(lesson);
        tokens.getTeacherLesson(lesson);

        assertEquals("{Yegan=5}", tokens.teacherMap().toString());
        assertEquals("{Alice=3, Richard=3, Busisile=3, Andre=3, Paul=3}",tokens.studentsTokenTotalMap().toString());
    }


}
