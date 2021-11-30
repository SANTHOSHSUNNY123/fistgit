import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
	      
        System.out.println("Enter the value 1 to add the item");
        System.out.println("Enter the value 2 to Display the item");
        System.out.println("Enter the value 3 to Remove");
        System.out.println("Enter the value 4 to Replace");
        System.out.println("Enter th vaue 5 to exit the application");
           
         Scanner scan=new Scanner(System.in);
              System.out.println("provide the value to add items");
                     int rl=scan.nextInt();
                     
             while(rl!=6) {
          	   
          	       switch(rl) {
          	           
          	       case 1:
          	    	     
          	    	      System.out.println("provide the number of items you want to store");
          	    	                 int r=scan.nextInt();
          	    	               
          	    	           while(r>0) {
          	    	        	      System.out.println("Enter the item");
          	    	        	                 String t=scan.next();
          	    	        	                     al.add(t);
          	    	        	                     r--;
          	    	           }
          	    	      
          	    	           break;
          	    	         
          	       case 2:
          	    	     for(int i=0;i<al.size();i++) {
          	    	    	    System.out.println(al.get(i));
          	    	     }
          	    	      break;
          	       case 3:
          	    	     System.out.println("provide the index value etc"+("0,1,2,3"));
          	    	                  int u=scan.nextInt();
          	    	                      al.remove(u);
          	    	        break;
          	    	     
          	       case 4:
          	    	    System.out.println("provid the value to replace");
          	    	               int a=scan.nextInt();
          	    	                  al.remove(a);
          	    	                  al.add(a, al);
          	    	      break;
          	        default:
          	       }
          	       System.out.println("provide your choice:");
          	                rl=scan.nextInt();
             }
             
             System.out.println("thank's for visitin the application");
           
       
}
	}


