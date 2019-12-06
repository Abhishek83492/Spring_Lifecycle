package com.autodetet;

public class Categories 
{
	private String name;
	private Book book;
	
	public Categories(Book book)
	{
		this.book=book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public void show()
    {
    	System.out.println("Cname is:"+name);
    	System.out.println("book id is:"+book.getBookid());
    	System.out.println("Book name is:"+book.getBookname());
    }
	

}
