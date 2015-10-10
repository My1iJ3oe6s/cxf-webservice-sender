package com.sp.service;

import com.sp.model.RequestModel;
import com.sp.model.ResponseModel;

public interface IspService {

	/**
	 * 下单
	 * @param req
	 * @param token
	 * @return
	 * @throws Exception
	 */
	public ResponseModel createOrder(RequestModel req, String token) throws Exception;
	
	/**
	 * 批量下单
	 * @param req
	 * @param token
	 * @return
	 * @throws Exception
	 */
	public ResponseModel batchCreateOrder(RequestModel req, String token) throws Exception;
}
