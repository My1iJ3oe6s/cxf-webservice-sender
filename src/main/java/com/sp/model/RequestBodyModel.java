package com.sp.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class RequestBodyModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<OrderDTO> orderList;

	private OrderConfirmDTO orderConfirm;

	// 根据跟踪号批量查询轨迹 跟踪号字符串 用逗号隔开
	private String trackList;

	// 根据时间差查询财务账单
	private String startTime;

	private String endTime;

	// 大客户参数
	private String specifications;
	private String type;

	/**
	 * 类型 pdf 或者是html
	 * 
	 * @return
	 */
	@XmlAttribute(name = "type")
	public String getType() {
		return type;
	}

	/**
	 * 规格
	 * 
	 * @return
	 */
	@XmlAttribute(name = "specifications")
	public String getSpecifications() {
		return specifications;
	}

	@XmlElement(name = "TrackList")
	public String getTrackList() {
		return trackList;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	@XmlElement(name = "OrderConfirm")
	public OrderConfirmDTO getOrderConfirm() {
		return orderConfirm;
	}

	@XmlElement(name = "Order")
	public List<OrderDTO> getOrderList() {
		return orderList;
	}

	@XmlElement(name = "StartTime")
	public String getStartTime() {
		return startTime;
	}

	@XmlElement(name = "EndTime")
	public String getEndTime() {
		return endTime;
	}

	public void setTrackList(String trackList) {
		this.trackList = trackList;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void setOrderList(List<OrderDTO> orderList) {
		this.orderList = orderList;
	}

	public void setOrderConfirm(OrderConfirmDTO orderConfirm) {
		this.orderConfirm = orderConfirm;
	}

}
