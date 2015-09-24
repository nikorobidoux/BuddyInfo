//import java.util.*;

public class BuddyInfo {
	private String name;
	private String address;
	private int pNum;
	
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
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
	
	
	
	public BuddyInfo(String name, String address, int pNum){
		this.name = name;
		this.address = address;
		this.pNum = pNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
