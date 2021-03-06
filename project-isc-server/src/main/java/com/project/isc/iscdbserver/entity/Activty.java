package com.project.isc.iscdbserver.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tb_activty")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Activty implements Serializable{

	private static final long serialVersionUId = 1L;
	
	// 活动ID
	@Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 64)
	private String activityId;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String type;  //类型  ISC  成就等
	@Column
	private String rate;  //1次 1周一次 1月一次等
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}
