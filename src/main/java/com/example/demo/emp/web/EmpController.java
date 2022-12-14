package com.example.demo.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.service.DeptVO;
import com.example.demo.emp.service.EmpVO;
import com.example.demo.emp.service.JobVO;

@Controller
public class EmpController {
	@Autowired
	EmpMapper dao;

	@RequestMapping("/empList")
	public String empList(Model model){ 
	model.addAttribute("empList", dao.getEmpList(null));
	return "empList"; 
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("str1", "<u>test</u>");
		return "test";
	}
	
	//등록페이지
	@RequestMapping("/empInsert")
	public String empInsertform(Model model) {
		return "insertEmp";
	}
	
	//수정페이지
	@GetMapping("/empUpdate")
	public String empUpdateForm(Model model, EmpVO vo) {
		model.addAttribute("emp", dao.getEmp(vo));
		return "empUpdate";
	}
	
	//중복으로 값 불러오는 부분
	@ModelAttribute("depts")
	public List<DeptVO> getDepartments(){
		return dao.getDepartments();
	}
	
	@ModelAttribute("jobs")
	public List<JobVO> getJobs(){
		return dao.getJobs();
	}
	
	@RequestMapping("/insert")
	public String empInsert(Model model) {
		return "redirect:empList";
	}

}
