package question_five;

public class TestCarAndCellPhone {

	public static void main(String[] args) {
		 Car myCar = new Car("V8", 2017);
	        System.out.println("My car is: " + myCar.getMake() + " " + myCar.getYearModel());

	        
	        CellPhone myPhone = new CellPhone("GOOGLE_PIXEL", "3A", 130000);
	        System.out.println("My phone is:" + myPhone.getManufacturer() + " " + myPhone.getModel() + " Price " + myPhone.getRetailPrice()+" rwfr");
	}

}
