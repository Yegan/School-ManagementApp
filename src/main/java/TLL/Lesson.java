package TLL;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Lesson {
    private final Subjects lessonSubject;
    ArrayList studentsAttendingLesson = new ArrayList();
    ArrayList lessonTeacher = new ArrayList();
    Teacher teacher;
    LocalDateTime now = LocalDateTime.now();

    public Lesson(Teacher teacher, Subjects lessonSubject, LocalDateTime now){
        this.teacher = teacher;
        this.lessonSubject = lessonSubject;
        this.now = now;
    }

    public void attend(Learner learner){
        try{
            int learnsSubjects = learner.subjectOfStudent().size();
            if(learnsSubjects >= 3){
                if(learner.subject(learner.listOfSubjects).equals(lessonSubject)){
                    studentsAttendingLesson.add(learner.getFirstName());
                }
            }

        }catch(Exception ex){
        ex.printStackTrace();
        }
    }
    public void teacherRegistration(Teacher teacher){
        try{

            if(teacher.subject(teacher.qualifiedSubjects).equals(lessonSubject)){
                lessonTeacher.add(teacher.getFirstName());
            };
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public ArrayList studentsOfLesson(){
        return studentsAttendingLesson;
    }

    public String startLesson(ArrayList studentsAttendingLesson){
        if(studentsAttendingLesson.size()< 5){
            return "Lesson cancelled";
        }
        return "Let's begin todays Lesson";
    }

    }
