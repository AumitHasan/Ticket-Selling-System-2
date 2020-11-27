package com.aumit.ticketSell.torpedo;

public class TicketSearchJson {

	private String type;
	private String date;
	private String time;
	private String froma;
	private String toa;
	
	public TicketSearchJson(){
		
	}
	public TicketSearchJson(String type, String date, String time, String froma, String toa) {
		super();
		this.type = type;
		this.date = date;
		this.time = time;
		this.froma = froma;
		this.toa = toa;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFroma() {
		return froma;
	}
	public void setFroma(String froma) {
		this.froma = froma;
	}
	public String getToa() {
		return toa;
	}
	public void setToa(String toa) {
		this.toa = toa;
	}
	
	
	
}
