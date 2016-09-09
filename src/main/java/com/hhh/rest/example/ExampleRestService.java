package com.hhh.rest.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hhh.dao.entity.SysUcenterAccount;
import com.hhh.rest.bean.example.WfProcessBean;
import com.hhh.service.example.WfProcessExampleService;
import com.hhh.service.fund.AccountService;
import com.hhh.web.model.fund.AccountBean;

@RestController
@RequestMapping("/exp")
public class ExampleRestService {
	@Autowired
	private WfProcessExampleService service;
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/wf", method = RequestMethod.GET)
	public  List<WfProcessBean> getAllWfProcess() {
		List<WfProcessBean> wfBean = service.getAllWfProcess();
		
		return wfBean;
	}
	
	@RequestMapping(value="/account", method = RequestMethod.GET)
	public AccountBean getAccout(String username) {
		return accountService.getAccountByUsername(username);
	}
}
