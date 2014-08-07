package TPR;

public class test {

	public static void main(String[] args) { 
	
		String string = "Lao People¡¯s Democratic Republic";
		String string2 = "test";
		
		System.out.println(string.getBytes().length);
		string = string.toLowerCase();
		System.out.println(string);
		string2 = string2.toLowerCase();
		System.out.println(string.equals(string2));
	}
}
