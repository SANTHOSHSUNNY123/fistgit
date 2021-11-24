package inheritance;

public class Dog extends Animal {
	    
	    
	    public Dog(String name, String color, int legs) {
			super(name, color, legs);
			
		}


		@Override
		public void run() {
			
			super.run();
		}


		@Override
		public void barking() {
			System.out.println( getName()+"is overriding the animal class");
		}
	    
	   
	   

	     
}
