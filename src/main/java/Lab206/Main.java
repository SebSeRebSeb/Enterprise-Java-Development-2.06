package Lab206;


import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> studentlist = new HashMap<>();
        studentlist.put("frank", new Student("Frank Neumann", 50));
        studentlist.put("stephan", new Student("Stephan Bergmann", 60));
        studentlist.put("frauke", new Student("Frauke Zaunmann", 20));
        studentlist.put("melinda", new Student("Melinda Sandmann", 80));

        studentlist.get("frank").setGrade(32);
        add10PercentMark(studentlist);
        System.out.println(studentlist.get("frank").getGrade());
    }
    public static HashMap<String,Student> add10PercentMark(HashMap<String, Student> a){

        for (Map.Entry person: a.entrySet()){
            a.get(person.getKey()).setGradePlus10Percent();
        }
        return a;
    }
}
