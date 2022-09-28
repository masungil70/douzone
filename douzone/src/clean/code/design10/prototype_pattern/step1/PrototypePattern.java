package clean.code.design10.prototype_pattern.step1;

class CarRecord 
{
	private String carName_;
	private String carColor_;
	private String carNumber_;

	public CarRecord() {

    }

    public void Print()
    {
        System.out.println("Car Record"); 
        System.out.println("이름 : "  + carName_);
        System.out.println("색상 : "  + carColor_);
        System.out.println("번호 : " + carNumber_ + "\n");
    }

	public String getCarName() {
		return carName_;
	}

	public void setCarName(String carName_) {
		this.carName_ = carName_;
	}

	public String getCarColor() {
		return carColor_;
	}

	public void setCarColor(String carColor_) {
		this.carColor_ = carColor_;
	}

	public String getCarNumber() {
		return carNumber_;
	}

	public void setCarNumber(String carNumber_) {
		this.carNumber_ = carNumber_;
	}
}

class BikeRecord 
{
	private String bikeName_;
	private String bikeNumber_;

	public BikeRecord() {
    }

    public void Print() 
    {
    	 System.out.println("Bike Record");
    	 System.out.println("Name : " + bikeName_ );
    	 System.out.println("번호: " + bikeNumber_ + "\n");
    }

	public String getBikeName() {
		return bikeName_;
	}

	public void setBikeName(String bikeName_) {
		this.bikeName_ = bikeName_;
	}

	public String getBikeNumber() {
		return bikeNumber_;
	}

	public void setBikeNumber(String bikeNumber_) {
		this.bikeNumber_ = bikeNumber_;
	}

}

public class PrototypePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarRecord ferrari = new CarRecord();
	    BikeRecord yamaha = new BikeRecord();

	    ferrari.setCarName("Ferrari");
	    ferrari.setCarColor("빨간색");
	    ferrari.setCarNumber("5050");

	    yamaha.setBikeName("Yamaha");
	    yamaha.setBikeNumber("2525");

	    CarRecord ferrari1 = new CarRecord(); 
	    //동일 코드 반복 설정 
	    ferrari1.setCarName("Ferrari");
	    ferrari1.setCarColor("빨간색");
	    //다른 값 설정 
	    ferrari1.setCarNumber("5051");
	    
	    BikeRecord yamaha1 = new BikeRecord();
	    //동일 코드 반복 설정 
	    yamaha1.setBikeName("Yamaha");
	    //다른 값 설정 
	    yamaha1.setBikeNumber("2526");
	    
	    ferrari.Print();
	    ferrari1.Print();
	    yamaha.Print();
	    yamaha1.Print();
		    
	}

}
