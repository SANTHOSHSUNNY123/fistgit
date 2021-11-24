package inheritance;

public class Animal {
	
	   public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}

	private String name;
	   private String color;
	   private int legs;
	   
	   
	   
	   public Animal(String name,String color,int legs) {
		    this.name=name;
		    this.color=color;
		    this.legs=legs;
	   }
	   
	   
	   public void run() {
		    System.out.println(name+"dog is running");
	   }
	   
	   public void barking() {
		   System.out.println(name+" this is braking");
	   }

}
