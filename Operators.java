import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Operators {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
      
            double tip = meal_cost*tip_percent/100;
            double tax = meal_cost*tax_percent/100;
            double total_cost = meal_cost+tip+tax;
            int a = (int) Math.round(total_cost);
            System.out.println(a);
        }
    
    }
    
    public class Result {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
            double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
    
            int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
    
            int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());
    
            Operators.solve(meal_cost, tip_percent, tax_percent);
    
            bufferedReader.close();
        }
}
