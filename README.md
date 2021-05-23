Top! Du kontrollierst aber nicht folgendes:
Create Student class with name and grade (this is an int in the *range 0-100*)

 ```java

//Ich kann dann auch ein Studenten erstellen mit grade = 0, oder -10.
 public void setGrade(int grade) {
         if (grade < 100) {
             this.grade = grade;
         }else {
             this.grade=100;
         }
     }


    //Alternative
    public void setGrade(int grade) {
            if(grade < 0) {
                throw new IllegalArgumentException("Grade lower than 0");
            } else if (grade < 100) {
                this.grade = grade;
            }else {
                this.grade=100;
            }
        }


  ```