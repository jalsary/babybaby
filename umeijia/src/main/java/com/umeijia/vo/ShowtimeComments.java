package com.umeijia.vo;

import java.util.Date;

/**
 * 如果要通知用户，有多少动态评论未读，则在产生一条评论时，动态通知或推送给相关用户？？？？
 * **/
public class ShowtimeComments {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getShowtime_id() {
		return showtime_id;
	}
	public void setShowtime_id(long showtime_id) {
		this.showtime_id = showtime_id;
	}
	public int getUser_type() {
		return user_type;
	}
	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public int getResponse_user_type() {
		return response_user_type;
	}
	public void setResponse_user_type(int response_user_type) {
		this.response_user_type = response_user_type;
	}
	public long getResponse_user_id() {
		return response_user_id;
	}
	public void setResponse_user_id(long response_user_id) {
		this.response_user_id = response_user_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private long id;
	private long showtime_id;
	private int user_type; // 老师还是家长
	private long user_id; //家长或老师id
	private int response_user_type; //回复目标用户类型
	private long response_user_id; //回复目标用户的id
	private Date date;
}
