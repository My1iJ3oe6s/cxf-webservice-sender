package com.sp.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

public class DownFinancialResponseDTO {


	//excel字节流，
	private List<String> financiaLstrlist;
	
	//开始时间
	private String startTime;
	
	//结束时间
	private String endTime;
	
	
	@XmlAttribute(name = "startTime")
	public String getstartTime() {
		return startTime;
	}
	@XmlAttribute(name = "endTime")
	public String getendTime() {
		return endTime;
	}
	@XmlAttribute(name = "financiaLstrlist")
	public List<String> getfinanciaLstrlist() {
		return financiaLstrlist;
	}
	
	public void setfinanciaLstrlist(List<String> financiaLstrlist) {
		this.financiaLstrlist = financiaLstrlist;
	}
	public void setstartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setendTime(String endTime) {
		this.endTime = endTime;
	}
	
	
	
	
	
	
	

}
