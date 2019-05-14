package TLL;

import java.util.ArrayList;
import java.util.HashMap;

public class Lessons {
//    HashMap<Learner,Subjects > subjectsStudentHashMap = new HashMap<>();
//    HashMap<Teacher, Subjects> subjectsTeachersHashMap = new HashMap<>();
    ArrayList learners = new ArrayList();
    Teacher teacher;

    public Lessons(Teacher teacher, Subjects subjects){
    this.teacher = teacher;
    }

    public void acceptLearners(Learner learner){
     learners.add(learner);
    }

    public int numberOfStudentsForTheLesson(){
        return learners.size();
    }

    public String lessonSubject(Subjects subjects){

    }

    }
