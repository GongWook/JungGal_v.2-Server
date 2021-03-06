package com.GNU_Graduate_Project_Team.JungGal_v2;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DbConnectTest {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/junggal_v2_database?serverTimezone=Asia/Seoul";
	private String uid = "root";
	private String upw = "mysql";
	
	//DB연결 테스트
	@Test
	public void connectTest()
	{
		Connection conn = null;
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, uid, upw);
			System.out.println("DB 커넥션 성공");
			System.out.println("conn : " + conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}
