
public class Hello {
	
	String world = "Guys" ;

	public String helloSay(String who) {
		String sentence;
		if( who != "")
			sentence = "Hello" + who + " :)" ;
		else
			sentence = "Hello" + world + " :)" ;
		
		
		return sentence;
	}
	

}
