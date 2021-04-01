package com.turing.spring.spring01;
/**
 * 打印店
 * @author 大飞哥
 *
 */
public class PrintHouse {

	//依赖打印机
	private Printer printer;
	
	/**
	 * 开店就要买打印机
	 * @param pinPrinter
	 */
	public PrintHouse(Printer printer) {
		this.printer = printer;
	}
	
	//提供服务
	public void service(){
		System.out.println("打印店开始提供服务...");
		printer.print();
	}
	
	
	
	
}
