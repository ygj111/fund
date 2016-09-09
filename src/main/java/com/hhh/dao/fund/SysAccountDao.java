package com.hhh.dao.fund;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hhh.dao.entity.SysUcenterAccount;

@Repository
public interface SysAccountDao extends CrudRepository<SysUcenterAccount, String> {
	public SysUcenterAccount findByLoginName(String loginName);
}
