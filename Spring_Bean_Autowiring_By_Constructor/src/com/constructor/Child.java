package com.constructor;

public class Child 
{
	private Integer childid;
	public Child()
	{
		System.out.println("Child default");
	}
	public Child(Parent pp)
	{
	 this.pp = pp;

	}
	public Child(Integer childid,String childname)
	{
		this.childid=childid;
		this.childname=childname;
	}
	private String childname;
	private Parent pp;
	public Integer getChildid() {
		return childid;
	}
	public void setChildid(Integer childid) {
		this.childid = childid;
	}
	public String getChildname() {
		return childname;
	}
	public void setChildname(String childname) {
		this.childname = childname;
	}
	public Parent getPp() {
		return pp;
	}
	public void setPp(Parent pp) {
		this.pp = pp;
	}
	public void displayinfo()
	{
		System.out.println("Chid id is:"+childid);
		System.out.println("Child name is:"+childname);
		System.out.println(pp.getParentid()+"...."+pp.getParentname()+"...."+pp.getParentadd());
		//pp.show();
	}

}
