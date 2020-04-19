package classProject;

import java.util.*;
public class String1 
{
	public static void main(String[] args)
	{
		String name= "Rahul-dey-anshu";
		System.out.println(name.charAt(8));
		System.out.println(name.substring(2,9));
		System.out.println(name.contains("dey"));
		
		String cars ="Hyundai, Maruti , Swift ,Ferrri";
		String allcars[] = cars.split(",");
		for(String car:allcars)
		{
			System.out.println(car);
		}
		
		
	}

}
