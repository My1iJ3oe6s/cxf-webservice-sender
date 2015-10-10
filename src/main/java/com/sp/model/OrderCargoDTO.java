package com.sp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * 订单明细实体类
 * 
 * @author StarPost
 * 
 */
public class OrderCargoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//****************东莞邮政****************//
	private String order_number;
	private String oc_name_en;
	private String oc_name_cn;
	private String oc_weight;
	private String oc_quantity;
	private String oc_value;
	private String oc_hscode;
	private String oc_sku;
	private String oc_url;
	private String oc_remark;
	//****************东莞邮政****************//
	//****************马来西亚挂号****************//
	private String user_id;
	//****************马来西亚挂号****************//
	
	@XmlAttribute(name = "oc_name_en")
	public String getOc_name_en() {
		return oc_name_en;
	}

	@XmlAttribute(name = "oc_name_cn")
	public String getOc_name_cn() {
		return oc_name_cn;
	}

	@XmlAttribute(name = "oc_weight")
	public String getOc_weight() {
		return oc_weight;
	}

	@XmlAttribute(name = "oc_quantity")
	public String getOc_quantity() {
		return oc_quantity;
	}

	@XmlAttribute(name = "oc_value")
	public String getOc_value() {
		return oc_value;
	}

	@XmlAttribute(name = "oc_hscode")
	public String getOc_hscode() {
		return oc_hscode;
	}

	@XmlAttribute(name = "oc_sku")
	public String getOc_sku() {
		return oc_sku;
	}

	@XmlAttribute(name = "oc_url")
	public String getOc_url() {
		return oc_url;
	}

	@XmlAttribute(name = "oc_remark")
	public String getOc_remark() {
		return oc_remark;
	}

	@XmlAttribute(name = "order_number")
	public String getOrder_number() {
		return order_number;
	}
	
	@XmlAttribute(name = "user_id")
	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public void setOc_name_en(String oc_name_en) {
		this.oc_name_en = oc_name_en;
	}

	public void setOc_name_cn(String oc_name_cn) {
		this.oc_name_cn = oc_name_cn;
	}

	public void setOc_weight(String oc_weight) {
		this.oc_weight = oc_weight;
	}

	public void setOc_quantity(String oc_quantity) {
		this.oc_quantity = oc_quantity;
	}

	public void setOc_value(String oc_value) {
		this.oc_value = oc_value;
	}

	public void setOc_hscode(String oc_hscode) {
		this.oc_hscode = oc_hscode;
	}

	public void setOc_sku(String oc_sku) {
		this.oc_sku = oc_sku;
	}

	public void setOc_url(String oc_url) {
		this.oc_url = oc_url;
	}

	public void setOc_remark(String oc_remark) {
		this.oc_remark = oc_remark;
	}

}