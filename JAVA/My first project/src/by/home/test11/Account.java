package by.home.test11;

public class Account {
	double summa;
	Carrency carrency;
	IConverter iConv = new Converter();
	public void deposit(double summa, Account account){
		
		if (account.summa<iConv.fromCarrencyToCarrency(summa, carrency , account.carrency)){
		System.out.println("Няма бабла");
		}
		else{
		account.summa = account.summa - iConv.fromCarrencyToCarrency(summa, carrency , account.carrency);
		this.summa=this.summa+summa;
		}
	}

}
