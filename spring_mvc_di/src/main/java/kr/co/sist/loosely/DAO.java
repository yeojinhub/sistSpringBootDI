package kr.co.sist.loosely;

import java.sql.SQLException;
import java.util.List;

/**
 * DBMS의 업무 목록 정의
 */
public interface DAO {
	
	public int insert(TestDTO tDTO)throws SQLException;
	public List<TestDomain> select() throws SQLException;
	
} //interface
