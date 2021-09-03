package main;
import kitchen.BigCup;
import kitchen.Cup;

import kitchen.SmallCup;


public class Application {

	public static void main(String[] args) {
		kitchen.Cup cupA = new Cup ("Milk", 300);
		kitchen.Cup cupB = new Cup ("Water", 500);
		kitchen.SmallCup cupC = new SmallCup("Tea", 200);
		kitchen.BigCup cupE = new BigCup("Water", 200);
		
		//перелить всю оставшуюся воду из cupB  в эту большую чашку, вывести информацию на экран!
		
		cupA.setLiquidVolume(cupA.getLiquidVolume() - 50);
		cupB.setLiquidVolume(cupB.getLiquidVolume() + 50);
		cupE.setLiquidVolume(cupE.getLiquidVolume() + cupB.getLiquidVolume() );
		cupB.setLiquidVolume(cupB.getLiquidVolume() - cupB.getLiquidVolume() );
	   
		
	System.out.println(cupA.getLiquidName() + " - " + cupA.getLiquidVolume() + "ml");
	System.out.println(cupB.getLiquidName()+ " - " + cupB.getLiquidVolume() + "ml");
	System.out.println(cupC.getLiquidName()+ " - " + cupC.getLiquidVolume() + "ml");
	System.out.println(cupE.getLiquidName()+ " - " + cupE.getLiquidVolume() + "ml");
	
	}

}

