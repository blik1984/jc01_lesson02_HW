package edu.training.jc.linnear_program;

/**
 * Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших
 * бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
 */

public class Linnear4 {

	public static void main(String[] args) {
		
		double valueOneSmallCan;		
		int quantitySmallCan;			//n.   Счиатем что все количества будут положительные и не проверяем.
		double valueAllSmallCan;		
		double valueOneBigCan;
		int quantityBigCan;			//m
		double valueAllBigCan;
		
		valueAllSmallCan = 80;
		quantitySmallCan = 5;
		quantityBigCan = 8;
		
		valueOneSmallCan = valueAllSmallCan/quantitySmallCan;
		valueOneBigCan = valueOneSmallCan + 12;
		valueAllBigCan = valueOneBigCan * quantityBigCan;
		
		System.out.println("Объём молока в " + quantityBigCan + "бидонах составляет " + valueAllBigCan + " литров");
		
	}
}
