package TLL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {

    @Test
    public void teacherSubjectQualification(){
        String teacherName = "Yegan";
        String teacherSurname = "James";
        String teacherEmail = "yegan@example.com";
    //    String teachingSubject = "English";
   //     String teachingSubject1 = "Maths";
        Teacher teacher = new Teacher();
        teacher.setEmail(teacherEmail);
        teacher.setFirstName(teacherName);
        teacher.setLastName(teacherSurname);
        teacher.setQualifiedSubjects(Subjects.English);
        teacher.setQualifiedSubjects(Subjects.Maths);
        assertEquals("[English, Maths]",teacher.getQualifiedSubjects().toString());
    }

//    @Test
//    public void teacherSubjectNoQualification(){
//        String teacherName = "Yegan";
//        String teacherSurname = "James";
//        String teacherEmail = "yegan@example.com";
//        String teachingSubject = "Science";
//        String teachingSubject1 = "Technology";
//
//        Teacher teacher = new Teacher();
//        teacher.setFirstName(teacherName);
//        teacher.setLastName(teacherSurname);
//        teacher.setEmail(teacherEmail);
//        teacher.setQualifiedSubjects(teachingSubject1);
//        teacher.setQualifiedSubjects(teachingSubject);
//        assertEquals("[]",teacher.getQualifiedSubjects().toString());
//    }
}
