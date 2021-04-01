package com.turing.spring.spring04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用Spring容器来获取Bean
 * @author 大飞哥
 *
 */
@Configuration //等同于spring.xml
@ComponentScan //默认是扫描当前类所在的包及其子包
// App这个类只作为配置项的载体，重点是该类上的@Configuration
public class App 
{
    public static void main( String[] args )
    {
      //创建Spring应用的上下文对象(通过注解的方式)
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
    	//获取对象
    	PrintHouse printHouse = ctx.getBean(PrintHouse.class);
    	//调用图文店的服务方法
    	printHouse.service();   	
    }
}
