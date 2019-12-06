package com.constructor;

public class Parent
{
	private Integer parentid;
	private String parentname;
	/*public Parent()
	{
		System.out.println("Parent Default");
	}
*/	public Integer getParentid() {
		return parentid;
	}
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
	public String getParentname() {
		return parentname;
	}
	public void setParentname(String parentname) {
		this.parentname = parentname;
	}
	public String getParentadd() {
		return parentadd;
	}
	public void setParentadd(String parentadd) {
		this.parentadd = parentadd;
	}
	/*public Parent(Integer parentid, String parentname, String parentadd) {
		super();
		this.parentid = parentid;
		this.parentname = parentname;
		this.parentadd = parentadd;
		System.out.println("i am here in parent");
	}*/
	private String parentadd;
    public void  show()
    {
    	System.out.println(parentid);
    	System.out.println(parentname);
    	System.out.println(parentadd);
    }
}
