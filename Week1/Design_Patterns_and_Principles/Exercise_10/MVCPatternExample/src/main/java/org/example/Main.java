package org.example;

class Student{
    String name;
    String id;
    String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }


}

class StudentView{
    public void display(String studentName, String studentId, String studentGrade){
        System.out.println("Student Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Id No: " + studentId);
        System.out.println("Grade No: " + studentGrade);
    }
}

class StudentController{
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setSName(String name) {
        model.setName(name);
    }

    public String getSName() {
        return model.getName();
    }
    public void setSId(String id) {
        model.setId(id);
    }
    public String getSId() {
        return model.getId();
    }
    public void setSGrade(String grade) {
        model.setGrade(grade);
    }
    public String getSGrade() {
        return model.getGrade();
    }
    public void updateView() {
        view.display(model.getName(), model.getId(), model.getGrade());
    }


}

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController(new Student(), new StudentView());
        controller.setSGrade("A");
        controller.setSId("10");
        controller.setSName("John");

        //displaying the details

        controller.updateView();





    }
}