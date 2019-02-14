package janJavaProgramming.week9.refliction;

import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {

    private List<Student> students = getStudents();

    private List<Student> getStudents() {
        return new StudentReader().getStudents("janJavaProgramming/week9/refliction/students-performance.csv");
    }


    public List<Student> allStudents = students;

    public List<Student> femaleStudents = students.stream()
            .filter(student -> student.getGender().equalsIgnoreCase("female"))
            .collect(Collectors.toList());

    public List<Student> maleStudents = students.stream()
            .filter(e -> e.getGender().equalsIgnoreCase("male"))
            .collect(Collectors.toList());


    public List<String> parentalEdulevel = students.stream()
            .map(student -> student.getParentalEduLevel())
            .distinct()
            .sorted()
            .collect(Collectors.toList());


    public Long studentsHigherthan90 = students.stream()
            .filter(e-> e.getMathScore()>90)
            .filter(e-> e.getReadingScore()> 90)
            .filter(e-> e.getWritingScore()> 90)
            .count();


    public Long studentsHighestScore = students.stream()
            .filter(e-> e.getMathScore().equals(100))
            .filter(e-> e.getReadingScore().equals(100))
            .filter(e-> e.getWritingScore().equals(100))
            .count();

   public List<String> topStudents = students.stream()
           .filter(e-> e.getMathScore().equals(100))
           .filter(e-> e.getReadingScore().equals(100))
           .filter(e-> e.getWritingScore().equals(100))
           .map(e-> e.getGender())
           .collect(Collectors.toList());




}
