package com.gree.gree_x.controlers;

import java.util.UUID;

public class Text {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0;i<10;i++){
			System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
		}
	}
}
