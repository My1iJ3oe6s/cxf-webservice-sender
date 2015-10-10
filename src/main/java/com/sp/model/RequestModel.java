package com.sp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 请求实体
 * 
 * @author StarPost
 * 
 */
@XmlRootElement(name = "Request")
public class RequestModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String lang;

	private String Head;

	private RequestBodyModel Body;

	@XmlAttribute(name = "lang")
	public String getLang() {
		return lang;
	}

	@XmlElement(name = "Head")
	public String getHead() {
		return Head;
	}

	@XmlElement(name = "Body")
	public RequestBodyModel getBody() {
		return Body;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public void setHead(String head) {
		Head = head;
	}

	public void setBody(RequestBodyModel body) {
		Body = body;
	}

}
