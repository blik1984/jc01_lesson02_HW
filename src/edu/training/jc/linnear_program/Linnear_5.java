package edu.training.jc.linnear_program;
/**
 * Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
 */
public class Linnear_5 {

	public static void main(String[] args) {
	
		double length;
		double width;
		double square;
		
		length = 5;
		
		width = length/2;
		square = length * width;
		
		System.out.println("Площадь прямоугольника с длиной " + length + " и шириной " + width + " составляет " + square + " квадратных единиц");
	}

}
