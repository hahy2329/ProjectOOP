package Others;

class Foo{
	
	public static String classVar = "I class var"; // Class의 변수인 classVar의 값이 변경이 되면 전체적으로 바뀌게 된다. 
	public String instanceVar = "I instance var"; // 인스턴스를 만들어서 변수읜 instanceVar의 값이 변경이 되면 그 인스턴스의 값만 바뀌지 전체 영향x
	
	public static void classMethod() {
		
		System.out.println(classVar); // OK
	//	System.out.println(instanceVar); //Error
	}
	
	public void instanceMethode() {
		System.out.println(classVar); //OK
		System.out.println(instanceVar); //OK
		
	}
	
}


public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //OK
	//  System.out.println(Foo.instanceVar); //Error
		
		Foo.classMethod();
	//	Foo.instanceMethod(); //instanceMethod() 메소드 또한 static이 안붙여있기 때문에 클래스를 통해서 바로 사용이 불가!, 인스턴스를 통해서 가능
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "changed by f1"; //Class의 변수인 classVar의 변수 값을 수정했기에 전체적으로 영향이 미친다.
		System.out.println(Foo.classVar); //  changed by f1로 출력된다.
		System.out.println(f2.classVar); // changed by f1로 출력된다.
		Foo.classMethod();
		
		f1.instanceVar = "changed by f1"; // 자신의 인스턴스 안에서만 영향
		System.out.println(f1.instanceVar);
		System.out.println(f2.instanceVar);
	}

}
