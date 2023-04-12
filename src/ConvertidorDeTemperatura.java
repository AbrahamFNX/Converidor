import javax.swing.JOptionPane;

public class ConvertidorDeTemperatura {

	
	public void convertirCelsiusAFahrenhait(double valor) {
		double temperaturaFahranhait = (valor * 9/5)+32;
		JOptionPane.showMessageDialog(null, "La temperatura es: " + temperaturaFahranhait + " fahrenheit");
	}
	
	public void convertiCelsiusAKelvin (double valor) {
		double temperaturaKelvin = valor + 273.15;
		JOptionPane.showMessageDialog(null, "La temperatura es: " + temperaturaKelvin + " kelvin");
	}
	
	public void convertirFahrenheitACelcius(double valor) {
		double temperaturaCelsius =  ( +valor - 32) * 0.5555;
		JOptionPane.showMessageDialog(null, "La temperatura es: " + temperaturaCelsius + " centigrados" );
	}
	
	

	public void convertirFahrenheitAKelvin(double valor) {
		double temperaturaKelvin2 = (valor - 32)* 0.5555 + 273.15;
		JOptionPane.showMessageDialog(null, "La temperatura es: " + temperaturaKelvin2 + " kelvin");
	}
	
	
	 public void convertirKelvinaCelsius (double valor) {
		 double temperaturaCelsius2 = valor -273.15;
		 JOptionPane.showMessageDialog(null, "La temperatura es: " + temperaturaCelsius2 + " centigrados");
	 }
	 
	 public void convetirKelvinAFahrenheit(double valor) {
		 double temperaturaFahrenheit2 = (valor - 273.15) *1.8 + 32 ;
		 JOptionPane.showMessageDialog(null, "La temperatura es: " + temperaturaFahrenheit2 + " fahrenheit");
	 }
	 
	 
	 
}
