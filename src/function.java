
import javax.swing.JOptionPane;

public class function {
	

	
	ConvertidorDeTemperatura temperatura = new ConvertidorDeTemperatura();
	ConvertirdorMonedasAPesos pesos = new ConvertirdorMonedasAPesos();
	ConvertidorMonedas monedas = new ConvertidorMonedas();
	
	
	public void ConvertirMonedas (double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elje la moneda a la que deseas convertir tu dinero", "monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De pesos a Dólar", "De pesos a Euro", "De pesos a Libra", "De pesos a Yen", "De pesos a won", "De Dolar a pesos", "De Euro a pesos", "De Libras a pesos",  "De Yen a pesos", "De Won a pesos" }, "Selecion" )).toString();
		
		switch (opcion) {
		case "De pesos a Dólar":
		monedas.ConvertirPesosADolares(Minput);
		break;
		case "De pesos a Euro":
		monedas.ConvertirPesosAEuros(Minput);
		break;
		case "De pesos a Libra":
		monedas.ConvertirPesosALibra(Minput);
		break; 
		case "De pesos a Yen":
		monedas.ConvertirPesosAYen(Minput);
		break;
		case "De pesos a won":
		monedas.ConvertirPesosAWon(Minput);
		break;		
		case "De Dolar a pesos":
		pesos.ConvertirDolaresAPesos(Minput);
		break;
		case "De Euro a pesos":
		pesos.ConvertirEuroAPesos(Minput);
		break;
		case "De Libras a pesos":
		pesos.ConvertirLibraAPesos(Minput);
		break;
		case "De Yen a pesos":
		pesos.ConvertirYenAPesos(Minput);
		break;
		case "De Won a pesos":
		pesos.ConvertirWonAPesos(Minput);
		break;
		
		}
	}

	public void ConvertidorDeTemperatura(double Minput) {
		String option = (JOptionPane.showInputDialog(null, "Elija la temperatura a la que desea convetir", "temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"De celsius a fahrenheit", "De celsius a kelvin", "De fahrenheit a celsius","De fahrenheit a kelvin", "De Kelvin a Celsius", "De kelvin a fahrenheit"}, "seleccion")).toString() ;
		switch (option) {
		case "De celsius a fahrenheit" :
		temperatura.convertirCelsiusAFahrenhait(Minput);
		break;
		case "De celsius a kelvin":
		temperatura.convertiCelsiusAKelvin(Minput);
		break;
		case "De fahrenheit a celsius":
		temperatura.convertirFahrenheitACelcius(Minput);
		break;
		case "De fahrenheit a kelvin":
		temperatura.convertirFahrenheitAKelvin(Minput);
		break;
		case "De Kelvin a Celsius":
		temperatura.convertirKelvinaCelsius(Minput);
		break;
		case "De kelvin a fahrenheit":
		temperatura.convetirKelvinAFahrenheit(Minput);
		break;
		}

	}
	
}
	
	
