package com.turing.spring.spring04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 打印店
 * @author 大飞哥
 *
 */
@Component
public class PrintHouse {

	//依赖打印机
	@Autowired //使用注解注入属性，会去容器中找printer的对象
	@Qualifier("laserPrinter") //设置一个唯一标识
	private Printer printer;
	
	//如果使用@Autowired注解，set方法可以省略
	//如果使用set方式注入，次方法不能少
//	public void setPrinter(Printer printer) {
//		this.printer = printer;
//	}

	//如果使用构造器方式注入，次方法不能少
//	public PrintHouse(Printer printer) {
//		this.printer = printer;
//	}
	
	//提供服务
	public void service(){
		System.out.println("打印店开始提供服务...");
		printer.print();
	}
	
	
	
	
}
