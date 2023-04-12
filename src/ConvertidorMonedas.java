import  javax.swing.JOptionPane;

public class ConvertidorMonedas {
	
	
	public void ConvertirPesosADolares (double valor) {
		double monedaDolar = valor / 18.4545;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes$" + monedaDolar + "Dolares");
	}

	public void ConvertirPesosAEuros (double valor) {
		double monedaEuro = valor / 19.8866;
		monedaEuro= (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null,  "Tienes $" + monedaEuro +  "Euros");
	}
	public void ConvertirPesosALibra (double valor) {
		double monedaLibra = valor * 0.04446;
		monedaLibra= (double) Math.round(monedaLibra *100d)/100;
		JOptionPane.showMessageDialog(null,  "Tienes $" + monedaLibra +  "Libras");
	}
	

	public void ConvertirPesosAYen (double valor) {
		double monedaYen = valor * 7.34666;
		monedaYen= (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null,  "Tienes $" + monedaYen +  "Yenes");
	}
	
	public void ConvertirPesosAWon (double valor) {
		double monedaWon = valor * 72.8875 ;
		monedaWon= (double) Math.round(monedaWon *100d)/100;
		JOptionPane.showMessageDialog(null,  "Tienes $" + monedaWon +  "wones");
	}
	
	
	
	
	
	
}
