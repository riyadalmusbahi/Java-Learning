package janJavaProgramming.week10.ex2;

import NovJavaProgramming.dataStructure.printShop.FileReader;
import janJavaProgramming.week9.refliction.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentsReader {

        FileReader fileReader = new FileReader();

        public List<Student> getStudents(String filePath){
            return fileReader.asStream(filePath)
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(columns -> new Student(columns[0], columns[1], Integer.valueOf(columns[2]), Integer.valueOf(columns[3]), Integer.valueOf(columns[4])))
                    .collect(Collectors.toList());
        }
    }
