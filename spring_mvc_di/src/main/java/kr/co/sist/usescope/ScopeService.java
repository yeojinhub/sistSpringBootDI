package kr.co.sist.usescope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class ScopeService {
	
	private String name;
	private int age;
	
	@Value("${prgData.version}")
	private String version;
	@Value("${prgData.pubDate}")
	private String pubDate;
	@Value("${prgData.company}")
	private String company;
	
	public void info() {
		System.out.println("[ss]객체 프로그램 버전 : "+version);
		System.out.println("[ss]객체 프로그램 배포일자 : "+pubDate);
		System.out.println("[ss]객체 고개사 : "+company);
	} //info

} //class
