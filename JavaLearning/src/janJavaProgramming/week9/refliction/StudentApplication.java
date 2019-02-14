package janJavaProgramming.week9.refliction;

import java.util.List;

public class StudentApplication {

    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();


        List<Student> allStudents = studentManager.allStudents;
        System.out.println("all students in total are: " + allStudents.size());


        List<Student> femaleStudents = studentManager.femaleStudents;
        System.out.println("female students in total are: " + femaleStudents.size());

        List<Student> maleStudents = studentManager.maleStudents;
        System.out.println("male students in total are: " + maleStudents.size());

        List<String> parentalEduLevel = studentManager.parentalEdulevel;
        System.out.println("Parental educational backgrounds sorted alphabatically are : " + parentalEduLevel);

        Long studentsHigherThan90 = studentManager.studentsHigherthan90;
        System.out.println("Students that scored more than ninty in all subjects are the total of : " + studentsHigherThan90);


        Long studentswithFullScore = studentManager.studentsHighestScore;
        System.out.println("Students that got 100 in all subjects are total of: " + studentswithFullScore);

        List<String> topStudents = studentManager.topStudents;
        System.out.println("The genders of the students who got full score are : " + topStudents);





    }
}
