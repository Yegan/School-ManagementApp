package TLL;

import java.util.ArrayList;

public class Learner extends Person {

    ArrayList listOfSubjects = new ArrayList();

    public String studentSubjectSelection(String subject)  {
       try{
           listOfSubjects.add(Subjects.valueOf(subject));
       } catch(Exception ex){
           return "You have not selected a languaged offered by the School";
       }
        return "You have not selected a languaged offered by the School";
    }

    public ArrayList subjectOfStudent() {
        return listOfSubjects;
    }
}


