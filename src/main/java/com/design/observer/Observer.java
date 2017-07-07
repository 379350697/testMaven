package com.design.observer;


import java.util.*;

/**
 * @author wanglin
 * @date 2017/6/16
 */
public interface Observer {

	public AbstractList testInheritance(Map m);
}

class A implements  Observer{
	public AbstractList testInheritance(HashMap m) {
		return null;
	}
}

