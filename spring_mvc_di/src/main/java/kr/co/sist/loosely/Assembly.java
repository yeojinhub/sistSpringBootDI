package kr.co.sist.loosely;

import org.springframework.stereotype.Component;

/**
 * 1. 의존성 주입할 객체 생성,
 * 2. 의존성 주입받을 객체를 생성하여 의존성 주입,
 * 3. 의존성 주입받은 객체 반환
 */
@Component
public class Assembly {

	public Service getBean() {
		// 1. 의존성 주입할 객체 생성
		MySqlDAOImpl msDAO = new MySqlDAOImpl();
		//OracleDAOImpl msDAO = new OracleDAOImpl();
		
		// 2. 의존성 주입받을 객체를 생성하여 의존성 주입
		Service service = new ServiceImpl(msDAO);
		
		// 3. 의존성 주입받은 객체 반환
		return service;
	} //getBean
	
} //class
