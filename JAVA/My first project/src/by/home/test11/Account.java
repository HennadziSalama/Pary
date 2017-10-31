package by.home.test11;

public class Account {
	double summa;
	Carrency carrency;
	public void deposit(double summa, Account account){
		
		if (account.summa<Converter.fromCarrencyToCarrency(summa, carrency , account.carrency)){
		System.out.println("Няма бабла");
		}
		else{
		account.summa = account.summa - Converter.fromCarrencyToCarrency(summa, carrency , account.carrency);
		this.summa=this.summa+summa;
		}
	}

}
