package com.ruda.s1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	
	
	@RequestMapping("/notice/noticeSelect")
	public String noticeSelect() {
		
		return "notice/noticeSelect"; //forwarding할 루트와 확장자를 제외한jsp 주소
	}
	
	@RequestMapping("/notice/noticeWrite")
	public String noticeWrite() {
		
		return "notice/noticeWrite";
	}
	
	@RequestMapping("/notice/noticeList")
	public String noticeList() {
		
		return "notice/noticeList";
	}
	
	@RequestMapping("/test")
	public String test() {
		
		
		return "test";
	}
	
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	
	
}
