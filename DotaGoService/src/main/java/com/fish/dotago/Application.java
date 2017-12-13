package com.fish.dotago;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Wayne
 * @date 2017年12月12日
 *
 * 项目入口
 */
@SpringBootApplication
@MapperScan("com.fish.dotago.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
