package Conversor;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String opciones[] = {"Conversor de Moneda", "Conversor de Temperatura", "Conversor de Longitud"};
		
		String op = (String) JOptionPane.showInputDialog(null, "Elija una Opcion","Menu",JOptionPane.DEFAULT_OPTION,null, opciones,opciones[0]);

	}

}
