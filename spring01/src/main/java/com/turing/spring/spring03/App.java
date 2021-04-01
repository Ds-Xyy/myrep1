package com.turing.spring.spring03;

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
        //创建Spring应用的上下文对象(通过xml的方式来创建Spring IOC容器)
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/turing/spring/spring03/spring.xml");
    	//获取图文店
    	LaserPrinter laserPrinter = ctx.getBean(LaserPrinter.class);
    	//调用图文店的服务方法
    	laserPrinter.print();
    }
}
