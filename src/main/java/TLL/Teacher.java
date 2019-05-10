package TLL;

import java.util.ArrayList;

public class Teacher {
    Person person;
    ArrayList qualifiedSubjects = new ArrayList();

    public Teacher(Person person){
        this.person = person;
    }

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
