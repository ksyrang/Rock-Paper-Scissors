package Cmn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DAO {
	
	private String sql = "";
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public DAO(Connection con) {
		this.con = con;
	}
	
	
	public int IstMem(DTO DTO) {
		int result = 0;
		sql = "INSERT INTO RSP_MEMBERS "+
				"(ID, PW, NAME, GENDER)"+
				"VALUES(?, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, DTO.getId());
			ps.setString(2, DTO.getPw());
			ps.setString(3, DTO.getName());
			ps.setString(4, DTO.getGender());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try { 
				if(ps != null) ps.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public DTO sltone(String id) {
		DTO tmpMem = new DTO();
		sql = "SELECT * FROM rsp_members WHERE id=?"; 
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				tmpMem.setId(rs.getString("ID"));
				tmpMem.setPw(rs.getString("PW"));
				tmpMem.setName(rs.getString("NAME"));
				tmpMem.setGender(rs.getString("GENDER"));
				tmpMem.setWin(rs.getInt("WIN"));
				tmpMem.setDefeat(rs.getInt("DEFEAT"));
				tmpMem.setRate(rs.getInt("RATE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return tmpMem;
	}
	
	public ArrayList<DTO> sltAll(){
		ArrayList<DTO> list = null;
		sql = "SELECT * FROM RSP_MEMBERS";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new DTO(rs.getString("id"),rs.getString("pw"),
						rs.getString("name"),rs.getString("gender"),
						rs.getInt("win"),rs.getInt("defeat"),rs.getInt("rate")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	public int Update(DTO DTO) {
		int result = 0;
		sql = "UPDATE RSP_MEMBERS SET "+
				"ID=?,PW=?,NAME=?,GENDER=?,WIN=?,DEFEAT=?,RATE=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, DTO.getId());
			ps.setString(2, DTO.getPw());
			ps.setString(3, DTO.getName());
			ps.setString(4, DTO.getGender());
			ps.setInt(5, DTO.getWin());
			ps.setInt(6, DTO.getDefeat());
			ps.setInt(7, DTO.getRate());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try { 
				if(ps != null) ps.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public int Delete(String id) {
		int result = 0;
		sql = "DELETE FROM RSP_MEMBERS WHERE id=? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try { 
				if(ps != null) ps.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
}
