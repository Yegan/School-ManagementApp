package TLL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {

    @Test
    public void teacherSubjectQualification(){
        Person person = new Person();
        String teacherName = "Yegan";
        String teacherSurname = "James";
        String teacherEmail = "yegan@example.com";
        String teachingSubject = "English";
        String teachingSubject1 = "Maths";
        person.setLastName(teacherSurname);
        person.setFirstName(teacherName);
        person.setEmail(teacherEmail);

        Teacher teacher = new Teacher(person);
        teacher.setQualifiedSubjects(teachingSubject);
        teacher.setQualifiedSubjects(teachingSubject1);
        assertEquals("[English, Maths]",teacher.getQualifiedSubjects().toString());
    }

    @Test
    public void teacherSubjectNoQualification(){
        Person person = new Person();
        String teacherName = "Yegan";
        String teacherSurname = "James";
        String teacherEmail = "yegan@example.com";
        String teachingSubject = "Science";
        String teachingSubject1 = "Technology";

        person.setLastName(teacherSurname);
        person.setFirstName(teacherName);
        person.setEmail(teacherEmail);

        Teacher teacher = new Teacher(person);
        teacher.setQualifiedSubjects(teachingSubject1);
        teacher.setQualifiedSubjects(teachingSubject);
        assertEquals("[]",teacher.getQualifiedSubjects().toString());
    }
}
