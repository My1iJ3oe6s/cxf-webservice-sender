package com.sp.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import com.sp.model.OrderCargoDTO;
import com.sp.model.OrderDTO;
import com.sp.model.OrderResponseDTO;
import com.sp.model.RequestBodyModel;
import com.sp.model.RequestModel;
import com.sp.model.ResponseModel;

public class IspServiceTest {

	private IspService service = new spService();
	
	@Test
	public void testCreateOrder() {
		List<OrderDTO> orderList = createOrder(1);
		RequestModel req = new RequestModel();
		req.setLang("zh-CN");//en-US
		req.setHead("80010000");//测试账号
		String token = "47EC2DD791E31E2EF2076CAF64ED9B3D";
		
		RequestBodyModel orderBody = new RequestBodyModel();
		orderBody.setOrderList(orderList);
		req.setBody(orderBody);
		
		try {
			OrderResponseDTO respDTO= null;
			ResponseModel orderResp = service.createOrder(req, token);
			if(orderResp != null){
				for(int i=0;i<orderResp.getBody().getOrderResponse().size();i++){
					respDTO = orderResp.getBody().getOrderResponse().get(i);
					System.out.println(respDTO.getTracking_number()+";"+respDTO.getOrder_number()+";"+respDTO.getRef_number()+";"+respDTO.getStatus()+";"+respDTO.getErrorMsg());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testBatchCreateOrder() {
		
		List<OrderDTO> orderList = createOrder(10);
		
		RequestModel req = new RequestModel();
		req.setLang("zh-CN");//en-US
		req.setHead("80010000");//测试账号
		String token = "47EC2DD791E31E2EF2076CAF64ED9B3D";
		
		RequestBodyModel orderBody = new RequestBodyModel();
		orderBody.setOrderList(orderList);
		req.setBody(orderBody);
		
		try {
			OrderResponseDTO respDTO= null;
			ResponseModel orderResp = service.batchCreateOrder(req, token);
			if(orderResp != null){
				for(int i=0;i<orderResp.getBody().getOrderResponse().size();i++){
					respDTO = orderResp.getBody().getOrderResponse().get(i);
					System.out.println(respDTO.getTracking_number()+";"+respDTO.getOrder_number()+";"+respDTO.getRef_number()+";"+respDTO.getStatus()+";"+respDTO.getErrorMsg());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private List<OrderDTO> createOrder(Integer _count) {
		List<OrderDTO> orderList = new ArrayList<OrderDTO>();
		for (int i = 0; i < _count; i++) {
			OrderDTO o = new OrderDTO();
			o.setRef_number(System.currentTimeMillis()+StringUtils.EMPTY+i);
			o.setExpress_code("UKPS5");
			o.setBuyer_id("ahmedasas");
			o.setBuyer_email("");
			o.setInsurance_sign("0");
			o.setInsurance_amount("0");
			o.setGoods_type("0");
			o.setParcel_type("Gift");
			o.setCurrency("");
			o.setReturn_sign("0");
			o.setRemark("");
			o.setOperate_flag("2");
			o.setD_company("");
			o.setD_contact("Ahmed Asas");
			o.setD_tel("13596323302");
			o.setD_mobile("");
			o.setD_email("");
			o.setD_address("asas dairies");
			o.setD_country("GB");
			o.setD_province("iringa 255");
			o.setD_city("iringa");
			o.setD_post_code("92100");
			List<OrderCargoDTO> cargos = new ArrayList<OrderCargoDTO>();
			OrderCargoDTO t = new OrderCargoDTO();
			t.setOc_name_en("iphone5");
			t.setOc_quantity("1");
			t.setOc_value("1.0");
			t.setOc_hscode("HsCode");
			t.setOc_name_cn("iphonme5");
			t.setOc_remark("sss");
			t.setOc_sku("sku");
			t.setOc_weight("1.0");
			cargos.add(t);
			o.setCargos(cargos);
			o.setCargo_total_value("1.0");
			orderList.add(o);
		}
		return orderList;
	}
}
