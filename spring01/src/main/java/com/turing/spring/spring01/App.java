package com.turing.spring.spring01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //创建一个针式打印机对象
//    	PinPrinter pinPrinter = new PinPrinter();
    	//升级到激光打印机
    	LaserPrinter printer = new LaserPrinter();
       //创建打印店对象
    	PrintHouse printHouse = new PrintHouse(printer);
    	//打印店提供服务
    	printHouse.service();
    	
    	//问题：new的问题--->依赖问题--->高耦合
    	//如果A依赖B，A就负责B的实例化工作。
    	//如何解决？接口
    	//在实现类中，可以使用接口，但是在测试类中，依然存在高耦合。如何解决？
    	//使用一个容器的概念？
    }
}
