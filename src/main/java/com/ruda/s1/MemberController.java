package com.ruda.s1;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.ruda.s1.member.MemberDTO;

@Controller
@RequestMapping("/member/**")
public class MemberController {

	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public ModelAndView memberJoin(MemberDTO memberDTO) {
		ModelAndView mv = new ModelAndView();
		String message = "가입 실패";
		int result = 1;
		if(result>0) {
			message = "가입 성공";
		}
		mv.addObject("msg", message);
		mv.addObject("path", "../");
		
		mv.setViewName("common/common_result");
		return mv;
	}

	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public void memberJoin() {

	}
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public  ModelAndView memberLogin(MemberDTO memberDTO) {
		memberDTO = null;
		ModelAndView mv = new ModelAndView();
		String message = null;
		if(memberDTO ==null) {
			 message = "로그인 실패";
			mv.addObject("msg", message);
		}
		mv.addObject("path", "../");
		mv.setViewName("common/common_result");
		return mv;
	}

	@RequestMapping(value = "memberLogin", method = RequestMethod.GET)
	public void memberLogin() {

	}

}
