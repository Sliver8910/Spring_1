package com.ruda.s1;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.ruda.s1.notice.NoticeDTO;
import com.ruda.s1.notice.NoticeService;

@Controller
@RequestMapping("/notice/**") //경로 미리 선언해서 /notice/이하 경로만 맵핑하면 됨
public class NoticeController {
	private NoticeService noticeservice;
	public NoticeController() {
		noticeservice = new NoticeService();
	}
	
	//select
	@RequestMapping( value = "noticeSelect", method = {RequestMethod.GET,RequestMethod.POST})
	public Model noticeSelect(Model model , int num) throws Exception {
		NoticeDTO noticeDTO = noticeservice.noticeSelect(num);
		model.addAttribute("dto" ,noticeDTO); 
		return model;
	}
	
	
	//list
	@RequestMapping("noticeList")
	public ModelAndView noticeList() throws Exception {
		
		List<NoticeDTO> ar = noticeservice.noticeList();
		// URL notice/noticeList
		// return "notice/noticeList";
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		return mv;
	}
	
	//noticeWrite Post
	@RequestMapping(value = "noticeWrite", method = RequestMethod.POST)
	public ModelAndView noticeWrite(NoticeDTO noticeDTO) throws Exception{
		int result = noticeservice.noticeWrite(noticeDTO);
		ModelAndView mv = new ModelAndView();
		String message = "Write Fail";
		if(result>0) {
			message = "Write Success";	
		}
		mv.addObject("msg", message);
		mv.addObject("path", "./noticeList");
		mv.setViewName("common/common_result");
		return mv;
	}
	
	//noticeWrite GET
	@RequestMapping(value = "noticeWrite", method = RequestMethod.GET)
	public String noticeWrite() {
		
		return "notice/noticeWrite";  //forwarding할 루트와 확장자를 제외한jsp 주소
	}
	
	//noticeUpdate Post
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.POST)
	public ModelAndView noticeUpdate(NoticeDTO noticeDTO) throws Exception{
		int result = noticeservice.noticeUpdate(noticeDTO);
		ModelAndView mv = new ModelAndView();
		String message = "Update Fail";
		if(result>0) {
			message = "Update Success";	
		}
		mv.addObject("msg", message);
		mv.addObject("path", "./noticeList");
		mv.setViewName("common/common_result");
		return mv;
	}
	
	//noticeWrite GET
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.GET)
	public Model noticeUpdate(int num, Model model) throws Exception {
		 NoticeDTO noticeDTO = noticeservice.noticeSelect(num);
		 model.addAttribute("dto", noticeDTO);
		 return model;
	}
	
	
	
	
	
}
