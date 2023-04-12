import javax.swing.JOptionPane;

public class ConvertirdorMonedasAPesos {

	public void ConvertirDolaresAPesos (double valor) {
		double monedaPeso = valor * 18.0525 ;
		monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes$" + monedaPeso + " pesos");
	}
	public void ConvertirEuroAPesos (double valor) {
		double monedaPeso = valor * 19.715;
		monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes$" + monedaPeso + " pesos");
	}
	
	public void ConvertirLibraAPesos (double valor) {
		double monedaPeso = valor  * 22.49;
		monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes$" + monedaPeso + " pesos");
	}
	
	public void ConvertirYenAPesos (double valor) {
		double monedaPeso = valor / 7.361963;
		monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes$" + monedaPeso + " pesos");
	}
	
	public void ConvertirWonAPesos (double valor) {
		double monedaPeso = valor * 0.013333
				;
		monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes$" + monedaPeso + " pesos");
	}
	
	
	
}
	
