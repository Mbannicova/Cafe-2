package kitchen;

public class Cup {
	
	    private String liquidName;
	    protected Integer liquidVolume;
	    
	    public Cup(String liquidName, int liquidVolume ){
	        this.setLiquidName(liquidName);
	        this.setLiquidVolume(liquidVolume);
	    }
	    
		 public String getLiquidName() {
			return liquidName;
		}
		 public void setLiquidName(String liquidName) {
			
			if(liquidName .equals("Water") || liquidName .equals("Milk") || liquidName .equals("Tea")) {
				
			this.liquidName = liquidName;
			}
			
			else {
				System.out.println("Wrong drink!"); }
			
			}
		
		 public Integer getLiquidVolume() {
			return liquidVolume;
		}
		public void setLiquidVolume(Integer liquidVolume) {
			
			if (liquidVolume <= 600 & liquidVolume >=0) {
			this.liquidVolume = liquidVolume;
			}
			else {
				System.out.println("Wrong volume!");
			}
		}

	    
	}
	
	
