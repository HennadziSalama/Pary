package by.home.test11;

public class Converter {

	public static double  fromCarrencyToUSD(double summa, Carrency cur){
		if (cur==Carrency.BLR){
			return summa/2;
		}
		if (cur==Carrency.EUR){
			return summa*1.16;
		}
		if (cur==Carrency.PLN){
			return summa/3.7;
		}
		if (cur==Carrency.USD){
			return summa;
		}
		return 0;
	}

	public static double  fromUSDToCarrency(double summa, Carrency cur){
		if (cur==Carrency.BLR){
			return summa*2;
		}
		if (cur==Carrency.EUR){
			return summa/1.16;
		}
		if (cur==Carrency.PLN){
			return summa*3.7;
		}
		if (cur==Carrency.USD){
			return summa;
		}
		return 0;
	}

	public static double  fromCarrencyToCarrency(double summa, Carrency from, Carrency to){
		double summaInUSD=fromCarrencyToUSD(summa,from);
		return fromUSDToCarrency(summaInUSD,to);
	}
	
}
