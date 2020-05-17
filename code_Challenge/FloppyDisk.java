package code_Challenge;

import java.util.Scanner;

public class FloppyDisk {
	public static void main(String[] args) {
		
		int f , u , o, n;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("enter total free bytes in the disk:");
		f = sc.nextInt();
		System.out.print("enter total used bytes in the disk:");
		u = sc.nextInt();
		System.out.print("enter bytes to delete from the disk:");
		o = sc.nextInt();
		System.out.print("enter bytes to create new file in the disk:");
		n = sc.nextInt();
	
	System.out.println();
	int total_disksize = f + u ;
	System.out.println("total disk size :" + total_disksize + " MB ");
	
	int current_disksize =  total_disksize - u;
	
	System.out.println("Current disk size after using "+ u + " MB space: "  +current_disksize + " MB ");
	
	
	int size_after_delete = current_disksize + o ;
	
	System.out.println("Disk size after deleteing " + o + " MB files :" +size_after_delete + " MB ");
	
	int new_free_size = size_after_delete - n ;
	
	System.out.println("Disk free size after creating " + n +" MB new files :" +new_free_size + " MB ");
	
	}

}
