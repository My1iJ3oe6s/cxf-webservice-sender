package com.sp.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Body implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<OrderResponseDTO> orderResponse;

	// 获取轨迹数据
	private List<OrderTrackResponseDTO> trackResponse;

	// 获取财务数据
	private List<BillsResponseDTO> billResponse;

	// 获取财务数据
	private List<BillsResponseWithUserIDDTO> billResponseExt;

	// 下载财务清单 @XmlElementWrapper 只能位于集合属性上, 而
	// "com.sp.model.ResponseModel.downFinancialResponseDTO" 不是集合属性。
	private List<DownFinancialResponseDTO> downFinancialResponseDTO;

	@XmlElement(name = "downFinancialResponseDTO")
	public List<DownFinancialResponseDTO> getDownFinancialResponseDTO() {
		return downFinancialResponseDTO;
	}

	@XmlElement(name = "orderResponse")
	public List<OrderResponseDTO> getOrderResponse() {
		return orderResponse;
	}

	@XmlElement(name = "trackResponse")
	public List<OrderTrackResponseDTO> getTrackResponse() {
		return trackResponse;
	}

	@XmlElement(name = "billResponse")
	public List<BillsResponseDTO> getBillResponse() {
		return billResponse;
	}

	@XmlElement(name = "billResponseExt")
	public List<BillsResponseWithUserIDDTO> getBillResponseExt() {
		return billResponseExt;
	}

	public void setOrderResponse(List<OrderResponseDTO> orderResponse) {
		this.orderResponse = orderResponse;
	}

	public void setTrackResponse(List<OrderTrackResponseDTO> trackResponse) {
		this.trackResponse = trackResponse;
	}

	public void setBillResponse(List<BillsResponseDTO> billResponse) {
		this.billResponse = billResponse;
	}

	public void setBillResponseExt(List<BillsResponseWithUserIDDTO> billResponse) {
		this.billResponseExt = billResponse;
	}

	public void setDownFinancialResponseDTO(
			List<DownFinancialResponseDTO> downFinancialResponseDTO) {
		this.downFinancialResponseDTO = downFinancialResponseDTO;
	}

}
