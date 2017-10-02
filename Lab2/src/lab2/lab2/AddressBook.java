package lab2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private ArrayList<BuddyInfo> myBook = new ArrayList<BuddyInfo>();
	
	public AddressBook() {

		
	}


	public void addBuddy(BuddyInfo aBuddyInfo) {
		if (aBuddyInfo != null) {
			this.myBook.add(aBuddyInfo);
		}
		//BuddyInfo newBuddy = new BuddyInfo(Buddyname, address, PhoneNumber);
		//newBuddy.setName(Buddyname);
		//newBuddy.setAddress(address);
		//newBuddy.setPhoneNumber(PhoneNumber);
		//myBook.add(newBuddy);
		
	}
	
	
	public BuddyInfo removeBuddy(int index) {
		if (index >= 0 && index < this.myBook.size()) {
			return this.myBook.remove(index);
			
		}
		return null;
		
	}
	
	
	
	public static void main(String[] args) {
		//BuddyInfo buddy = new BuddyInfo
	}

}
