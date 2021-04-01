package com.turing.spring.spring03;
/**
 * 打印店
 * @author 大飞哥
 *
 */
public class PrintHouse {

	//依赖打印机
	private Printer printer;
	
	private String name;
	
	public Printer getPrinter() {
		return printer;
	}

	//如果使用set方式注入，次方法不能少
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

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
