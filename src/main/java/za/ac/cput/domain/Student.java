package za.ac.cput.domain;

public abstract class Student {
    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    public abstract double calculateTuition();
    public abstract String getStudentType();

    public void displayDetails(){
        System.out.println(this.toString());
        System.out.println("Student Type: " + getStudentType());
        System.out.println("Tuition: " + calculateTuition());
    };
}
