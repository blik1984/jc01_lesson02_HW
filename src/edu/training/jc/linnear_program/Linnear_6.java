package edu.training.jc.linnear_program;
/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 */
public class Linnear_6 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double x;
		
		a = 1;
		b = 2;
		c = 3;
		
				//если выражение под корнем отрицательное, то нормального результата не будет, 
				//условные операторы ещё не проходили, потому не умеем проверять
		
		x = ((b + Math.sqrt(Math.pow(b,2) + 4*a*c))/2*a) - Math.pow(a,3) * c + Math.pow(b,-2);
		
		System.out.println(x);
	}

}
