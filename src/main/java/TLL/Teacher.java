package TLL;

import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList qualifiedSubjects = new ArrayList();



    public void setQualifiedSubjects(String subjects){
    try{
        qualifiedSubjects.add(Subjects.valueOf(subjects));
    }catch (Exception ex){
        System.out.println("You are not qualified to teach subjects at the School");
    }
    }

    public ArrayList getQualifiedSubjects(){
        return qualifiedSubjects;
    }
}
