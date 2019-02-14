package janJavaProgramming.week10.ex2;

import janJavaProgramming.week9.refliction.Student;
import janJavaProgramming.week9.refliction.StudentReader;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsManager {

    protected List<Student> students = getStudents();


    protected List<Student> getStudents() {
        return new StudentReader().getStudents("janJavaProgramming/week9/refliction/students-performance.csv");
    }


    protected List<String> countAndSortParentEduLevel(List<Student> students) {
        return students.stream()
                .map(e -> e.getParentalEduLevel())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() + "|" + e.getKey())
                .collect(Collectors.toList());
    }

    protected Long getAmountStudentsHighParentEduAndLowScore(List<Student> students) {
        return students.stream()
                .filter(e -> e.getParentalEduLevel().equalsIgnoreCase("master's degree"))
                .filter(e -> e.getWritingScore() < 60)
                .filter(e -> e.getReadingScore() < 60)
                .filter(e -> e.getMathScore() < 60)
                .count();
    }

    protected Integer getAverageScore(Student student) {
        Integer averageScore = 0;
        averageScore = averageScore + student.getMathScore() + student.getWritingScore() + student.getReadingScore();
        averageScore = averageScore / 3;
        return averageScore;
    }

    protected Boolean isThereMoreThan95ScoreAndHighSchoolParentEdu(List<Student> students){
        return students.stream()
                .anyMatch(e-> e.getParentalEduLevel().equalsIgnoreCase("some high school") && e.getReadingScore() >= 95 && e.getWritingScore() >= 95 && e.getMathScore() >= 95);


    }

}
