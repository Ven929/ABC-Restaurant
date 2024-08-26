package com.payment;


public class User {
    private int id;
    private String payerName;
    private String paymentType;
    private String paymentMethod;
    private String paymentAmount;
	public User(int id, String payerName, String paymentType, String paymentMethod, String paymentAmount) {
		super();
		this.id = id;
		this.payerName = payerName;
		this.paymentType = paymentType;
		this.paymentMethod = paymentMethod;
		this.paymentAmount = paymentAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPayerName() {
		return payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
    
    
	
}
