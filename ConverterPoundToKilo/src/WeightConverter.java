import java.util.Scanner;

public class WeightConverter {
	
	 public static void main (String[] args) {
		
		double pvalue = 0;
		double kvalue = 0;
		int x = 0;
		long m;
		int l = 0;
		int nums[]= {1,2,3,4,7};
		System.out.println(containsDuplicate (nums));
		
	/*	for (int i=0; i!=3; i++) {
			
			System.out.println("Select operation to be preformed:\n");
			System.out.println("1. Convert pound to kilo.");
			System.out.println("2. Convert kilo to pound. ");
			System.out.println("3. Exit.\n4. Dog bark\n5.Is leap year\n6.feet to cm.\n 7. Is Polindrome.\n 8. has shared digit");
			x = read();
			
			switch(x) {
			case 1: p2k();
			 break;
			case 2: m = toMilesPerHour(1.5 );
			System.out.println(m );
			case 3: printConversion(25.42);
			 break;
			case 4: shouldWakeUp( true, 6);
				break;
			case 6: calFeetAndInchesToCentimeters(-6);
				break;
			case 7: isPolindrome(-222);
				break;
			case 8: hasSharedDigit(92,49);
			System.out.println(hasSharedDigit(92,49));
			break;
			}
			
		}
	}
	
	
	@SuppressWarnings("resource")
	public static int read() {
		
		Scanner scan = new Scanner(System.in);
		
		return(scan.nextInt());*/
		
	}

	
	public static void p2k() {
		double p;
		
		System.out.println("Enter pounds:");
		p = read();
		p = p * 0.45359237;
		System.out.println(p + "Kilos.");
	}

 public static boolean containsDuplicate(int nums[]) {
	 
	 for (int i =0; i< nums.length; i++){
         for (int j=0; j< nums.length; j++){
          if(i != j){
             if(nums[i] == nums[j])
              return true;
         }
         }
     }return false;
 }
	

    
    public static long toMilesPerHour (double kilometersPerHour){
        
       kilometersPerHour = 1.5;
        
        if (kilometersPerHour < 0)
        return -1;
        else 
        return (long)(Math.round(kilometersPerHour / 1.609));   
    }
    
    public static void printConversion (double kilometersPerHour) {
    	
    	if (kilometersPerHour <  0)
    		System.out.println("Invalid number");
    	else {
    		// long milesPerHour;
    		// milesPerHour = (long)( kilometersPerHour / 1.609);
    		
    		System.out.println(kilometersPerHour + " km/h = " +Math.round(toMilesPerHour(kilometersPerHour)) + "mi/h\n");
    	}
    }
    
    public static void shouldWakeUp(boolean barking, int hourOfDay){

        if (hourOfDay > 0 && hourOfDay <23) {
        	if (barking && (hourOfDay < 8 || hourOfDay == 23)) {
        		System.out.println("WAKEUP!");
        	} else
        		if (barking && hourOfDay > 8)
        		System.out.println("False alarm");
        }
        else 
        	System.out.println("Invalid Number");
        
    }
    
   
     public static double calFeetAndInchesToCentimeters(double feet, double inch) {
    	 
    	 double centimeters;
    	 if (feet >= 0 ) {
    		 if ((inch >= 0) && (inch <=12)) {
    			 centimeters = feet * 30.48;
    			 centimeters = centimeters + (inch * 2.54);
    			 System.out.println("value of " +feet +" feet and " + inch + " inches  is " + centimeters +" cm.");
    			 return centimeters;
    			 }else
    				 return -1;
    		 } else
    			 return -1;
     }
       
    public static double calFeetAndInchesToCentimeters (double inches) {
    	
    	if (inches >=0) {
    		calFeetAndInchesToCentimeters(inches, 0);
    	}  		
		return -1;
    	
    	
    }   
        
    	 public static boolean isOdd ( int number){
    	     
    	     if (number < 0 )
    	     return false;
    	     else
    	     if((number%2)!=0)
    	     return true;
    	     else 
    	     return false;
    	 }
    	 
    	 public static void isOddOperation (String[] args){
    	     
    	     int sum=0;
    	     int start = 1;
    	     int end = 11;
    	     
    	     for (int i = start; i <= end; i++){
    	         if(isOdd(i))
    	         sum =sum+i;
    	     }
    	     System.out.println(sum );
    	     
    	 }
    	 public static boolean isPolindrome (int number){
    	       int firstNumber = number;
    	       int reverse = 0;
    	       int modulos = 0;
    	       number = Math.abs(number); 
    	       
    	       while (number > 0)
    	    	   {
    	    	    modulos = number%10;
    	            number = number/10;
    	            reverse =(reverse * 10) + modulos;
    	       }
    	       
    	       System.out.println(firstNumber);
    	       System.out.println(reverse);
    	       
    	       if (firstNumber == reverse) {
    	    	System.out.println("True");
    	       return true;
    	       }
    	       else 
    	       System.out.println("false");
    	       return false;
    	 
    	}
    	 public static boolean hasSharedDigit(int x, int y){
             int digitx = 0;
             int digity = 0;
             boolean tf= false;
             if ((x>9 && x<100)&&(y>9 && y<100)){
                
                    digitx = x%10;
                    x = x/10; {
                    
                        digity = y%10;
                        y = y/10;
                        if (digitx == digity)
                        tf = true;
                        digity = y/10;
                        if (digitx ==digity)
                        	tf = true;
                        y=digity+y;
                        
                    }
                        
                        digitx = x%10;{
                        
                            digity = y%10;
                            y = y/10;
                            if (digitx == digity)
                            tf = true;
                            digity = digity/10;
                            if (digitx ==digity)
                            	tf = true;
                        }
                   }else 
			return false;
            return tf;
             
         }
}
    	


