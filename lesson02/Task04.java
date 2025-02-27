package edu.training.js.lesson02;

public class Task04 {

	public static void main(String[] args) {
		int n = 4; // малые бидоны
        int m = 3; // большие бидоны

        double milkInSmallCan = 80.0 / n;
        double milkInLargeCan = milkInSmallCan + 12.0;
        double totalMilkInLargeCans = milkInLargeCan * m;

        System.out.println("Количество молока в " + m + " больших бидонах: " + totalMilkInLargeCans + " литров");
	}

}
