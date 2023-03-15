package interfaz;

public class ConversorDeMonedas {
	private double[] tasasDeCambio = {4.97,0.26,35.00,0.20,3.80,0.029,};
	private String[] simboloMonedas = {"$","$","¥","S/","S/","S/"};
	private String[] nombreMonedas = {"pesos mexicanos","dolares","yenes","soles","soles","soles"};
	private String[] etiquetas = {"De sol a peso mexicano", "De sol a dolar americano",
			"De sol a Yen Japones (JPY)", "De peso mexicano a sol", "De dolar americano a sol",
			"De Yen Japones (JPY) a sol"};
	public double ConvertirMoneda(double cantidad, double tasaCambio) {
		return cantidad * tasaCambio;
	}
	public double getTasasDeCambio(int indice) {
		return tasasDeCambio[indice];
	}
	
	public String getSimboloMonedas(int indice) {
		return simboloMonedas[indice];
	}

	public String[] getEtiquetas() {
		return etiquetas;
	}
	public String getNombreMonedas(int indice) {
		return nombreMonedas[indice];
	}
	
	
	
}
