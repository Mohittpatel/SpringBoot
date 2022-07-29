package com.tnsif.deptinj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer 
{
	private int cid;
	private String cname;
	
	@Autowired
	private Product productdetails;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public void display()
	{
		System.out.println("Print Customer....");
		productdetails.show();
	}
	
}