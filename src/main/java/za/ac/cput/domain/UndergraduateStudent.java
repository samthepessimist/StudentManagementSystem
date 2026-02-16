package za.ac.cput.domain;

import java.util.StringJoiner;

public class UndergraduateStudent extends Student{
    protected double creditHours;
    protected double scholarshipAmount;

    private UndergraduateStudent(Builder builder){
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double base = creditHours * 1500;
        return scholarshipAmount - base;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }
    @Override
    public String toString(){
        StringJoiner joiner = new StringJoiner(", ", "Undergraduate Student{", "}");
        joiner.add("id= " + this.studentId);
        joiner.add("name= " + this.name);
        joiner.add("email= " + this.email);
        joiner.add("department= " + this.department);

        if (this.creditHours > 0){
            joiner.add("creditHours= " + this.creditHours);
        }
        if (scholarshipAmount > 0){
            joiner.add("scholarshipAmount= " + this.scholarshipAmount);
        }
        return joiner.toString();
    }
    public static class Builder{
        private final String studentId;
        private final String name;
        private final String email;
        private final String department;

        private double creditHours;
        private double scholarshipAmount;


        public Builder(String studentId, String name, String email,  String department){
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }
        public Builder creditHours(double creditHours){
            this.creditHours = creditHours;
            return this;
        }
        public Builder scholarshipAmount(double scholarshipAmount){
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }
        public UndergraduateStudent build(){
            return new UndergraduateStudent(this);
        }
    }
}
