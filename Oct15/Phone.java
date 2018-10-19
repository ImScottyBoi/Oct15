import java.text.DecimalFormat;

/*
	 * Scott Weeden
	 * Date: 10.17.18
	 * Purpose: Allow for people to get random score's for animals.
	 */

	//attributes
	public class Phone {
		private String Manufacturer;
		private String Model;
		private double Price;
		private String Carrier;
		//constructor
		public Phone(String manufacturer, String model, double price, String carrier) {
			this.Manufacturer = manufacturer;
			this.Model = model;
			this.Price = price;
			this.Carrier = carrier;
		}
		DecimalFormat decimalFormat = new DecimalFormat("###-###-####");
		//score method
		public String call(double number) {
			return "I am calling " + decimalFormat.format(number);
		}
		public String text(String text) {
			return text;
		}
		
		public String animalStats(String animalScore) {
			return "";
			
		}

		@Override
		public String toString() {
		return "Manufacturer: \t" + Manufacturer
				+ "\nModel: \t\t" + Model
				+ "\nPrice: \t\t" + Price
				+ "\nCarrier: \t" + Carrier;
		}
		
	}


