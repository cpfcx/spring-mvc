package com.baiwang.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.baiwang.po.Student;
/*
 * 
 * ����������������spring�Ĳ�������������в�����
 * ������Ĭ��֧��request response 
 * 
 * model �ӿ� modelmap �ӿ�ʵ���� ��ģ�����ݷ���request����
 * 
 *  @RequestParam(value="idd",required=true��defaultValue="0" Ĭ��ֵ������) Integer id
 *  
 *  session 
 *  
 *  post������web.xml�����ù�����  
 *  get������Ҫ�Լ�ת��
 * 
 * 
 * */
@Controller
public class StudentController {
	
	@RequestMapping(value = "/test.action/{id}",method=RequestMethod.GET)
	public ModelAndView handleRequest(@PathVariable String id) throws Exception {
		
		System.out.println(id);
		List<Student> StudentList = new ArrayList<Student>();
		Student s1 = new Student("1", "cui", "13");
		Student s2 = new Student("2", "peng", "17");
		StudentList.add(s1);
		StudentList.add(s2);
		ModelAndView mv = new ModelAndView();
		mv.addObject("StudentList",StudentList);
		mv.setViewName("/WEB-INF/jsp/student.jsp");
		
		return mv;
	}
	@RequestMapping(value="/test1.action",method=RequestMethod.POST)
	
	public @ResponseBody Student handleRequest1(@RequestBody Student s) throws Exception {
		
		System.out.println(s);
		
		
		return s;
	}
	@RequestMapping(value = "/test3.action")
	public ModelAndView handleRequest3(Student s) throws Exception {
		
		System.out.println(s);
		List<Student> StudentList = new ArrayList<Student>();
		Student s1 = new Student("1", "cui", "13");
		Student s2 = new Student("2", "peng", "17");
		StudentList.add(s1);
		StudentList.add(s2);
		ModelAndView mv = new ModelAndView();
		mv.addObject("StudentList",StudentList);
		mv.setViewName("/WEB-INF/jsp/student.jsp");
		
		return mv;
	}
	

}
