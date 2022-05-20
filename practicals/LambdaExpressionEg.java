package java8Eg;

public class LambdaExpressionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----------------------------------
		//FunctionalInterfaceEg d = () -> {
			//System.out.println("i am functional interface implemented by lambda expression");
		//};
		//d.add();
		//-----------------------------------
		
		
		//lambda expression
		FunctionalInterfaceEg d = (a,b) -> {
			
			//using argument
			//System.out.println(a+b);
			
			
			//using return
			return(a+b);
		//System.out.println("i am functional interface implemented by lambda expression");
	};
	System.out.println(d.add(40,50));
	//d.add();
	}

}
