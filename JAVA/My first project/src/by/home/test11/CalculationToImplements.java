package by.home.test11;

public class CalculationToImplements implements ICalculation{

	@Override
	public int summa(int a, int b) {
		return (a+b)*2;
	}

	@Override
	public int raznost(int a, int b) {
		return (a-b)*2;
	}
}
