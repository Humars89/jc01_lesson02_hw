package edu.training.js.lesson02;

public class Task06 {

	public static void main(String[] args) {
		double a = 2.0;
        double b = 3.0; 
        double c = 4.0; 

        
        double result = (b + Math.sqrt (Math.pow (b, 2) + 4 * a * c)) / (2 * a) - Math.pow ( a, 3) * c + Math.pow (b, -2);

        System.out.println("Значение выражения: " + result);
	}

}
