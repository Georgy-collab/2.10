import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception{
        File output = new File("output.txt");
        output.createNewFile();
        PrintWriter writer = new PrintWriter(output);
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
            writer.println(result);
        }
        catch (NumberFormatException e) {
            writer.println("Error! Not number");
        }
        catch (Exception e) {
            writer.println(e.getMessage());
        }
        finally {
            writer.close();
        }

    }
}

