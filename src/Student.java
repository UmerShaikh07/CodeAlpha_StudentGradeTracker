package StudentGradeTrackerGui;

public class Student {

    private String name;
    private double subject1;
    private double subject2;
    private double subject3;

    public Student(String name, double subject1, double subject2, double subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public String getName() {
        return name;
    }

    public double getSubject1() {
        return subject1;
    }

    public double getSubject2() {
        return subject2;
    }

    public double getSubject3() {
        return subject3;
    }

    public double getAverage() {
        return (subject1 + subject2 + subject3) / 3;
    }

    public String getGrade() {

        double average = getAverage();

        if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public String getStatus() {

        if (getAverage() >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}