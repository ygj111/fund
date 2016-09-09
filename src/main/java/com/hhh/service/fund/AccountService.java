package com.hhh.service.fund;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hhh.dao.entity.SysUcenterAccount;
import com.hhh.dao.entity.SysUcenterRole;
import com.hhh.dao.fund.SysAccountDao;
import com.hhh.web.model.fund.AccountBean;
import com.hhh.web.model.fund.RoleBean;

@Component
@Transactional
public class AccountService {
	@Autowired
	private SysAccountDao accountDao;
	
	@Transactional(propagation =Propagation.NOT_SUPPORTED, readOnly=true)
	public AccountBean getAccountByUsername(String username) {
		
		List<RoleBean> roleBeans = null;
		
		SysUcenterAccount account = accountDao.findByLoginName(username);
		List<SysUcenterRole> roles = account.getSysUcenterRoles1();
		
		if (roles != null) {
				roleBeans = new ArrayList<RoleBean>();
			for (int i = 0; i < roles.size(); i++) {
				SysUcenterRole role =roles.get(i);
				RoleBean roleBean = new RoleBean();
				
				BeanUtils.copyProperties(role, roleBean);
				
//				roleBean.setId(role.getId());
//				roleBean.setName(role.getName());
//				roleBean.setCustomerId(role.getCustomerId());
//				roleBean.setDesp(role.getDesp());
				
				roleBeans.add(roleBean);
			}
		}
		
		AccountBean accountBean = new AccountBean();
		BeanUtils.copyProperties(account, accountBean);
		
		
//		accountBean.setId(account.getId());
//		accountBean.setLoginName(account.getLoginName());
		accountBean.setRole(roleBeans);
		
		return accountBean;
	}
}
