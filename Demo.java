// Custom Runtime Exception
class NavinException extends RuntimeException {
    public NavinException(String message) {
        super(message);
    }
}

public class Demo {

    // Method that throws ClassNotFoundException
    static void loadClass(String className) throws ClassNotFoundException {
        Class.forName(className);
    }

    public static void main(String[] args) {
        try {
            // Trying to load a non-existent class
            loadClass("b&n4");  // invalid class name → will fail
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Not able to find the class");

            // Optionally rethrow custom exception
            throw new NavinException("Custom: Class load failed");
        }
    }
}
