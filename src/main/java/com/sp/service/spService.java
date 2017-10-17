package com.sp.service;

import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.sp.model.RequestModel;
import com.sp.model.ResponseModel;
import com.sp.utils.JaxbUtil;
import com.sp.utils.PasswordEncryption;
import com.sp.utils.StringUtil;
import com.sp.utils.JaxbUtil.CollectionWrapper;

public class spService implements IspService {

	//测试接口地址
	private static final String _point = "https://api.starpost.cn/spservice/ws/spservice?wsdl";

	private static JaxbUtil requestBinder = new JaxbUtil(RequestModel.class,
			CollectionWrapper.class);

	private static JaxbUtil respBinder = new JaxbUtil(ResponseModel.class,
			CollectionWrapper.class);

	@Override
	public ResponseModel createOrder(RequestModel req, String token)
			throws Exception {
		QName qName = new QName("http://service.sp.com/", "orderService");
		return invoke(qName, req, token);
	}

	@Override
	public ResponseModel batchCreateOrder(RequestModel req, String token)
			throws Exception {
		QName qName = new QName("http://service.sp.com/", "batchOrderService");
		return invoke(qName, req, token);
	}

	private ResponseModel invoke(QName qName, RequestModel req, String token)
			throws Exception {
		String xml = requestBinder.toXml(req, "UTF-8");
		String verifyCode = StringUtil.base64encoded(PasswordEncryption
				.encrypt(xml + token));

		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient(_point);
		Object[] objects = client.invoke(qName, xml, verifyCode);

		ResponseModel orderResp = null;
		if (objects[0] != null && objects[0] != null) {
			orderResp = respBinder.fromXml(objects[0].toString());
		}
		return orderResp;
	}

}
