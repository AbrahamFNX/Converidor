//import java.awt.font.NumericShaper;

import javax.swing.JOptionPane;

public class Principal {

public static void main(String[] args) {
		
	function monedas = new function();
	function temperatura = new function();
		
		
		boolean flag = true;
		while (flag) {
			
			String opciones = (JOptionPane.showInputDialog(/*parentComponet*/ null, /*message*/ "Seleciones una opción de conversión", /*title*/ "Menú", JOptionPane.QUESTION_MESSAGE, /*icon*/ null, new Object[] {"Conversor de moneda", "Conversor de temperatura"}, /* selectionValue*/"Seccion" )).toString();
			
			switch (opciones){
			case "Conversor de moneda":

			String input = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que desea converit: ");
			
			if (ValidarNumero (input)) { 
			    double Minput = Double.parseDouble(input);
			    monedas.ConvertirMonedas(Minput);
			    
			    int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra coversion?");
			    if (JOptionPane.OK_OPTION == respuesta) {
			    	System.out.println("Selecciona opción afirmativa");
			    } else {
			    	flag = false;
			    	JOptionPane.showMessageDialog(null, "Programa terminado");
			    } 
			    
			} 

					break;
					
			
				
			case "Conversor de temperatura":
				
		    	String input1 =JOptionPane.showInputDialog(null, "Ingresa la temperatura que deseas convertir; ");
		    	if (ValidarNumero(input1)) {
		    		double Minput = Double.parseDouble(input1);
		    	    temperatura.ConvertidorDeTemperatura(Minput);
		    		
		    		int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
		    		if (JOptionPane.OK_OPTION == respuesta) {
		    			System.out.println("Selecciona opción afirmativa");
		    		}else {
		    			flag = false ;
		    			JOptionPane.showMessageDialog(null, "Programa terminado");
		    			
		    		}
		    	} break;
				
		    	

  }
 }
		JOptionPane.showMessageDialog(null, "Gracias por usar el convertidor (^vv^)/"); 
}
			
			
		


	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x>= 0 || x < 0);
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor invalido");
			return false;
		}
	}
	
		
		
}

