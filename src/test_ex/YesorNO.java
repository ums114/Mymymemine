package test_ex;

public class YesorNO {
	public static void main(String[] args)
		throws java.io.IOException{
		
				
		
		System.out.println("Yes/No ?");
		
		String c = args[0];
		
		switch (c) {
			case "y":
			case "Y":
				System.out.println("Yes");

				break;
			case "n":
			case "N":
				System.out.println("No");
				break;
			default:
				System.out.println("Wrong answe");
				break;
			
		
		}
		
	}
}
