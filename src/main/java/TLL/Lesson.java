package TLL;

import java.util.ArrayList;
import java.util.HashMap;

public class Lesson {
    private final Subjects lessonSubject;
    ArrayList studentsAttendingLesson = new ArrayList();
    ArrayList lessonTeacher = new ArrayList();
    Teacher teacher;

    public Lesson(Teacher teacher, Subjects lessonSubject){
        this.teacher = teacher;
        this.lessonSubject = lessonSubject;
    }

    public void attend(Learner learner){
        try{
            if(learner.subject(learner.listOfSubjects).equals(lessonSubject)){
                    studentsAttendingLesson.add(learner.getFirstName());
            }

        }catch(Exception ex){
        ex.printStackTrace();
        }
    }
//    public void teacherRegistration(Subjects subjects){
//        try{
//            String name = teacher.getFirstName();
//            String qualifcation = teacher.getQualifiedSubjects().toString();
//
//            if(learner.subject(learner.listOfSubjects).equals(qualifcation)){
//                lessonTeacher.add(qualifcation);
//            };
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
    public ArrayList studentsOfLesson(){
        return studentsAttendingLesson;
    }

    }
