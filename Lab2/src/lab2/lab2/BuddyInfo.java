package lab2;



public class BuddyInfo {

	private String address;
	private String name;
	private String phoneNumber;
	
	public BuddyInfo (String name, String address, String phoneNumber) {
		
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		BuddyInfo myBuddy = new BuddyInfo ("Rohan Katkar", "2201 Riverside Drive", "647-774-0685");
		//myBuddy.setName("Rohan Katkar");
		//myBuddy.setAddress("2201 Riverside Drive");
		//myBuddy.setPhoneNumber ("647-774-0685");
		System.out.println ("Hello " + myBuddy.getName() + "!!");
		AddressBook myBook = new AddressBook();
		myBook.addBuddy(myBuddy);
		//myBook.addBuddy(myBuddy);
		myBook.removeBuddy(0);
		
	}
	

}
