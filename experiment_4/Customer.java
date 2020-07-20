package project3;

public class Customer {
	
	public String name;
	private boolean member=false;
	private String memberType;
	
	public Customer(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean member) {
		this.member=member;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public void setMemberType(String type) {
		this.memberType=type;
	}
	
	public String toString() {
		return ("name:"+getName()+"  member:"+isMember()+"  memberType:"+getMemberType());
	}
}
