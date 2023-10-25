package com.system.backoffice.sys.dis.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sys.dis.mapper.DisplayMapper;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class DisplayManageService {

	@Autowired
	private DisplayMapper displayMapper;
	
	public List<Map<String, Object>> selectDisplayAs() {
		// TODO Auto-generated method stub
		return displayMapper.selectDisplayAs();
	}
}
