package com.riservation;

public class User {
    private int id;
    private String reservationType; 
    private String reservationDate; 
    private String contact;
    private String reservationTime; 
    private String location;        
    private String tableType;      
    private String specialRequests;
    
    
    
	public User(int id, String reservationType, String reservationDate, String contact, String reservationTime,
			String location, String tableType, String specialRequests) {
		
		this.id = id;
		this.reservationType = reservationType;
		this.reservationDate = reservationDate;
		this.contact = contact;
		this.reservationTime = reservationTime;
		this.location = location;
		this.tableType = tableType;
		this.specialRequests = specialRequests;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReservationType() {
		return reservationType;
	}
	public void setReservationType(String reservationType) {
		this.reservationType = reservationType;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTableType() {
		return tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}
	public String getSpecialRequests() {
		return specialRequests;
	}
	public void setSpecialRequests(String specialRequests) {
		this.specialRequests = specialRequests;
	} 
    
    

    
}
