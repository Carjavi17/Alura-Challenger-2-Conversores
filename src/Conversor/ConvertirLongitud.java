package Conversor;

public class ConvertirLongitud {
	double valor;	
	
	public double ConvertirMilimetrosaCentimetros(double valoraConvertir) {
		
		valor = valoraConvertir/10;	
		
		return valor;
	}
	public double ConvertirCentimetrosaMilimetros(double valoraConvertir) {
		
		valor = valoraConvertir*10;	
		
		return valor;
	}
	public double ConvertirCentimetrosaMetros(double valoraConvertir) {
		
		valor = valoraConvertir/100;	
		
		return valor;
	}
	public double ConvertirMetrosaCentimetros(double valoraConvertir) {
		
		valor = valoraConvertir*100;	
		
		return valor;
	}
	

}
