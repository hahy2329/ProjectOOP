package Others;

/*
 * MyOOP.java는 해당 문서에서 MyOOP 클래스를 찾아서 main 메소드를 실행시키게 약속되있다.
 * 
 * public static String delimiter = "";
 * static은 클래의 소속, static을 빼면 인스턴스의 소속으로 바뀐다.
 * 
 * */
class Print {
	
	public String delimiter = "";
	
	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
		
	}
}