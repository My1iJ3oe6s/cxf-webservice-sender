package com.sp.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * 订单实体类
 * 
 * @author StarPost
 * 
 */
public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	// ========== Html 模板使用字段  ============
	private String user_id;
	private String channel_name_cn;
	private String country_lattice_no;
	private String d_country_code;
	private String d_country_cn;
	private String d_country_en;
	private String datetime;
//	private String htmlType;

 
	// ========== Html 模板使用字段  ============
	
	
	private String order_number;
	private String express_code;
	private String tracking_number;
	private String ref_number;
	private String buyer_id;
	private String buyer_email;
	private String insurance_sign;
	private String insurance_amount;
	private String goods_type;
	private String parcel_type;
	private String cargo_total_quantity;
	private String cargo_total_weight;
	private String cargo_total_value;
	private String currency;
	private String return_sign;
	private String remark;

	private String operate_flag;

	private String j_company;
	private String j_contact;
	private String j_tel;
	private String j_mobile;
	private String j_address;
	private String j_post_code;
	private String j_country;
	private String j_province;
	private String j_city;
	private String j_email;

	private String d_company;
	private String d_contact;
	private String d_tel;
	private String d_mobile;
	private String d_address;
	private String d_province;
	private String d_city;
	private String d_country;
	private String d_post_code;
	private String d_email;

	List<OrderCargoDTO> cargos;

	private String error;



	@XmlAttribute(name = "error")
	public String getError() {
		return error;
	}


	@XmlAttribute(name = "order_number")
	public String getOrder_number() {
		return order_number;
	}

	@XmlAttribute(name = "express_code")
	public String getExpress_code() {
		return express_code;
	}

	@XmlAttribute(name = "tracking_number")
	public String getTracking_number() {
		return tracking_number;
	}

	@XmlAttribute(name = "ref_number")
	public String getRef_number() {
		return ref_number;
	}

	@XmlAttribute(name = "buyer_id")
	public String getBuyer_id() {
		return buyer_id;
	}

	@XmlAttribute(name = "buyer_email")
	public String getBuyer_email() {
		return buyer_email;
	}

	@XmlAttribute(name = "insurance_sign")
	public String getInsurance_sign() {
		return insurance_sign;
	}

	@XmlAttribute(name = "insurance_amount")
	public String getInsurance_amount() {
		return insurance_amount;
	}

	@XmlAttribute(name = "goods_type")
	public String getGoods_type() {
		return goods_type;
	}

	@XmlAttribute(name = "parcel_type")
	public String getParcel_type() {
		return parcel_type;
	}

	@XmlAttribute(name = "cargo_total_quantity")
	public String getCargo_total_quantity() {
		return cargo_total_quantity;
	}

	@XmlAttribute(name = "cargo_total_weight")
	public String getCargo_total_weight() {
		return cargo_total_weight;
	}

	@XmlAttribute(name = "cargo_total_value")
	public String getCargo_total_value() {
		return cargo_total_value;
	}

	@XmlAttribute(name = "currency")
	public String getCurrency() {
		return currency;
	}

	@XmlAttribute(name = "return_sign")
	public String getReturn_sign() {
		return return_sign;
	}

	@XmlAttribute(name = "remark")
	public String getRemark() {
		return remark;
	}

	@XmlAttribute(name = "j_company")
	public String getJ_company() {
		return j_company;
	}

	@XmlAttribute(name = "j_contact")
	public String getJ_contact() {
		return j_contact;
	}

	@XmlAttribute(name = "j_tel")
	public String getJ_tel() {
		return j_tel;
	}

	@XmlAttribute(name = "j_mobile")
	public String getJ_mobile() {
		return j_mobile;
	}

	@XmlAttribute(name = "j_address")
	public String getJ_address() {
		return j_address;
	}

	@XmlAttribute(name = "j_post_code")
	public String getJ_post_code() {
		return j_post_code;
	}

	@XmlAttribute(name = "j_country")
	public String getJ_country() {
		return j_country;
	}

	@XmlAttribute(name = "j_province")
	public String getJ_province() {
		return j_province;
	}

	@XmlAttribute(name = "j_city")
	public String getJ_city() {
		return j_city;
	}

	@XmlAttribute(name = "j_email")
	public String getJ_email() {
		return j_email;
	}

	@XmlAttribute(name = "d_company")
	public String getD_company() {
		return d_company;
	}

	@XmlAttribute(name = "d_contact")
	public String getD_contact() {
		return d_contact;
	}

	@XmlAttribute(name = "d_tel")
	public String getD_tel() {
		return d_tel;
	}

	@XmlAttribute(name = "d_mobile")
	public String getD_mobile() {
		return d_mobile;
	}

	@XmlAttribute(name = "d_address")
	public String getD_address() {
		return d_address;
	}

	@XmlAttribute(name = "d_province")
	public String getD_province() {
		return d_province;
	}

	@XmlAttribute(name = "d_city")
	public String getD_city() {
		return d_city;
	}

	@XmlAttribute(name = "d_country")
	public String getD_country() {
		return d_country;
	}

	@XmlAttribute(name = "d_post_code")
	public String getD_post_code() {
		return d_post_code;
	}

	@XmlAttribute(name = "d_email")
	public String getD_email() {
		return d_email;
	}

	@XmlElement(name = "Cargo")
	public List<OrderCargoDTO> getCargos() {
		return cargos;
	}

	@XmlAttribute(name = "operate_flag")
	public String getOperate_flag() {
		return operate_flag;
	}

	

//	@XmlAttribute(name = "htmlType")
//	public String getHtmlType() {
//		return htmlType;
//	}
//
//
//	public void setHtmlType(String htmlType) {
//		this.htmlType = htmlType;
//	}
	public void setOperate_flag(String operate_flag) {
		this.operate_flag = operate_flag;
	}


	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public void setExpress_code(String express_code) {
		this.express_code = express_code;
	}

	public void setTracking_number(String tracking_number) {
		this.tracking_number = tracking_number;
	}


	public void setRef_number(String ref_number) {
		this.ref_number = ref_number;
	}

	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}

	public void setBuyer_email(String buyer_email) {
		this.buyer_email = buyer_email;
	}

	public void setInsurance_sign(String insurance_sign) {
		this.insurance_sign = insurance_sign;
	}

	public void setInsurance_amount(String insurance_amount) {
		this.insurance_amount = insurance_amount;
	}

	public void setGoods_type(String goods_type) {
		this.goods_type = goods_type;
	}

	public void setParcel_type(String parcel_type) {
		this.parcel_type = parcel_type;
	}

	public void setCargo_total_quantity(String cargo_total_quantity) {
		this.cargo_total_quantity = cargo_total_quantity;
	}

	public void setCargo_total_weight(String cargo_total_weight) {
		this.cargo_total_weight = cargo_total_weight;
	}

	public void setCargo_total_value(String cargo_total_value) {
		this.cargo_total_value = cargo_total_value;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setReturn_sign(String return_sign) {
		this.return_sign = return_sign;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setJ_company(String j_company) {
		this.j_company = j_company;
	}

	public void setJ_contact(String j_contact) {
		this.j_contact = j_contact;
	}

	public void setJ_tel(String j_tel) {
		this.j_tel = j_tel;
	}

	public void setJ_mobile(String j_mobile) {
		this.j_mobile = j_mobile;
	}

	public void setJ_address(String j_address) {
		this.j_address = j_address;
	}

	public void setJ_post_code(String j_post_code) {
		this.j_post_code = j_post_code;
	}

	public void setJ_country(String j_country) {
		this.j_country = j_country;
	}

	public void setJ_province(String j_province) {
		this.j_province = j_province;
	}

	public void setJ_city(String j_city) {
		this.j_city = j_city;
	}

	public void setJ_email(String j_email) {
		this.j_email = j_email;
	}

	public void setD_company(String d_company) {
		this.d_company = d_company;
	}

	public void setD_contact(String d_contact) {
		this.d_contact = d_contact;
	}

	public void setD_tel(String d_tel) {
		this.d_tel = d_tel;
	}

	public void setD_mobile(String d_mobile) {
		this.d_mobile = d_mobile;
	}

	public void setD_address(String d_address) {
		this.d_address = d_address;
	}

	public void setD_province(String d_province) {
		this.d_province = d_province;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setD_city(String d_city) {
		this.d_city = d_city;
	}

	public void setD_country(String d_country) {
		this.d_country = d_country;
	}

	public void setD_post_code(String d_post_code) {
		this.d_post_code = d_post_code;
	}

	public void setD_email(String d_email) {
		this.d_email = d_email;
	}

	public void setCargos(List<OrderCargoDTO> cargos) {
		this.cargos = cargos;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getChannel_name_cn() {
		return channel_name_cn;
	}

	public String getCountry_lattice_no() {
		return country_lattice_no;
	}

	public void setChannel_name_cn(String channel_name_cn) {
		this.channel_name_cn = channel_name_cn;
	}

	public void setCountry_lattice_no(String country_lattice_no) {
		this.country_lattice_no = country_lattice_no;
	}

	public String getD_country_code() {
		return d_country_code;
	}

	public String getD_country_cn() {
		return d_country_cn;
	}

	public String getD_country_en() {
		return d_country_en;
	}

	public void setD_country_code(String d_country_code) {
		this.d_country_code = d_country_code;
	}

	public void setD_country_cn(String d_country_cn) {
		this.d_country_cn = d_country_cn;
	}

	public void setD_country_en(String d_country_en) {
		this.d_country_en = d_country_en;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

}
