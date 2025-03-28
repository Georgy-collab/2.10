import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            String[] s = sc.nextLine().split(" ");
            double result = 0;
            double a = Double.parseDouble(s[0]);
            double b = Double.parseDouble(s[2]);
            if ("+".equals(s[1])) {
                result = a + b;
            } else if ("-".equals(s[1])) {
                result = a - b;
            } else if ("*".equals(s[1])) {
                result = a * b;
            } else if ("/".equals(s[1])) {
                result = a / b;
            } else {
                throw new Exception("Operation Error!");
            }
            if ((Double.parseDouble(s[2]) == 0) & ("/".equals(s[1]))) {
                throw new Exception("Error! Division by zero");
            }
            System.out.println(result);
        }
        catch (NumberFormatException e) {
            System.out.println("Error! Not number");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

