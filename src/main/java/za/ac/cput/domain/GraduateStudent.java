package za.ac.cput.domain;

import java.util.StringJoiner;

public class GraduateStudent extends Student{
    protected boolean researchAssistant;
    protected double stipend;

    private GraduateStudent(Builder builder){
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public String toString(){
        StringJoiner joiner = new StringJoiner(", ", "Graduate Student{", "}");
        joiner.add("id= " + this.studentId);
        joiner.add("name= " + this.name);
        joiner.add("email= " + this.email);
        joiner.add("department= " + this.department);

        if (researchAssistant){
            joiner.add("researchAssistant= " + this.researchAssistant);
        }
        if (stipend > 0){
            joiner.add("stipend= " + this.stipend);
        }
        return joiner.toString();
    }
    @Override
    public double calculateTuition() {
        double base = 40000;

        if (researchAssistant){
            return base - stipend;
        }
        return base;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    public static class Builder{
        private final String studentId;
        private final String name;
        private final String email;
        private final String department;

        private boolean researchAssistant;
        private double stipend;

        public Builder(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }


        public Builder researchAssistant( boolean researchAssistant){
            this.researchAssistant = researchAssistant;
            return this;
        }
        public Builder stipend(double stipend){
            this.stipend = stipend;
            return this;
        }
        public GraduateStudent build(){
            return new GraduateStudent(this);
        }
    }
}
