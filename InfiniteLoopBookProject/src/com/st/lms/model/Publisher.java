package com.st.lms.model;

public class Publisher extends Entry {
	private String pubAddr;
	private long pubPhone;
	
	public Publisher(String name, int id, String pubAddr, long pubPhone) {
		super(name, id);
		this.pubAddr = pubAddr;
		this.pubPhone = pubPhone;
	}
	
	public Publisher(int id, String name, String pubAddr, long pubPhone) {
		super(name, id);
		this.pubAddr = pubAddr;
		this.pubPhone = pubPhone;
	}
	
	public String getAddr() {
		return this.pubAddr;
	}
	
	public void setAddr(String pubAddr) {
		this.pubAddr = pubAddr;
	}
	
	public long getPhone() {
		return this.pubPhone;
	}
	
	public void setPhone(long pubPhone) {
		this.pubPhone = pubPhone;
	}
}
