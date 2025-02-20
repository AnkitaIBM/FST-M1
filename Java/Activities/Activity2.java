package hello;
public class Activity2 {
	public static void main(String[] args) {
		
		int[] Arr= {10, 77, 10, 54, -11, 10};
		
	System.out.println(Arr.length);
		
		int sum = 0;
   
    for(int i=0;i<Arr.length;i++) {
    	if(Arr[i] == 10) {
    		sum= sum + Arr[i];	
    	}
    	
    }
    
    System.out.println("Totalsum of 10s in array:" + sum);
    
   
    
    if (sum == 30) {
    	System.out.println("True");
    }
    else {
    	System.out.println("False");
    }
	}
}