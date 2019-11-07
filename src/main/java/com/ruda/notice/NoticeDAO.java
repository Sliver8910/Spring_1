package com.ruda.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;



@Repository
public class NoticeDAO {
	@Inject
	private DataSource dataSource;
	
	//글수정
	public int noticeUpdate(NoticeDTO noticeDTO)throws Exception{
		int result = 0;
		Connection con = dataSource.getConnection();
		String sql = "update notice set title=?, writer=?, contents=? where num=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, noticeDTO.getTitle());
		st.setString(2, noticeDTO.getWriter());
		st.setString(3, noticeDTO.getContents());
		st.setInt(4, noticeDTO.getNum());
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	//글쓰기
	public int noticeWrite(NoticeDTO noticeDTO) throws Exception{
		int result = 0;
		Connection con = dataSource.getConnection();
		String sql = "insert into notice values(board_seq.nextval, ?, ?, ?, sysdate,0 )";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, noticeDTO.getTitle());
		st.setString(2, noticeDTO.getWriter());
		st.setString(3, noticeDTO.getContents());
		result = st.executeUpdate();
		
		st.close();
		con.close();
		return result;
		
	}
	
	//selectList
	
	public NoticeDTO noticeSelect(int num) throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		Connection con = dataSource.getConnection();
		String sql = "select * from notice where num=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, num);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setWriter(rs.getString("writer"));
			noticeDTO.setContents(rs.getString("contents"));
			noticeDTO.setReg_date(rs.getDate("reg_date"));
			noticeDTO.setHit(rs.getInt("hit"));
		}
		
		rs.close();
		st.close();
		con.close();
		return noticeDTO;
	}

	//전체 리스트
	public List<NoticeDTO> noticeList()	throws Exception{
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
	
		return ar;
	}
}
