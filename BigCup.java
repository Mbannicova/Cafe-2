package kitchen;

public class BigCup extends Cup{

	public BigCup(String liquidName, int liquidVolume) {
		
		super(liquidName, liquidVolume);
		setLiquidVolume(liquidVolume);			
	}
	
public void setLiquidVolume(Integer liquidVolume) {
		
		if (liquidVolume <= 1000 & liquidVolume >=0) {
			this.liquidVolume = liquidVolume;
			
		}
		else {
			System.out.println("Wrong volume!");
		}
	}
	
	
}

