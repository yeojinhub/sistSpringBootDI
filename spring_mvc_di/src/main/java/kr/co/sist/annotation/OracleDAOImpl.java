package kr.co.sist.annotation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

/**
 * DBMS의 업무 목록을 구현.
 */
//@Component
@Repository("ora")
public class OracleDAOImpl implements DAO {

	@Override
	public int insert(TestDTO tDTO) throws SQLException {
		int cnt = new Random().nextInt(2);
		//insert into 
		if(cnt == 0) {
			throw new SQLException("Oracle DB 추가실패");
		} //end if
		System.out.println("Oracle DB 추가성공");
		
		return 0;
	} //insert

	@Override
	public List<TestDomain> select() throws SQLException {
		List<TestDomain> list = new ArrayList<TestDomain>();
		
		list.add(new TestDomain("이여진2", 29));
		list.add(new TestDomain("장태규2", 29));
		list.add(new TestDomain("김민경2", 31));
		list.add(new TestDomain("이대웅2", 27));
		list.add(new TestDomain("강태일2", 30));
		list.add(new TestDomain("유명규2", 28));
		
		return list;
	} //select

} //class
