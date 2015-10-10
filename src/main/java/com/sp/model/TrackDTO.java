package com.sp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 轨迹信息实体类
 * 
 * @author lijing
 * 
 */
@XmlRootElement(name = "TrackDTO")
public class TrackDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	// 轨迹信息
	private String action_log;
	// 操作记录时间
	private String date_time;

	@XmlAttribute(name = "action_log")
	public String getAction_log() {
		return action_log;
	}

	@XmlAttribute(name = "date_time")
	public String getDate_time() {
		return date_time;
	}

	public void setAction_log(String action_log) {
		this.action_log = action_log;
	}

	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}

}
