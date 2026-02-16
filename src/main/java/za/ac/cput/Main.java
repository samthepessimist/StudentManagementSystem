package za.ac.cput;

import za.ac.cput.domain.GraduateStudent;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.UndergraduateStudent;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student undergrad = new UndergraduateStudent.Builder("231116144", "Samukelo Ndlela",
                "samukelondlela2.0@gmail.com", "IT").creditHours(10).scholarshipAmount(100000).build();
        undergrad.displayDetails();

        Student grad = new GraduateStudent.Builder("111222", "Amu",
                "amu@gmail.com", "Accounting").stipend(5000).researchAssistant(true).build();
        grad.displayDetails();
    }
}