package com.ford.ds.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class vhgService {
	
	private static Logger logger = LoggerFactory.getLogger(vhgService.class);
	
	public void printServiceName() {
		logger.info("Print service");
	}
}
