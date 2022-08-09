package overloadingexample;

public class Student {
    
    private String studentId;
    private boolean studentEnrolledInElectivate;
    private int[] studentMarks;
    private int studentSubjects;

    public Student(String studentId, boolean studentEnrolledInElectivate, int studentSubjects) {
        this.studentId = studentId;
        this.studentEnrolledInElectivate = studentEnrolledInElectivate;
        this.studentSubjects = studentSubjects;
    }


    public Student(String studentId, boolean studentEnrolledInElectivate, int[] studentMarks, int studentSubjects) {
        this.studentId = studentId;
        this.studentEnrolledInElectivate = studentEnrolledInElectivate;
        this.studentMarks = studentMarks;
        this.studentSubjects = studentSubjects;
    }
    public static void main(String[] args) {
       int[] arr = new int []{1,2,3,4,5}
       Student s1 = new Student("st01", false, new int[]{12,13,14,55,55}, 5);
       Studemt s2 = new Student("st02", true, 5);
       s2.setstudentMarks(new int[]{12,23,34,45,56});
       
    }
}
