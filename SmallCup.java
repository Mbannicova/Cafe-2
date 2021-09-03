package kitchen;

public class SmallCup extends Cup{

	

		public SmallCup(String liquidName, int liquidVolume) {
	
		super(liquidName, liquidVolume);
		setLiquidVolume(liquidVolume);			
	}
	
	public void setLiquidVolume(Integer liquidVolume) {
		
		if (liquidVolume <= 250 & liquidVolume >=0) {
			this.liquidVolume = liquidVolume;
			
		}
		else {
			System.out.println("Wrong volume!");
		}
	}
	


	
}
