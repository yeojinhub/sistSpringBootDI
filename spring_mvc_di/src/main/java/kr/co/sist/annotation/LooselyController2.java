package kr.co.sist.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class LooselyController2 {
	
	@Autowired
	private Service service;

	@GetMapping("/member2/add_proccess")
	public String addMember(TestDTO tDTO, Model model) {
		model.addAttribute("addResult", service.add(tDTO));
		model.addAttribute("data", tDTO);
		return "member2/addResult";
	} //addMember
	
	@GetMapping("/member2/search")
	public String searchMember(Model model) {
		model.addAttribute("data", service.search());
		
		return "member2/memberList";
	} //searchMember
	
} //class
