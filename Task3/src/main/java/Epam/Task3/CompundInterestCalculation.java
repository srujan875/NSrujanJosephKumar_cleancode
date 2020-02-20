package Epam.Task3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CompundInterestCalculation {

	public void compoundInterest(double principalAmount,double rateOfInterest,double years) throws IOException
	{
		double Amount=Math.pow((1+(rateOfInterest/100)),years);
		double compoundInterest=Amount*principalAmount;
		
		PrintWriter writer=new PrintWriter(new OutputStreamWriter(System.out));
	       writer.println(compoundInterest);
	       writer.close();
	    
	}
}
