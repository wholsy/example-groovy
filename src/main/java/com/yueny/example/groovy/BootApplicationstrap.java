package com.yueny.example.groovy;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Quick start<br>
 * 用于快速启动和关闭job服务
 *
 * @author yueny09 <deep_blue_yang@163.com>
 * @DATE 2017年3月9日 下午5:53:29
 */
@Slf4j
@SpringBootApplication
@EnableScheduling
public class BootApplicationstrap {
	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory.getLogger(BootApplicationstrap.class);

	public static void main(String[] args) {
		try{
			ApplicationContext context = SpringApplication.run(BootApplicationstrap.class, args);
			String serverPort = context.getEnvironment().getProperty("server.port");
			log.info("mblog started at http://localhost:" + serverPort);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}