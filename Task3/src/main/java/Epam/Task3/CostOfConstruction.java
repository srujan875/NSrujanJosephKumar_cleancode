package Epam.Task3;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
public class CostOfConstruction {

	
	public void costValue() throws IOException
	{
		Scanner scanner=new Scanner(System.in);
		
		String materialType=scanner.nextLine();
		
		double area=scanner.nextDouble();
	   
		scanner.close();
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	       
		if(materialType.equalsIgnoreCase("standard materials"))
		{
			br.write((1200*area)+" ");
		}
		else if(materialType.equalsIgnoreCase("above standard materials"))
		{
			br.write(1500*area+" ");
		}
		else if(materialType.equalsIgnoreCase("high standard materials"))
		{
			br.write(1800*area+" ");
		}
		else if(materialType.equalsIgnoreCase("high standard and fully automated"))
		{
			br.write(2500*area+" ");
		}
		
		br.close();
		
	
	}
}
