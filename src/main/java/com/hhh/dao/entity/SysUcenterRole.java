package com.hhh.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sys_ucenter_role database table.
 * 
 */
@Entity
@Table(name="sys_ucenter_role")
@NamedQuery(name="SysUcenterRole.findAll", query="SELECT s FROM SysUcenterRole s")
public class SysUcenterRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String customerId;

	private String desp;

	private String name;

	//bi-directional many-to-many association to SysUcenterAccount
	@ManyToMany(mappedBy="sysUcenterRoles1", cascade={CascadeType.ALL})
	private List<SysUcenterAccount> sysUcenterAccounts1;


	public SysUcenterRole() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDesp() {
		return this.desp;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SysUcenterAccount> getSysUcenterAccounts1() {
		return this.sysUcenterAccounts1;
	}

	public void setSysUcenterAccounts1(List<SysUcenterAccount> sysUcenterAccounts1) {
		this.sysUcenterAccounts1 = sysUcenterAccounts1;
	}

	

}