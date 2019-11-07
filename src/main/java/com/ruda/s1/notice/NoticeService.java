package com.ruda.s1.notice;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class NoticeService {
	@Inject
	private NoticeDAO noticeDAO;

	//@Inject
	public NoticeService(NoticeDAO noticeDAO) {
		// TODO Auto-generated constructor stub
		this.noticeDAO = noticeDAO;
	}
	
	
	
	//@Inject
	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}

	

	public List<NoticeDTO> noticeList() throws Exception{
		List<NoticeDTO> ar = noticeDAO.noticeList();
		return ar;
		
	}
	
	public NoticeDTO noticeSelect(int num)throws Exception{
		NoticeDTO noticeDTO = noticeDAO.noticeSelect(num);
		return noticeDTO;
	}
	
	public int noticeWrite(NoticeDTO noticeDTO)throws Exception{
		int result = noticeDAO.noticeWrite(noticeDTO);
		return result;
		
	}
	
	public int noticeUpdate(NoticeDTO noticeDTO)throws Exception{
		int result = noticeDAO.noticeUpdate(noticeDTO);
		return result;
		
	}
}
