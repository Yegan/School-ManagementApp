package TLL;

import java.util.ArrayList;

public class Learner extends Person {

  public ArrayList listOfSubjects = new ArrayList();

    public String studentSubjectSelection(Subjects subject)  {
       try{
           listOfSubjects.add(subject);
       } catch(Exception ex){
           return "You have not selected a languaged offered by the School";
       }
        return "You have not selected a languaged offered by the School";
    }

    public ArrayList subjectOfStudent() {
        return listOfSubjects;
    }
    public Enum subject(ArrayList listOfSubjects){
        if(listOfSubjects.contains(Subjects.Maths)){
            return Subjects.Maths;
        }if(listOfSubjects.contains(Subjects.English)){
            return Subjects.English;
        }if(listOfSubjects.contains(Subjects.Accounting)){
            return Subjects.Accounting;
        }if(listOfSubjects.contains(Subjects.Biology)){
            return Subjects.Biology;
        }if(listOfSubjects.contains(Subjects.Economics)){
            return Subjects.Economics;
        }if(listOfSubjects.contains(Subjects.Physics)){
            return Subjects.Physics;
        }
        return Subjects.Xhosa;

    }

}


