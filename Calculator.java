/**
	Класс реализует калькулятор
*/
public class Calculator {
	/**
		Результат вычисления
	*/
		private int result;

	/**
		Суммирует аргументы.
		@param params Аргументы суммирования
	*/
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}

	/**
		Полуыить результат.
		@return результат вычисления.
	*/
	public int getResult() {
		return this.result;
	}

	/**
		Очистить рузельтат вычисления.
	*/
	public void cleanResult() {
		this.result = 0;
	}

}