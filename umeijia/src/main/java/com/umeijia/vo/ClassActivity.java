package com.umeijia.vo;

import java.util.Date;
import java.util.List;

public class ClassActivity {

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage_urls() {
		return image_urls;
	}
	public void setImage_urls(String image_urls) {
		this.image_urls = image_urls;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public long getClass_id() {
		return class_id;
	}
	public void setClass_id(long class_id) {
		this.class_id = class_id;
	}
	public long getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(long teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getParticipate_num() {
		return participate_num;
	}
	public void setParticipate_num(int participate_num) {
		this.participate_num = participate_num;
	}
	public String getBaby_ids() {
		return baby_ids;
	}
	public void setBaby_ids(String baby_ids) {
		this.baby_ids = baby_ids;
	}
	public String getParent_ids() {
		return parent_ids;
	}
	public void setParent_ids(String parent_ids) {
		this.parent_ids = parent_ids;
	}
	public String getParticipate_time() {
		return participate_time;
	}
	public void setParticipate_time(String participate_time) {
		this.participate_time = participate_time;
	}
	private long id;
	private String title;
	private String content; // 活动内容
	private String image_urls;
	private Date start_date;
	private Date end_date;
	private long class_id;
	private long teacher_id;
	private int participate_num; //参与人数
	private String baby_ids; //谁参与了
	private String parent_ids; //参与人的家长
	private String participate_time; //参与时间


}
