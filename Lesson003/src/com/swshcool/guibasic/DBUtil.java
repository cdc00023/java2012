package com.swshcool.guibasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 데이터베이스 연결과 관련한 메서드를 정의하는 클래스
 */
public class DBUtil {
	static final String JDBCDRV = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static final String DBUSER = "java";
	static final String DBPASSWORD = "1234";
	
	static Connection dbconn = null; //컨트롤 쉬프트 o, 자바 엔트롤 커넥션
	
	public static void DBConnect() {
		try {
			//step1. 드라이버 로드
			Class.forName(JDBCDRV);
			System.out.println("[MyMGS]JDBC 드라이버가 정상적으로 로드되었습니다");
			//step2. 테이터 베이스 연결
			dbconn = DriverManager.getConnection(URL, DBUSER, DBPASSWORD);
			
		} catch (ClassNotFoundException e) { //2.try-catch구문
			System.out.println("[MyMGS]JDBC 드라이버가 로드되지 않음");
			e.printStackTrace(); //오류 생긴 경로 출력
		} //1.하다가 오류생기면 어떻게 해야하는지 물어봄(넘기기/try-catch감싸줌)
		catch (SQLException e) {
			//1-1.try-catch Exception추가
			System.out.println("[MyMGS]데이터베이스 연결에 실패하였습니다.");
			e.printStackTrace();
		}
		
	}//end of DBCConnect()
	
	public static void DBClose() {
		try{
			dbconn.close();	
			System.out.println("[MyMGS]데이터베이스 연결을 종료합니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		System.out.println("[MyMGS]데이터베이스 연결을 .");
		}
		
	}//end of DBClose()
	
}//end of class
