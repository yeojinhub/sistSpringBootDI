package kr.co.sist.annotation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

/**
 * DBMS의 업무 목록을 구현.
 */
@Repository("mySql")
public class MySqlDAOImpl implements DAO {

	@Override
	public int insert(TestDTO tDTO) throws SQLException {
		int cnt = new Random().nextInt(2);
		//add into
		if(cnt == 0) {
			throw new SQLException("MySQL DB 추가실패");
		} //end if
		System.out.println("MySQL DB 추가성공");
		
		return cnt;
	} //insert

	@Override
	public List<TestDomain> select() throws SQLException {
		List<TestDomain> list = new ArrayList<TestDomain>();
		
		list.add(new TestDomain("이여진", 29));
		list.add(new TestDomain("장태규", 29));
		list.add(new TestDomain("김민경", 31));
		list.add(new TestDomain("이대웅", 27));
		list.add(new TestDomain("강태일", 30));
		list.add(new TestDomain("유명규", 28));
		
		return list;
	} //select

} //class
