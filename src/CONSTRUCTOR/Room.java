package CONSTRUCTOR;

public class Room  extends Building {
	int roomNumber;
	Room(String address,int floor,int roomNumber){
		super(floor,address);
		this.roomNumber=roomNumber;
	}
	public void print() {
		System.out.println(address +" "+floor+" "+roomNumber);
	}
public static void main(String[] args) {
	Room room=new Room("121 Test Drive",10,101);
 room.print();
}
}