public class AirConditioner {
	private String productName;
	private int temperature;
	private boolean isOn;

		
				
		public void setName(String productName) {
			this.productName = productName; 
		}
	
		public String getName() {
			return productName; 
		}

		public void setTemperature(int temperature) {
			this.temperature = temperature;
			
			if(temperature <= 18) {
				System.out.println("Temperature is low");
			}
			
			if(temperature > 18 && temperature <= 25) {
				System.out.println("Temperature is normal");
			}

			if(temperature >25) {
				System.out.println("Temperature is high");
			}
		}
	

		public int getTemperature() {
			return temperature;
		}

/*
		public void onOff(boolean isOn) {
			if(isOn >=1) {
				isOn = isOn
			}
		} */
}
