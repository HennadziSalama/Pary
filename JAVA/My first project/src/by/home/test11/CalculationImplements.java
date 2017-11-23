package by.home.test11;

public class CalculationImplements implements ICalculation{

	@Override
	public int summa(int a, int b) {
		return a+b;
	}
	@Override
	public int raznost(int a, int b) {
		return a-b;
	}
}
