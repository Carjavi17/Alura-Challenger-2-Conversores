package Conversor;

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
	    	 String montoEnPesos = JOptionPane.showInputDialog(null, "Ingrese el monto en pesos Argentinos");

	         if (montoEnPesos == null || montoEnPesos.isEmpty()) {
	             JOptionPane.showMessageDialog(null, "No se ingresó un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
	             System.exit(0);
	         }
	         double montoIngresado = Double.parseDouble(montoEnPesos);
	         double tasaDeCambio = 520;
	         double montoEnDolares = montoIngresado / tasaDeCambio;
	         JOptionPane.showMessageDialog(null, montoIngresado+ " En pesos Argentinos corresponde a " + montoEnDolares + " en dolares Americanos.");
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

	    }

}
