package Lab206;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public void setGrade(int grade) {
        if (grade < 100) {
            this.grade = grade;
        }else {
            this.grade=100;
        }
    }
    public void setGradePlus10Percent() {
        Double big = this.grade+this.grade*0.1;
        int big2 = big.intValue();
        if (big2 < 100) {
            this.grade = big2;
        }else {
            this.grade=100;
        }
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
