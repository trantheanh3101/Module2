package testmvc;

// MVCPatternDemo.java
public class MVCPatternDemo {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        StudentController controller = new StudentController(view);
        controller.run();
    }
}

