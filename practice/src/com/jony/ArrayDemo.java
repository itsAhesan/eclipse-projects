package com.jony;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		/*
		 * int[] nums={20,10,50,70,11,50,10};
		 * 
		 * for(int i=0; i<nums.length-1; i++){ for (int j = i+1; j <
		 * nums.length; j++) {
		 * 
		 * if(nums[i]==nums[j]){ System.out.println(nums[i]); } }
		 * 
		 * 
		 * }
		 */

		int[] nums = { 20, 10, 50, 70, 11, 50, 10 };	//20,10,50,70,11

		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j] ) {
					System.out.println(nums[i]);
					
					
				}
				
				
			}
		//	System.out.println(nums[i]);
				
			

		}

	}

}
