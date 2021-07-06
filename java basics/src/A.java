
public class A {

 private String employname;
 private int employeage;
 private  String ssn;
	

 
 
 public static void main(String[] args) {
 
      A a = new A();
      a.setEmployname("akram");
      a.setEmployeage(76);
      a.setSsn("987987.3"); 
      System.out.println(a.getEmployname());
      System.out.println(a.getEmployeage());
     
       
 
}







	public String getEmployname() {
		
		return employname;
	}

    public void setEmployname(String employname) {
		this.employname = employname;
	}

    public int getEmployeage() {
		return employeage;
	}


    public void setEmployeage(int employeage) {
		this.employeage = employeage;
	}


    public String getSsn() {
		return ssn;
	}


    public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}