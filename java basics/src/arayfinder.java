
public class arayfinder {
	
	public static boolean isContain(int[] array , int item) {
		
		for(int n :array) {
			
		if(n == item) {
			
			return true;
			
			
		}
			
			
		}
		
		
		return false;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] aary1 = {17,8987,900,56};	
		
	System.out.println(arayfinder.isContain(aary1, 89));	
		
		
		
		
		
		
		
	}

}
