package Cmn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	private String sql = "";
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public DAO(Connection con) {
		this.con = con;
	}
	
	
	 public DTO sltone(String id) {
		 DTO tmpMem = null;
		
		
		
		return tmpMem;
	}
	
}
