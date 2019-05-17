package TLL;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Tokens {
    Learner learner;
    HashMap<String,Integer> studentTokenMap = new HashMap<>();
    HashMap<String,Integer> teacherTokenMap = new HashMap<>();


    public void getStudentLesson(Lesson lesson){
        try{
            ArrayList<String> students = lesson.studentsAttendingLesson;
            for (int i =0; i<students.size();i++){
             studentTokenMap.put(students.get(i),3);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public HashMap studentsTokenTotalMap(){
        return studentTokenMap;
    }

}
