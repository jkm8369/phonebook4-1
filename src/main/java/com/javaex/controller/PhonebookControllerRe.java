package com.javaex.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.PhonebookServiceRe;
import com.javaex.vo.PersonVO;

@Controller
public class PhonebookControllerRe {

	@Autowired
	private PhonebookServiceRe phonebookServiceRe;
	
	//--전체 리스트
	@RequestMapping(value= "listRe", method = {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		System.out.println("PhonebookControllerRe.list()");
		
		List<PersonVO> personList = phonebookServiceRe.exeList();
		
		model.addAttribute("personList", personList);
		
		return "list";
	}
	
	
	//--수정폼 한명 데이터 가져오기
	@RequestMapping(value= "modifyformRe", method = {RequestMethod.GET, RequestMethod.POST})
	public String modifyForm(@RequestParam(value="no")int personId, Model model) {
		System.out.println("PhonebookControllerRe.modifyForm()");
		
		Map<String, Object> map = phonebookServiceRe.exeModifyForm(personId);
		
		model.addAttribute(map);
		
		return "modifyForm";
	}
	
	
	//--등록
	
	
	
	//--수정하기
	
	
	
	
	
}
