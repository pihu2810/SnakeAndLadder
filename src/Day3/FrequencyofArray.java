package Day3;

public class FrequencyofArray 
{
 public static void main(String args[])
 {
	 int arr[]=new int[] {1,3,3,4,5,6,6,6,7,7,8};
	 System.out.println("Elementof array  | Frequency of array element");
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 int flag = 0;
		 int count=0;
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]==arr[j]) {
				 flag = 1;
				 break;
				 
			 }
		 }
		 if (flag == 1)
             continue; 

		 for (int j = 0;j<=i;j++){
             if (arr[i] == arr[j])
                 count++;
         }
		
         System.out.println(arr[i]+"  :  "+count);
     
	 }
	 
 }
}
