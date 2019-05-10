package TLL;

import java.util.ArrayList;

public class Learner {
    Person person;

    ArrayList listOfSubjects = new ArrayList();

    public Learner(Person person) {
        this.person = person;
    }

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


