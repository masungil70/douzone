package clean.code.design10.prototype_pattern.step2;

enum RECORD_TYPE
{
    CAR,
    BIKE
};

interface Record
{
    Record clone();
    void print();
};

class CarRecord implements Record
{
	private String carName_;
	private String carColor_;
	private String carNumber_;

	private CarRecord() {
		
	}
	
	//factory pattern을 이용한 객체 생성 메서드 제공 
	public static CarRecord createObject() {
		return new CarRecord();  
	}

	//이부분이 prototype pattern을 위한  메소드  
	@Override
	public Record clone() {
		CarRecord result = createObject();
		
		result.carName_ = this.carName_;
		result.carColor_ = this.carColor_;
		result.carNumber_ = this.carNumber_;
		
		return result;
	}
	
	@Override
    public void print()
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

class BikeRecord  implements Record
{
	private String bikeName_;
	private String bikeNumber_;

	private BikeRecord() {
    }

	
	public static BikeRecord createObject() {
		return new BikeRecord();  
	}

	@Override
	public Record clone() {
		BikeRecord result = createObject();
		
		result.bikeName_ = this.bikeName_;
		result.bikeNumber_ = this.bikeNumber_;
	
		return result;
	}
	
	@Override
    public void print() 
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
		CarRecord ferrari = CarRecord.createObject();
	    BikeRecord yamaha = BikeRecord.createObject();

	    ferrari.setCarName("Ferrari");
	    ferrari.setCarColor("빨간색");
	    ferrari.setCarNumber("5050");

	    yamaha.setBikeName("Yamaha");
	    yamaha.setBikeNumber("2525");

	    CarRecord ferrari1 = (CarRecord) ferrari.clone(); 
	    //동일 코드 반복 설정  prototype에 의해서 기본 값 설정됨  
//	    ferrari1.setCarName("Ferrari");
//	    ferrari1.setCarColor("빨간색");
	    //다른 값 설정 
	    ferrari1.setCarNumber("5051");
	    
	    BikeRecord yamaha1 = (BikeRecord)yamaha.createObject();
	    //동일 코드 반복 설정
	    //동일 코드 반복 설정  prototype에 의해서 기본 값 설정됨  
//	    yamaha1.setBikeName("Yamaha");
	    //다른 값 설정 
	    yamaha1.setBikeNumber("2526");
	    
	    ferrari.print();
	    ferrari1.print();
	    yamaha.print();
	    yamaha1.print();
		    
	}

}
