package Others;


public class MyOOP { 
	public static void main(String[] args) {
		
		Print p1 =  new Print("----");
	
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		
		
		Print p2 =  new Print("****");
		
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A(); // 마이너스(-)가 필요한 경우
		p2.A(); // 별표(*)가 필요한 경우
		p1.A();
		p2.A();
		
		
	}

}
