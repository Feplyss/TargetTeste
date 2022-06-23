package Target;

public class TargetQ5 {
	
	public static void inverte(String s) {
		String aux = "";
		char c;

		for(int i = 0; i < s.length(); i++) {
			
			c = s.charAt(s.length() - i - 1);
			aux = aux + c;
		}
			
		s = aux;
	}

	public static void main(String[] args) {
		
		String s = "Rogério";
		inverte(s);
		System.out.println(s);
	}
}
