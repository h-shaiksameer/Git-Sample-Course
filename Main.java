import java.io.*;

// Step 1: Make the class Serializable
class Employee implements Serializable {
    int id;
    String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}





public class Main {
    public static void main(String[] args) throws Exception {

        // Step 2: Create an object
        Employee emp1 = new Employee(101, "Sameer");

        // Step 3: Serialize the object to a file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        out.writeObject(emp1);
        out.close();
        System.out.println("Object Serialized");

        // Step 4: Deserialize the object from the file
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee emp2 = (Employee) in.readObject();
        in.close();

        // Step 5: Print the deserialized data
        System.out.println("Deserialized Object:");
        System.out.println("ID: " + emp2.id);
        System.out.println("Name: " + emp2.name);
    }
}
