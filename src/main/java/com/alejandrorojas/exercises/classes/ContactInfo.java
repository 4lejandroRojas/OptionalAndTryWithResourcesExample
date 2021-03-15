package com.alejandrorojas.exercises.classes;

public final class ContactInfo {
	private ContactType type;
	private String contacDirection;
	
	public ContactInfo(ContactType type, String contacDirection) {
		super();
		this.type = type;
		this.contacDirection = contacDirection;
	}
	
	ContactType getType() {
		return type;
	}
	void setType(ContactType type) {
		this.type = type;
	}
	String getContacDirection() {
		return contacDirection;
	}
	void setContacDirection(String contacDirection) {
		this.contacDirection = contacDirection;
	}
	@Override
	public String toString() {
		return "ContactInfo [type=" + type + ", contacDirection=" + contacDirection + "]";
	}
}
