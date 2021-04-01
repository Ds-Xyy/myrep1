package com.turing.spring.spring03;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 激光打印机
 * @author 大飞哥
 *
 */

@Component //组件
//@Repository
//@Service
//@Controller
public class LaserPrinter implements Printer{

	public void print(){
		System.out.println("激光打印机在打印...");
	}
}
