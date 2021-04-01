package com.turing.spring.spring04;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 针式打印机
 * @author 大飞哥
 *
 */
@Component
public class PinPrinter implements Printer{

	public void print(){
		System.out.println("针式打印机在打印...");
	}
}
