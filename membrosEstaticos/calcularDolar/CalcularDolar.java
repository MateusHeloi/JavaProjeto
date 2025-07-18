package calcularDolar;

public class CalcularDolar {
	public static double dollar;
	public static double tax= 1.06;

	
	public static void calcular(double dollar, double qtd) {
		
		double valorfinal=(dollar*qtd)*tax;
		System.out.println("O valor final é: "+valorfinal);
		
		
	}
	

}
