package h3;

public class H3_main {
	public static void main(String[] args) {
		
		float celsiusFloat = 14.249378f;
		float fahrenheitFloat = 0.0f;
		double celsiusDouble = 14.249378;
		double fahrenheitDouble = 0.0;
		
		fahrenheitFloat = celsiusFloat * 9/5 + 32;
		
		fahrenheitDouble = celsiusDouble * 9/5 + 32;
		
		System.out.println(fahrenheitFloat);
		System.out.println(fahrenheitDouble);
		
	}
}
