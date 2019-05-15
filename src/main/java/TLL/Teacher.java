package TLL;

import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList qualifiedSubjects = new ArrayList();

    public void setQualifiedSubjects(Subjects subject){
    try{
        qualifiedSubjects.add(subject);
    }catch (Exception ex){
        System.out.println("You are not qualified to teach subjects at the School");
    }
    }

    public ArrayList getQualifiedSubjects(){
        return qualifiedSubjects;
    }

    public Enum subject(ArrayList qualifiedSubjects){
        if(qualifiedSubjects.contains(Subjects.Maths)){
            return Subjects.Maths;
        }if(qualifiedSubjects.contains(Subjects.English)){
            return Subjects.English;
        }if(qualifiedSubjects.contains(Subjects.Accounting)){
            return Subjects.Accounting;
        }if(qualifiedSubjects.contains(Subjects.Biology)){
            return Subjects.Biology;
        }if(qualifiedSubjects.contains(Subjects.Economics)){
            return Subjects.Economics;
        }if(qualifiedSubjects.contains(Subjects.Physics)){
            return Subjects.Physics;
        }
        return Subjects.Xhosa;
    }
}
