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
 * 处理器适配器调用spring的参数绑定组件来进行参数绑定
 * 参数绑定默认支持request response 
 * 
 * model 接口 modelmap 接口实现类 将模型数据放在request域中
 * 
 *  @RequestParam(value="idd",required=true，defaultValue="0" 默认值的设置) Integer id
 *  
 *  session 
 *  
 *  post乱码在web.xml中配置过滤器  
 *  get乱码需要自己转换
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
