package janJavaProgramming.week9.refliction;

public class Student {

    private String gender, parentalEduLevel;
    private Integer mathScore, readingScore, writingScore, averageScore;

    public Student(String gender, String parentalEduLevel, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.parentalEduLevel = parentalEduLevel;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
        this.averageScore = averageScore;

    }


    public Integer getAverageScore(){
        return mathScore + readingScore + writingScore /3;
    }

    public String getGender() {
        return gender;
    }

    public String getParentalEduLevel() {
        return parentalEduLevel;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }


    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", parentalEduLevel='" + parentalEduLevel + '\'' +
                ", mathScore=" + mathScore +
                ", readingScore=" + readingScore +
                ", writingScore=" + writingScore +
                '}';
    }
}
