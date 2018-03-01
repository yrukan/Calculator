package by.htp.model;

public class Calculator {

	private CalcScanner sc = new CalcScanner();
	
	public void calcIntNumbers(){
		System.out.println("Введите целое число 1:");
		int int_num1 = sc.enterInt();
		System.out.println("Введите целое число 2:");
		int int_num2 = sc.enterInt();
		String sign = enterAction();
		result(int_num1, int_num2, sign);
	}
	
	public void calcFloatNumbers(){
		System.out.println("Введите вещественное число 1:");
		float fl_num1 = sc.enterFloat();
		System.out.println("Введите вещественное число 2:");
		float fl_num2 = sc.enterFloat();	
		String sign = enterAction();
		result(fl_num1, fl_num2, sign);
	}
	
	public void calcStrings(){
		System.out.println("Введите строку 1:");
		String str1 = sc.enterString();
		System.out.println("Введите строку 2:");
		String str2 = sc.enterString();
		String sign = enterAction();
		result(str1, str2, sign);
	}
	
	public String enterAction(){
		System.out.println("Введите знак действия:");
		String sign = sc.enterString();				
		sign = sign.trim();
		return sign;
	}
	
	public void result(int n1, int n2, String act){
		if(act != null){
			int result = 0;
			if(act.equals("+"))
				result = n1 + n2;
			else if(act.equals("-"))
				result = n1 - n2;
			else if(act.equals("*"))
				result = n1 * n2;
			else if(act.equals("/")){
				checkDivToZero(n2);
				result = n1 / n2;
			}
			else{
				printIncorrectActionError();
				return;
			}			
			printResult(result);
		}else return;		
	}
	
	public void result(float n1, float n2, String act){
		if(act != null){
			float result = 0;
			if(act.equals("+"))
				result = n1 + n2;
			else if(act.equals("-"))
				result = n1 - n2;
			else if(act.equals("*"))
				result = n1 * n2;
			else if(act.equals("/")){
				checkDivToZero(n2);
				result = n1 / n2;
			}
			else{
				printIncorrectActionError();
				return;
			}
			printResult(result);
		}else return;

	}
	
	public void result(String n1, String n2, String act){
		String result = n1 + act + n2;
		if(result != null)
			printResult(result);
		else
			printNullPointerError();
	}
	
	public void checkDivToZero(int n){
		if(n == 0){
			printDivToZeroError();
			System.exit(1);
		}
	}
	
	public void checkDivToZero(float n){
		if(n == 0){
			printDivToZeroError();
			System.exit(1);
		}
	}
	
	public void printResult(int result){
		System.out.println("Результат действия: " + result);
		System.out.println("-----------------------------");
	}
	
	public void printResult(float result){
		System.out.println("Результат действия: " + result);
		System.out.println("-----------------------------");
	}
	
	public void printResult(String result){
		System.out.println("Результат действия: " + result);
		System.out.println("-----------------------------");
	}
	
	public static void printDivToZeroError(){
		System.out.println("Ошибка: Деление на ноль не может быть выполнено");
	}
	
	public static void printIncorrectActionError(){
		System.out.println("Ошибка: Неверно введен знак действия");			
	}
	
	public static void printNullPointerError(){
		System.out.println("Ошибка: Данные для вычисления не определены");			
	}

	
}
