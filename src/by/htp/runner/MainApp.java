package by.htp.runner;

import by.htp.model.Calculator;

public class MainApp {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.calcIntNumbers();
		calc.calcFloatNumbers();
		calc.calcStrings();
		
	}

}
