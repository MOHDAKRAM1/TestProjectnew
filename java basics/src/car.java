
public class car {

	
		String name;
	    int fuelcapacity;
	    
	    public car() {
	    	
	   System.out.println("Inside default constructor");
	    	}
	    
	    
	    
	    public car(String name, int fuelcapacity) {
	    	System.out.println("Inside overload constructor");
	    	
	    this.name=name;
	    this.fuelcapacity = fuelcapacity;
	    	
	    			
	    	
	    }    	
	    
	   public void start() {
		   System.out.println("car starting"+name);
		   
		   
 }
	    
	public void refuel( int n) {
		System.out.println("refueling"+name);
		fuelcapacity = fuelcapacity+n;
		
		
		
		
		
		
	}
	    
	    
	    
		
		

		
		
		
		

	}


