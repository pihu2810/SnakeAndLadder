package Day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VendingMachineJUc1 
{
	public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the amount to withdraw : ");
		  int amountToBeWithdrawn=sc.nextInt();
		  sc.close();
		  Map<Integer, Integer> map = new HashMap<>();
		  int totalNotesRequired=0;
		  int remainingAmount = amountToBeWithdrawn;
		  int[] availableNotes= {1000,500,100,50,10,5,2,1};
		 for(int i=0;i<availableNotes.length;i++)
	        { 
			 int tempnumbernotes=remainingAmount/availableNotes[i];
			 if(tempnumbernotes>0)
			 {
				 map.put(availableNotes[i],tempnumbernotes);	 
				 totalNotesRequired=totalNotesRequired+tempnumbernotes;
				 remainingAmount=remainingAmount%availableNotes[i];
				 if(remainingAmount == 0)
					 break; 
			 }
	        }
		 System.out.println( "Minimum number of notes required to withdraw " + amountToBeWithdrawn + " is : " +totalNotesRequired);
		 TreeMap<Integer, Integer> sorted = new TreeMap<>();
		 
	        // Copy all data from hashMap into TreeMap
	        sorted.putAll(map);
	 
	        // Display the TreeMap which is naturally sorted
	        for (Map.Entry<Integer, Integer> entry : sorted.entrySet())
	          
	        System.out.println("Number of notes of "+entry.getKey()+" denomination is : "+entry.getValue()); 
	    }

		 
}
