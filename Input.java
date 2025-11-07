import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Input {
    public static void main(String a[]) throws IOException{
        System.out.println("Enter a number");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
        String s=bf.readLine();
        int n=Integer.parseInt(s);
        System.out.println("You entered: " + n);
    }
}
