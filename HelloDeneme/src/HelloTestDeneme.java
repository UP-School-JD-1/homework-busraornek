
public class HelloTestDeneme {

	public static void main(String[] args) {
		Hello nesne = new Hello();
		
		String answer = nesne.helloSay(" Juisten");
		System.out.println(answer);
		
		answer = nesne.helloSay(" Rihanna");
		System.out.println(answer);
		
		answer = nesne.helloSay("");
		System.out.println(answer);


	}

}
