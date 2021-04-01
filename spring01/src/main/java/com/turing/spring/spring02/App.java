package com.turing.spring.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用Spring容器来获取Bean
 * @author 大飞哥
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //1、创建Spring应用的上下文对象(通过xml的方式来创建Spring IOC容器)
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/turing/spring/spring02/spring.xml");
    	//2、从容器中获取Bean
//    	PinPrinter pinPrinter = ctx.getBean(PinPrinter.class);//通过类型查找
//    	PinPrinter pinPrinter = (PinPrinter) ctx.getBean("pinPrinter");//通过id或name查找
//    	PinPrinter pinPrinter = ctx.getBean(PinPrinter.class, "pinPrinter");
//    	Printer printer = ctx.getBean(Printer.class);//按接口类型查找，如果容器中有多个，会报错
//    	Printer printer = (Printer) ctx.getBean("laserPrinter");//按接口类型查找，如果容器中有多个，会报错
    	
    	//3、调用方法
//    	printer.print();
    	
    	//获取图文店
    	PrintHouse printHouse =  (PrintHouse) ctx.getBean("printHouse");
    	//调用图文店的服务方法
    	printHouse.service();
    }
}
