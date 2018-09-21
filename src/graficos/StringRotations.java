package graficos;

public class StringRotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String word="hello";
		
		/*System.out.println(word.substring(1,5)+word.charAt(0));
		
		String output=word.substring(1,5)+word.charAt(0);
		
		System.out.println(output);*/
		
		for(int i=word.length()-1;i>=0;i--) {
			
			System.out.println(word+word.charAt(i));
		}
		
		

	}

}

/*class Clase{
	
	public String funtion(String word) {
		
		for(int i=word.length();i<word.length();i++) {
			
			
		}
	}
}*/