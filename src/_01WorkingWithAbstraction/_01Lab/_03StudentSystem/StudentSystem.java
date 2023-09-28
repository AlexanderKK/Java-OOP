package _01WorkingWithAbstraction._01Lab._03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public void ParseCommand(String[] args) {
        String cmd = args[0];
        String name = args[1];

        if (cmd.equals("Create")) {
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);

            if (!students.containsKey(name)) {
                Student student = new Student(name, age, grade);

                students.put(name, student);
            }
        } else if (cmd.equals("Show")) {
            if (students.containsKey(name)) {
                Student currentStudent = students.get(name);

                StringBuilder strBuilder = new StringBuilder();
                strBuilder.append(String.format("%s is %s years old.", currentStudent.getName(), currentStudent.getAge()));

                if (currentStudent.getGrade() >= 5.00) {
                    strBuilder.append(" Excellent student.");
                } else if (currentStudent.getGrade() < 5.00 && currentStudent.getGrade() >= 3.50) {
                    strBuilder.append(" Average student.");
                } else {
                    strBuilder.append(" Very nice person.");
                }

                System.out.println(strBuilder);
            }
        }
    }
}
