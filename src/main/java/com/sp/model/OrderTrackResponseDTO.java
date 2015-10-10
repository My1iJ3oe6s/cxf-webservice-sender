package com.sp.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 订单轨迹实体类
 * 
 * @author lijing
 * 
 */
@XmlSeeAlso({ TrackDTO.class })
public class OrderTrackResponseDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	// 客户订单号
	private String ref_number;

	// 订单号
	private String order_number;
	// 跟踪号
	private String tranking_number;

	// 跟踪轨迹
	private List<TrackDTO> tracking_list;

	// 是否查询成功
	private String status = "error";
	// 失败原因
	private String errorMsg = "According to the tracking number can not find the corresponding order or tracking number can not find the trajectory information";

	@XmlAttribute(name = "status")
	public String getStatus() {
		return status;
	}

	@XmlAttribute(name = "errorMsg")
	public String getErrorMsg() {
		return errorMsg;
	}


	

	@XmlAttribute(name = "ref_number")
	public String getRef_number() {
		return ref_number;
	}

	@XmlAttribute(name = "order_number")
	public String getOrder_number() {
		return order_number;
	}

	@XmlAttribute(name = "tranking_number")
	public String getTranking_number() {
		return tranking_number;
	}

	@XmlElementWrapper(name = "TrankingList")
	@XmlElement(name = "TrackDTO")
	public List<TrackDTO> getTracking_list() {
		return tracking_list;
	}

	public void setRef_number(String ref_number) {
		this.ref_number = ref_number;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public void setTranking_number(String tranking_number) {
		this.tranking_number = tranking_number;
	}

	public void setTracking_list(List<TrackDTO> tracking_list) {
		this.tracking_list = tracking_list;
	}

}
