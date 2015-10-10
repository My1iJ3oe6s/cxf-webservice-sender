package com.sp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 响应实体
 * 
 * @author StarPost
 * 
 */
@XmlRootElement(name = "Response")
public class ResponseModel implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String lang;

	private String Head;

	private String error;
 
	private Body   Body = new Body();
	

	
	@XmlElement(name = "Body")
	public Body getBody() {
		return Body;
	}
	@XmlAttribute(name = "lang")
	public String getLang() {
		return lang;
	}
	@XmlElement(name = "Head")
	public String getHead() {
		return Head;
	}

	@XmlElement(name = "ERROR")
	public String getError() {
		return error;
	}

	
	

	
	
	public void setBody(Body body) {
		Body = body;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}

	public void setHead(String head) {
		Head = head;
	}

	public void setError(String error) {
		this.error = error;
	}


}
