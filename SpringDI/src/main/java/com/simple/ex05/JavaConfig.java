package com.simple.ex05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simple.ex01.Hello;
import com.simple.ex02.Chef;
import com.simple.ex02.Hotel;
import com.simple.ex03.DataSource;
import com.simple.ex03.MemberDAO;

@Configuration //스프링의 설정파일로 쓰겠다.
public class JavaConfig {

    private final Hello gildong;

    JavaConfig(Hello gildong) {
        this.gildong = gildong;
    }

	//<bean class="com.simple.ex01.Hello" id="gildong"/>
	@Bean
	public Hello gildong() {
		return new Hello();
	}
	
//	<bean class="com.simple.ex02.Chef" id="chef"/>
//  <bean class="com.simple.ex02.Hotel" id="hotel">
//  	<constructor-arg ref="chef"/>
//  </bean>
	
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	public Hotel hotel() {
		return new Hotel(chef());
	}
	
//	<bean class="com.simple.ex03.DataSource" id="datasource">
//		<property name="url" value="오라클주소" />
//		<property name="uid" value="jsp" />
//		<property name="upw" value="1234" />
//	</bean>
	
	@Bean
	public DataSource dataSource() {
		
		DataSource dataSource = new DataSource();
		dataSource.setUrl("postgres주소");
		dataSource.setUid("abc123");
		dataSource.setUpw("1234");
		
		return dataSource;
	}
	
//	<bean class="com.simple.ex03.MemberDAO" id="memberDAO">
//		<property name="dataSource" ref="datasource" />
//	</bean>
	
	//main에서 확인
	@Bean
	public MemberDAO memberDAO() {
		MemberDAO dao = new MemberDAO();
		dao.setDataSource(null);
		return dao;
	}
	
}
