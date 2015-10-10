package com.sp.model;

public class BillsResponseWithUserIDDTO extends BillsResponseDTO {

	private static final long serialVersionUID = -7268065750309883865L;

	private String user_id;
	private String express_code;
	// 目的国家简码
	private String d_country;
	// 数量
	private String quantity;
	// 销售基本运费
	private String sales_base_fee;
	// 销售燃油费
	private String sales_fuel_fee;
	// 销售挂号费
	private String sales_register_fee;
	// 销售其他费
	private String sales_other_fee;
	// 成本总金额
	private String cost_amount;
	// 成本计费公式
	private String cost_formula;
	// 是否偏远,0,否
	private String remote_flag;
	// 账单类型,0,出货账单,1,退款账单,2,手续费账单
	private String bill_type;
	// 状态,0,正常
	private String bt_status;
	// 运单号
	private String bill_id;
	// 账单所属网点
	private String business_site;
	// 流水号
	private String bt_number;
	// 客户名称
	private String user_name;
	// 出库网点
	private String warehouse;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getExpress_code() {
		return express_code;
	}

	public void setExpress_code(String express_code) {
		this.express_code = express_code;
	}

	public String getD_country() {
		return d_country;
	}

	public void setD_country(String d_country) {
		this.d_country = d_country;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSales_base_fee() {
		return sales_base_fee;
	}

	public void setSales_base_fee(String sales_base_fee) {
		this.sales_base_fee = sales_base_fee;
	}

	public String getSales_fuel_fee() {
		return sales_fuel_fee;
	}

	public void setSales_fuel_fee(String sales_fuel_fee) {
		this.sales_fuel_fee = sales_fuel_fee;
	}

	public String getSales_register_fee() {
		return sales_register_fee;
	}

	public void setSales_register_fee(String sales_register_fee) {
		this.sales_register_fee = sales_register_fee;
	}

	public String getSales_other_fee() {
		return sales_other_fee;
	}

	public void setSales_other_fee(String sales_other_fee) {
		this.sales_other_fee = sales_other_fee;
	}

	public String getCost_amount() {
		return cost_amount;
	}

	public void setCost_amount(String cost_amount) {
		this.cost_amount = cost_amount;
	}

	public String getCost_formula() {
		return cost_formula;
	}

	public void setCost_formula(String cost_formula) {
		this.cost_formula = cost_formula;
	}

	public String getRemote_flag() {
		return remote_flag;
	}

	public void setRemote_flag(String remote_flag) {
		this.remote_flag = remote_flag;
	}

	public String getBill_type() {
		return bill_type;
	}

	public void setBill_type(String bill_type) {
		this.bill_type = bill_type;
	}

	public String getBt_status() {
		return bt_status;
	}

	public void setBt_status(String bt_status) {
		this.bt_status = bt_status;
	}

	public String getBill_id() {
		return bill_id;
	}

	public void setBill_id(String bill_id) {
		this.bill_id = bill_id;
	}

	public String getBusiness_site() {
		return business_site;
	}

	public void setBusiness_site(String business_site) {
		this.business_site = business_site;
	}

	public String getBt_number() {
		return bt_number;
	}

	public void setBt_number(String bt_number) {
		this.bt_number = bt_number;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

}
