public class App {

    public static void main(String[] args) {

        // Hardcoded password - SonarQube should flag this
        String password = "Admin@123";

        // Unused variable
        String username = "admin";

        int a = 10;
        int b = 0;

        // Potential division by zero
        int result = a / b;

        System.out.println("Result: " + result);

        // Duplicate code
        printMessage();
        printMessage();

        // Empty catch block
        try {
            String text = null;
            System.out.println(text.length());
        } catch (Exception e) {
        }
    }

    public static void printMessage() {
        System.out.println("Hello World");
        System.out.println("This is a test application");
    }

    // Never-used function
    public static void neverUsedFunction() {
        System.out.println("This function is never called.");
    }
}
