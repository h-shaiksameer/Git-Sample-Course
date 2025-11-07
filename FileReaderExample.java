import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        BufferedReader br = null;

        try 
        {
            // Try to open and read file
            br = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Line: " + line);
            }

        } 
        
        catch (FileNotFoundException e) {
            System.out.println("❌ File not found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("❌ IO error: " + e.getMessage());

        } finally {
            try {
                if (br != null) {
                    br.close();  // ✅ Always executed
                    System.out.println("✅ BufferedReader closed");
                }
            } catch (IOException e) {
                System.out.println("❌ Failed to close BufferedReader");
            }
        }
    }
}
