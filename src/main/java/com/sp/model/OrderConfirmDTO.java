package com.sp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

public class OrderConfirmDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ref_number;

	private String tracking_number;

	private String order_number;

	private String operate_flag;

	@XmlAttribute(name = "ref_number")
	public String getRef_number() {
		return ref_number;
	}

	@XmlAttribute(name = "tracking_number")
	public String getTracking_number() {
		return tracking_number;
	}

	@XmlAttribute(name = "order_number")
	public String getOrder_number() {
		return order_number;
	}

	@XmlAttribute(name = "operate_flag")
	public String getOperate_flag() {
		return operate_flag;
	}

	public void setRef_number(String ref_number) {
		this.ref_number = ref_number;
	}

	public void setTracking_number(String tracking_number) {
		this.tracking_number = tracking_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public void setOperate_flag(String operate_flag) {
		this.operate_flag = operate_flag;
	}

}
