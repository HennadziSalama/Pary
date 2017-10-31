package by.home.test11;

public interface IConverter {
	
	public double fromCarrencyToUSD (double summa, Carrency cur);
	
	public double fromUSDToCarrency(double summa, Carrency cur);

	public double fromCarrencyToCarrency(double summa, Carrency from, Carrency to);
	

}
