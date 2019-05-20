package TLL;

import java.util.HashMap;

public class Notes {

    Tokens tokens;


    public Notes(Tokens tokens){
        this.tokens = tokens;
    }

    public void noteTrading(String name){
       HashMap<String, Integer> allStudents = tokens.studentsTokenTotalMap();
       for (HashMap.Entry<String, Integer> entry : allStudents.entrySet()){
        if(entry.getKey().equals(name)){
           Integer tokenAmount = entry.getValue();
           Integer studentToken = tokenAmount - 2;
           allStudents.put(name,studentToken);
          }
       }

    }
}
