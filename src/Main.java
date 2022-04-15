import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> familyMems = new HashMap<>();

        familyMems.put("Cristian", 2006);
        familyMems.put("Cathy", 1955);
        familyMems.put("Anne", 1980);
        familyMems.put("Buster", 2011);
        familyMems.put("Jose", 1975);
        familyMems.put("Luca", 2004);
        familyMems.put("Marina", 1998);
        familyMems.put("Michelle", 1977);

        System.out.println(familyMems);

        for (String i: familyMems.keySet()){
            System.out.println(i + ": " + familyMems.get(i));
        }

    }
}
