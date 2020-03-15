package CONSTRUCTOR;

public class DeviceTest {

	String deviceType,name;
	
	public DeviceTest(String deviceType,String name) {
		this.deviceType=deviceType;
		this.name=name;
	}

}
class Apple extends Device{
	public Apple(String deviceType,String name) {
		super(deviceType,name);
		
	}
}