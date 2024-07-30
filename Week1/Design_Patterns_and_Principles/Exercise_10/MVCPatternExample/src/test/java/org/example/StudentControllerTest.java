package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class StudentControllerTest {

    @Test
    public void test() {
        StudentController controller = new StudentController(new Student(), new StudentView());
        controller.setSGrade("Test Grade");
        controller.setSId("Test Id");
        controller.setSName("Test Name");

        //displaying the details

        controller.updateView();
    }

}