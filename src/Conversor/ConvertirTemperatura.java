package Conversor;

public class ConvertirTemperatura {
	double valor;
	
	public double ConvertirCelsiusaFahrenheit(double valoraConvertir) {		
		valor = (valoraConvertir * 9 / 5) + 32;	
		return valor;
	}
	
	public double ConvertirFahrenheitaCelsius(double valoraConvertir) {		
		valor = (valoraConvertir - 32 ) * 5 / 9;	
		return valor;
	}
	
	public double ConvertirCelsiusaKelvin(double valoraConvertir) {		
		valor = valoraConvertir + 273.15;	
		return valor;
	}
	
	public double ConvertirKelvinaCelsius(double valoraConvertir) {		
		valor = valoraConvertir - 273.15;	
		return valor;
	}
	
	public double ConvertirKelvinaFahrenheit(double valoraConvertir) {		
		valor = ((valoraConvertir - 273.15) * 9/5) + 32;
		return valor;
	}
	
	public double ConvertirFahrenheitaKelvin(double valoraConvertir) {		
		valor = ((valoraConvertir - 32) * 5/9) + 273.15;	
		return valor;
	}
	
	
}
