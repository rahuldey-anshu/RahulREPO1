package classProject;

import java.io.File;

public class DiskUsage {

	public static void main(String[] args) {
		
		File cDrive = new File("D:");
		
		System.out.println(String.format("Total Space : %.2f GB",(double)cDrive.getTotalSpace()/1073741824));
		
		System.out.println(String.format("Free Space : %.2f GB",(double)cDrive.getFreeSpace()/1073741824));
		
		System.out.println(String.format("Total Space : %.2f GB",(double)cDrive.getUsableSpace()/1073741824));
		
		
	}
}
