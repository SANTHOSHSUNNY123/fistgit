import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		   Scanner scan=new Scanner(System.in);
		             System.out.println("Enter the 3 digit number");
		                  int r=scan.nextInt();
		                   int numb=r;
		   
		     int  sum=0 ;
		     int rem=0;
		      
		      while(numb>0) {
		    	      rem=numb%10;   
		    	          sum+=(rem*rem*rem);
		    	              numb/=10;
		      }
		      
		      if(r==sum) {
		    	      System.out.println(r +":"  +"this is a armstrong number");
		      }
		      else {
		    	   System.out.println(r + ":" +"this is not a armstrong number");
		      }
		     scan.close();
	}

}
