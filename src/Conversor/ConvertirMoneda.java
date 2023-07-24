package Conversor;

public class ConvertirMoneda {
	double valor;	
	
	public double Convertir(double valoraConvertir,double tasadeCambio ) {
		
		valor = valoraConvertir/tasadeCambio;	
		
		return valor;
	}

}
