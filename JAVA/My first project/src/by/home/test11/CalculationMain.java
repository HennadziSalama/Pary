package by.home.test11;

public class CalculationMain {

	public static void main(String[] args) {
		ICalculation iCalc = new CalculationImplements();
		System.out.println(iCalc.summa(5, 6));
		ICalculation iCalc1 = new CalculationToImplements();
		System.out.println(iCalc1.summa(5, 6));
	}
}
