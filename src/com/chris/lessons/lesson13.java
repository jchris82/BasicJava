package com.chris.lessons;

public class lesson13 {

	public static void main(String[] args) {
		// multidim array
		
		int[][] a = {{1,2,3,4,5},{1,2,3,4,5}};
		
		for (int i = 0; i < a.length; i++) {
			for (int i1 = 0; i1 < a[i].length; i1++) {
				System.out.print(a[i][i1]+",");
			}
			System.out.println();
		}
	}

}
