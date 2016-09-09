package com.hhh.web.model.fund;

import java.util.Date;
import java.util.List;

public class AccountBean {
	private String id;

	private String companyId;

	private Date createtime;

	private String customerId;

	private String email;

	private int isAdmin;

	private String loginName;

	private String name;

	private String password;

	private String phone;

	private String slat;

	private int state;
	
	private List<RoleBean> role;

	private String userinfoId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSlat() {
		return slat;
	}

	public void setSlat(String slat) {
		this.slat = slat;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getUserinfoId() {
		return userinfoId;
	}

	public void setUserinfoId(String userinfoId) {
		this.userinfoId = userinfoId;
	}

	public List<RoleBean> getRole() {
		return role;
	}

	public void setRole(List<RoleBean> role) {
		this.role = role;
	}	
}
