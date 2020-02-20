package Epam.Task3;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       Scanner sc = new Scanner(System.in);
       double amount=  sc.nextDouble();
       double rateOfInterest=sc.nextDouble();
       double years=sc.nextDouble();
       
       // object for SimpleInterestCalculation class
       SimpleInterestCalculation simpleInterest=new SimpleInterestCalculation();
       simpleInterest.simpleInterest(amount, rateOfInterest, years);
       
       //object for CompoundInterestCalculation
     CompundInterestCalculation compoundInterest=new CompundInterestCalculation();
     compoundInterest.compoundInterest(amount, rateOfInterest, years);
       
    }
    
    
}
