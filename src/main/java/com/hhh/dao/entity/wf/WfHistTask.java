package com.hhh.dao.entity.wf;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wf_hist_task database table.
 * 
 */
@Entity
@Table(name="wf_hist_task")
@NamedQuery(name="WfHistTask.findAll", query="SELECT w FROM WfHistTask w")
public class WfHistTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="action_url")
	private String actionUrl;

	@Column(name="create_time")
	private String createTime;

	@Column(name="display_name")
	private String displayName;

	@Column(name="expire_time")
	private String expireTime;

	@Column(name="finish_time")
	private String finishTime;

	private String operator;

	@Column(name="order_id")
	private String orderId;

	@Column(name="parent_task_id")
	private String parentTaskId;

	@Column(name="perform_type")
	private int performType;

	@Column(name="task_name")
	private String taskName;

	@Column(name="task_state")
	private int taskState;

	@Column(name="task_type")
	private int taskType;

	private String variable;

	public WfHistTask() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getParentTaskId() {
		return this.parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public int getPerformType() {
		return this.performType;
	}

	public void setPerformType(int performType) {
		this.performType = performType;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getTaskState() {
		return this.taskState;
	}

	public void setTaskState(int taskState) {
		this.taskState = taskState;
	}

	public int getTaskType() {
		return this.taskType;
	}

	public void setTaskType(int taskType) {
		this.taskType = taskType;
	}

	public String getVariable() {
		return this.variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

}