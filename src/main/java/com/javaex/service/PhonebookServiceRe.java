package com.javaex.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookRepository;
import com.javaex.vo.PersonVO;

@Service
public class PhonebookServiceRe {

	@Autowired
	private PhonebookRepository phonebookRepository;
	
	//--전체 리스트
	public List<PersonVO> exeList() {
		System.out.println("PhonebookServiceRe.exeList()");
		
		List<PersonVO> personList = phonebookRepository.personSelectList();
		
		return personList;
	}
	
	//--수정폼 한명 데이터 가져오기
	public Map<String, Object> exeModifyForm(int personId) {
		System.out.println("PhonebookServiceRe.exeModifyForm()");
		
		Map<String, Object> pMap = phonebookRepository.personSelectOne(personId);
		
		
		return pMap;
	}
	
	
	//--등록
	
	
	
	//--수정하기
	
	
	
}
