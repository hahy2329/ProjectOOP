package Others;

class Accounting{
	public  double valueOfSupply; //1.공급가액(물거의 실제 가격)
	public static double vatRate = 0.1; // 2.부가가치세율
	
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
		
	}
	
	public  double getVAT() { //3.부가가치세(물건을 살 떄 붙는 세금) = 부가세
		return valueOfSupply * vatRate;
		
	}
	
	public  double getTotal() { //4.총 내야할 금액
		return valueOfSupply + getVAT();
	}
}


public class AccountingApp {
	
	public static void main(String[] args) {
	
		Accounting a1 = new Accounting(10000.0);
		
		
		Accounting a2 = new Accounting(20000.0);

		
		System.out.println("Value of Supply : " + a1.valueOfSupply);
		System.out.println("Value of Supply : " + a2.valueOfSupply);
		
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		
		
		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());
	
		
	}

}
