package com.type;

public class Bank
{
	private Integer bankid;
	private String bankname;
	
	public Bank()
	{
		System.out.println("Bank default");
	}
	public Integer getBankid() {
		return bankid;
	}
	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public Bank(Integer bankid, String bankname) {
		super();
		this.bankid = bankid;
		this.bankname = bankname;
	}
    public String show()
    {
    	return bankid+"----"+bankname;
    }
}
