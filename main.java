import java.io.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception{
        File output = new File("output.txt");
        output.createNewFile();
        PrintWriter writer = new PrintWriter(output);
        Scanner sc = new Scanner(new File("input.txt"));
        String line = "";
        while (sc.hasNextLine()) {
            System.out.println(line);
            try {
                line = sc.nextLine();
                String[] s = line.split(" ");
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
                writer.println(line + " = " + result);
            } catch (NumberFormatException e) {
                writer.println(line + " = " + "Error! Not number");
            } catch (Exception e) {
                writer.println(line + " = " + e.getMessage());
            }
        }
        writer.close();
    }
}

