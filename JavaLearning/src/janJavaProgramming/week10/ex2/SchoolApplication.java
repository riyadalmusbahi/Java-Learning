package janJavaProgramming.week10.ex2;


import janJavaProgramming.week9.refliction.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SchoolApplication {

    public static void main(String[] args) {
        StudentsReader studentsReader = new StudentsReader();

        StudentsManager studentsManager = new StudentsManager();
        List<Student> students = studentsReader.getStudents("janJavaProgramming/week9/refliction/students-performance.csv");

        studentsManager.countAndSortParentEduLevel(students).stream()
                .forEach(e -> System.out.println(e));

        Long amountStudentsHighParentEduAndLowScore =
                studentsManager.getAmountStudentsHighParentEduAndLowScore(students);
        System.out.println("Number of students with high parent education and lower score than 60: "
                + amountStudentsHighParentEduAndLowScore);


        List<String> averageScoreWithGender = studentsManager.students.stream()
                .map(e -> (e.getMathScore() + e.getWritingScore()+ e.getReadingScore() /3)+ " | " + e.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("The students with the highest average score with their genders is: " + averageScoreWithGender);

        if (studentsManager.isThereMoreThan95ScoreAndHighSchoolParentEdu(students)){
            System.out.println("Is there any student with a parent education level of some high school that has at least 97 in every topic?" + " " + studentsManager.isThereMoreThan95ScoreAndHighSchoolParentEdu(students));
        }else {
            System.out.println("There are no students that meet those requirments");
        }
    }
}
