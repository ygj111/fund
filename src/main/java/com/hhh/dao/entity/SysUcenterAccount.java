package com.hhh.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sys_ucenter_account database table.
 * 
 */
@Entity
@Table(name="sys_ucenter_account")
@NamedQuery(name="SysUcenterAccount.findAll", query="SELECT s FROM SysUcenterAccount s")
public class SysUcenterAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="company_id")
	private String companyId;

	@Temporal(TemporalType.TIMESTAMP)
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

	@Column(name="userinfo_id")
	private String userinfoId;

	//bi-directional many-to-many association to SysUcenterRole
	@ManyToMany(cascade={CascadeType.ALL})
	@JoinTable(
		name="sys_ucenter_userrole"
		, joinColumns={
			@JoinColumn(name="accountid")
			}
		, inverseJoinColumns={
			@JoinColumn(name="roleid")
			}
		)
	@JsonIgnore
	private List<SysUcenterRole> sysUcenterRoles1;

	public SysUcenterAccount() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSlat() {
		return this.slat;
	}

	public void setSlat(String slat) {
		this.slat = slat;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getUserinfoId() {
		return this.userinfoId;
	}

	public void setUserinfoId(String userinfoId) {
		this.userinfoId = userinfoId;
	}

	public List<SysUcenterRole> getSysUcenterRoles1() {
		return this.sysUcenterRoles1;
	}

	public void setSysUcenterRoles1(List<SysUcenterRole> sysUcenterRoles1) {
		this.sysUcenterRoles1 = sysUcenterRoles1;
	}


}