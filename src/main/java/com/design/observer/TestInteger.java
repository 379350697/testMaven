package com.design.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wanglin
 * @date 2017/6/19
 */
public class TestInteger {
	public static void main(String[] args) {
		//测试Integer 自动装箱
		Integer a = 127;
		Integer b = 127;
		System.out.println(a == b);
		Integer c = 128;
		Integer d = 128;
		System.out.println(c == d);

		//测试for循环修改集合
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		for(String str : list) {
			if("1".equals(str)) {
				list.remove(str);
			}
		}
		for(String temp : list) {
			System.out.println(temp);
		}

		List<String> list2 = new ArrayList<String>();
		list2.add("1");
		list2.add("2");
		Iterator<String> iterator = list2.iterator();
		while(iterator.hasNext()){
			String temp = iterator.next();
			if("1".equals(temp)){
				iterator.remove();
			}
		}
		for(String temp:list2){
			System.out.println(temp);
		}

		//测试math.random()
		System.out.println("****************** Radom ****************");
		int i = 0;
		while (i<10){
			i++;
			System.out.println((int)(Math.random()*2));
		}
	}
}
