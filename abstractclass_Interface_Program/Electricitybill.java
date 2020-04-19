package abstractclass_Interface_Program;

//import java.util.*;
import java.io.*;
//step -1 (create a plan abstract class)

abstract class Plan
{
	
	protected double rate;
	
	abstract void getRate();	// abstract method (no body)
	
	public void calculate_bill(int units)	//concrete method with body
	{
		System.out.println(units * rate);
		
	}	
	
}

class DomesticPlan extends Plan	//create concrete class that extends Plan abstract class
{
	public void getRate()		//override the getrate method(abstract method)
	{
		rate = 3.50 ;
	}
}

class CommercialPlan extends Plan //create concrete class that extends Plan abstract class
{
	public void getRate()		//override the getrate method(abstract method)
	
	{
		rate = 7.50 ;
	}
}

class InstitutePlan extends Plan
{
	public void getRate()
	{
		rate = 5.50 ;
	}
}

class  GetPlanFactory  //Create a GetPlanFactory to generate object of concrete classes based 
{
	public Plan getPlan(String planType) // use getPlan method t get object of type Plan.
	{
		if(planType == null)
		{
			return null ;
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN"))
		{
			return new DomesticPlan();
		}
		
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN"))
		{
			return new CommercialPlan();
		}
		
		else if(planType.equalsIgnoreCase("INSTITUTEPLAN"))
		{
			return new InstitutePlan();
		}
		return null;
	}
}

//[ Generate Bill by using the GetPlanFactory 
//to get the object of concrete classes by passing
//an information such as type of plan DOMESTICPLAN
//or COMMERCIALPLAN or INSTITUTIONALPLAN.]

public class Electricitybill 
{
	public static void main(String[] args) throws IOException
	{
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name of plan for which the bill will be generated:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		
		System.out.println("Enter the no of units for bill will be calculated:");
	
		int units = Integer.parseInt(br.readLine());
		
		Plan p= planFactory.getPlan(planName);
		
		System.out.println("Bill amount for " + planName + "of " + units + "units is:");
	
		p.getRate();
		p.calculate_bill(units);

	}

}
