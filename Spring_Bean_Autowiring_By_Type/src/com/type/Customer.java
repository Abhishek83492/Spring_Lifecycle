package com.type;

public class Customer
{
	private Integer custoid;
	private Bank bank;
	public Integer getCustoid() {
		return custoid;
	}
	public void setCustoid(Integer custoid) {
		this.custoid = custoid;
	}
	public String getCustoname() {
		return custoname;
	}
	public void setCustoname(String custoname) {
		this.custoname = custoname;
	}
	private String custoname;
	
	public Customer()
	{
		System.out.println("Customer default");
	}
	public Customer(Integer custoid, String custoname,Bank bank) {
		super();
		this.custoid = custoid;
		this.custoname = custoname;
		this.bank=bank;
	}
	public void displayinfo()
	{
		System.out.println("Customer id:"+custoid);
		System.out.println("Customer name:"+custoname);
		System.out.println(bank.show());
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}

}
