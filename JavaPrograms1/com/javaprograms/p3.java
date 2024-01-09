package com.javaprograms;

public class p3 {
	public static void main(String[] args) {
		int n = 4;
		
		for (int i = 0; i < n; i++) {
			int k = 4;
			char ch = 'D';
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					System.out.print(k-- + " ");
				} else {
					System.out.print(ch-- + " ");
				}
			}
			System.out.println();
			
		}
	}
}
