package Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

	 public static void main(String[] args) {
	        String opciones[] = {"Conversor de Moneda", "Conversor de Temperatura", "Conversor de Longitud", "Salir"};
	        boolean continuar = true;

	        while (continuar) {
	            String op = (String) JOptionPane.showInputDialog(
	                null, "Elija una Opción", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]
	            );

	            if (op == null || op.equals("Salir")) {
	                continuar = false; 
	            } else if (op.equals("Conversor de Moneda")) {
	                convertirMoneda();
	            } else if (op.equals("Conversor de Temperatura")) {
	                convertirTemperatura();
	            } else if (op.equals("Conversor de Longitud")) {
	                convertirLongitud();
	            } else {
	                JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	            int opcionContinuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar", JOptionPane.YES_NO_OPTION);
	            if (opcionContinuar == JOptionPane.NO_OPTION) {
	                continuar = false;
	            }
	        }

	        JOptionPane.showMessageDialog(null, "Gracias por utilizar el conversor. ¡Hasta luego!");
	    }

	    public static void convertirMoneda() {
	    	 String montoEnPesos = JOptionPane.showInputDialog(null, "Ingrese en pesos el monto que desea convertir");
	    	 double montoIngresado = 0.0;
	    	 String resultadoFormateado;
	    	 ConvertirMoneda moneda = new ConvertirMoneda();
	    	 
	         if (montoEnPesos == null || montoEnPesos.isEmpty()) {
	             JOptionPane.showMessageDialog(null, "No se ingresó un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
	             System.exit(0);
	         }
	         
	         try {
	             montoIngresado  = Double.parseDouble(montoEnPesos);

	         } catch (NumberFormatException e) {
	             JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
	             System.exit(0);
	         }         
	         
	         String opciones[] = {"De pesos a Dolar", "De pesos a Euros", "De pesos a Reales"};
	         String op = (String) JOptionPane.showInputDialog(null, "Elija una Opción", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
	         DecimalFormat decimalFormat = new DecimalFormat("#.##");
	         
	         if (op != null) {
		            if (op.equals("De pesos a Dolar")) {
			         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 520));
			         JOptionPane.showMessageDialog(null, montoIngresado+ " En pesos Argentinos corresponde a " + resultadoFormateado + " en dolares Americanos.");
		            } else if (op.equals("De pesos a Euros")) {
			         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 575));
			         JOptionPane.showMessageDialog(null, montoIngresado+ " En pesos Argentinos corresponde a " + resultadoFormateado + " en Euros.");
		            } else if (op.equals("De pesos a Reales")) {
			         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 56));
			         JOptionPane.showMessageDialog(null, montoIngresado+ " En pesos Argentinos corresponde a " + resultadoFormateado + " en Reales.");
		            } else {
		                JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }
	    }

	    public static void convertirTemperatura() {
	    	String temperaturaenGrados = JOptionPane.showInputDialog(null, "Ingrese el valor de la temperatura a convertir: ");
	    	double temperaturaIngresada = 0.0;
	    	String resultadoFormateado;
	    	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	    	
	        if (temperaturaenGrados == null || temperaturaenGrados.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "No se ingresó un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
	            System.exit(0);
	        }
	         try {
	             temperaturaIngresada  = Double.parseDouble(temperaturaenGrados);

	         } catch (NumberFormatException e) {
	             JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
	             System.exit(0);
	         }
	         
	         String opciones[] = {"De Celsius a Fahrenheit", "De Fahrenheit a Celsius", "De Celsius a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Fahrenheit a Kelvin"};
	         String op = (String) JOptionPane.showInputDialog(null, "Elija una Opción", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
	         DecimalFormat decimalFormat = new DecimalFormat("#.##");
	         
	         if (op != null) {
		            if (op.equals("De Celsius a Fahrenheit")) {
		            	resultadoFormateado = decimalFormat.format(temperatura.ConvertirCelsiusaFahrenheit(temperaturaIngresada));
		    	        JOptionPane.showMessageDialog(null, temperaturaIngresada + " grados Celsius equivalen a " + resultadoFormateado + " grados Fahrenheit.");
		            } else if (op.equals("De Fahrenheit a Celsius")) {
		            	resultadoFormateado = decimalFormat.format(temperatura.ConvertirFahrenheitaCelsius(temperaturaIngresada));
		    	        JOptionPane.showMessageDialog(null, temperaturaIngresada + " grados Fahrenheit equivalen a " + resultadoFormateado + " grados Celsius.");
		            } else if (op.equals("De Celsius a Kelvin")) {
		            	resultadoFormateado = decimalFormat.format(temperatura.ConvertirCelsiusaKelvin(temperaturaIngresada));
		    	        JOptionPane.showMessageDialog(null, temperaturaIngresada + " grados Celsius equivalen a " + resultadoFormateado + " grados Kelvin.");
		            } else if (op.equals("De Kelvin a Celsius")) {
		            	resultadoFormateado = decimalFormat.format(temperatura.ConvertirKelvinaCelsius(temperaturaIngresada));
		    	        JOptionPane.showMessageDialog(null, temperaturaIngresada + " grados Kelvin equivalen a " + resultadoFormateado + " grados Celsius.");
		            }else if (op.equals("De Kelvin a Fahrenheit")) {
		            	resultadoFormateado = decimalFormat.format(temperatura.ConvertirKelvinaFahrenheit(temperaturaIngresada));
		    	        JOptionPane.showMessageDialog(null, temperaturaIngresada + " grados Kelvin equivalen a " + resultadoFormateado + " grados Fahrenheit.");
		            }else if (op.equals("De Fahrenheit a Kelvin")) {
		            	resultadoFormateado = decimalFormat.format(temperatura.ConvertirFahrenheitaKelvin(temperaturaIngresada));
		    	        JOptionPane.showMessageDialog(null, temperaturaIngresada + " grados Fahrenheit equivalen a " + resultadoFormateado + " grados Kelvin.");
		            }else {
		                JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }
	    }

	    public static void convertirLongitud() {
	    	String longitud = JOptionPane.showInputDialog(null, "Ingrese el valor de la longitud a convertir: ");
	    	double longitudIngresada = 0.0;
	    	String resultadoFormateado;
	    	ConvertirLongitud longitudaConvertir = new ConvertirLongitud();
	    	
	        if (longitud == null || longitud.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "No se ingresó un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
	            System.exit(0);
	        }
	         try {
	        	 longitudIngresada = Double.parseDouble(longitud);

	         } catch (NumberFormatException e) {
	             JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
	             System.exit(0);
	         }
	         
	         String opciones[] = {"De milimetros a centimetros", "De centimetros a milimetros", "De centimetros a metros", "De metros a centimetros"};
	         String op = (String) JOptionPane.showInputDialog(null, "Elija una Opción", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
	         DecimalFormat decimalFormat = new DecimalFormat("#.##");
	         
	         if (op != null) {
		            if (op.equals("De milimetros a centimetros")) {
			         resultadoFormateado = decimalFormat.format(longitudaConvertir.ConvertirMilimetrosaCentimetros(longitudIngresada));
			         JOptionPane.showMessageDialog(null, longitudIngresada+ " En milimetros corresponde a " + resultadoFormateado + " en centimetros.");
		            } else if (op.equals("De centimetros a milimetros")) {
			         resultadoFormateado = decimalFormat.format(longitudaConvertir.ConvertirCentimetrosaMilimetros(longitudIngresada));
			         JOptionPane.showMessageDialog(null, longitudIngresada+ " En centimetros corresponde a " + resultadoFormateado + " en milimetros.");
		            } else if (op.equals("De centimetros a metros")) {
			         resultadoFormateado = decimalFormat.format(longitudaConvertir.ConvertirCentimetrosaMetros(longitudIngresada));
			         JOptionPane.showMessageDialog(null, longitudIngresada+ " En centimetros corresponde a " + resultadoFormateado + " en metros.");
		            } else if (op.equals("De metros a centimetros")) {
				         resultadoFormateado = decimalFormat.format(longitudaConvertir.ConvertirMetrosaCentimetros(longitudIngresada));
				         JOptionPane.showMessageDialog(null, longitudIngresada+ " En metros corresponde a " + resultadoFormateado + " en centimetros.");
		            } else {
		                JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }	        
	    }
}
