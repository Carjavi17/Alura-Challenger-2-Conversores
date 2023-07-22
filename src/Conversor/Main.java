package Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

	 public static void main(String[] args) {
	        String opciones[] = {"Conversor de Moneda", "Conversor de Temperatura", "Conversor de Longitud"};

	        String op = (String) JOptionPane.showInputDialog(null, "Elija una Opción", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

	        if (op != null) {
	            if (op.equals("Conversor de Moneda")) {
	                convertirMoneda();
	            } else if (op.equals("Conversor de Temperatura")) {
	                convertirTemperatura();
	            } else if (op.equals("Conversor de Longitud")) {
	                convertirLongitud();
	            } else {
	                JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    }

	    public static void convertirMoneda() {
	    	 String montoEnPesos = JOptionPane.showInputDialog(null, "Ingrese en pesos el monto que desea convertir");
	    	 double montoIngresado = Double.parseDouble(montoEnPesos);
	    	 
	         if (montoEnPesos == null || montoEnPesos.isEmpty()) {
	             JOptionPane.showMessageDialog(null, "No se ingresó un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
	             System.exit(0);
	         }
	         String opciones[] = {"De pesos a Dolar", "De pesos a Euros", "De pesos a Reales"};
	         String op = (String) JOptionPane.showInputDialog(null, "Elija una Opción", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
	         DecimalFormat decimalFormat = new DecimalFormat("#.##");
	         
	         if (op != null) {
		            if (op.equals("De pesos a Dolar")) {
		   	         double tasaDeCambio = 520;
			         double montoEnDolares = montoIngresado / tasaDeCambio;
			         String resultadoFormateado = decimalFormat.format(montoEnDolares);
			         JOptionPane.showMessageDialog(null, montoIngresado+ " En pesos Argentinos corresponde a " + resultadoFormateado + " en dolares Americanos.");
		            } else if (op.equals("De pesos a Euros")) {
		   	         double tasaDeCambio = 575;
			         double montoEnEuros = montoIngresado / tasaDeCambio;
			         String resultadoFormateado = decimalFormat.format(montoEnEuros);
			         JOptionPane.showMessageDialog(null, montoIngresado+ " En pesos Argentinos corresponde a " + resultadoFormateado + " en Euros.");
		            } else if (op.equals("De pesos a Reales")) {
		   	         double tasaDeCambio = 56;
			         double montoEnReales = montoIngresado / tasaDeCambio;
			         String resultadoFormateado = decimalFormat.format(montoEnReales);
			         JOptionPane.showMessageDialog(null, montoIngresado+ " En pesos Argentinos corresponde a " + resultadoFormateado + " en Reales.");
		            } else {
		                JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }    

	    }

	    public static void convertirTemperatura() {
	    	String temperaturaStr = JOptionPane.showInputDialog(null, "Ingrese la temperatura en la escala original (Celsius):");

	        if (temperaturaStr == null || temperaturaStr.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "No se ingresó un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
	            System.exit(0);
	        }

	        double temperaturaCelsius = Double.parseDouble(temperaturaStr);
	        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
	        JOptionPane.showMessageDialog(null, temperaturaCelsius + " grados Celsius equivalen a " + temperaturaFahrenheit + " grados Fahrenheit.");

	    }

	    public static void convertirLongitud() {
	    	String longitudStr = JOptionPane.showInputDialog(null, "Ingrese la longitud en la unidad original (metros):");

	        if (longitudStr == null || longitudStr.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "No se ingresó un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
	            System.exit(0);
	        }

	        double longitudMetros = Double.parseDouble(longitudStr);
	        double longitudKilometros = longitudMetros / 1000;
	        JOptionPane.showMessageDialog(null, longitudMetros + " metros equivalen a " + longitudKilometros + " kilómetros.");

	    }

}
