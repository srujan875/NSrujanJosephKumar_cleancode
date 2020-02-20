package Epam.Task3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SimpleInterestCalculation {

	  public void simpleInterest(double principalAmount,double rateOfInterest,double years) throws IOException
	   {
		   
		   double simpleInterest=(principalAmount*rateOfInterest*years)/100;
		   
		   BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
	       br.write(simpleInterest+"");
	       
//	       br.flush();
	       br.close();
	   }
}
