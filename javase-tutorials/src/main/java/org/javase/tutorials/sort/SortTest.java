package org.javase.tutorials.sort;

import java.util.Arrays;

import org.javase.tutorials.sort.Sort.SortUtil;
import org.javase.tutorials.sort.Sort.Sorts;

/**
 * 冒择入希快归堆：常用排序算法
 */
public class SortTest {

	public static void main(String[] args) {
		int[] origin = { 2, 17, 3, 1, 10, 4, 8, 5, 21, 6, 33, 9, 53 };
		System.out.print("origin:  ");
		SortUtil.print(origin);
		// 执行排序算法
		for (Sorts each : Sorts.values()) {
			System.out.print(each.name() + ":  ");
			int[] data = Arrays.copyOf(origin, origin.length);
			each.sort(data);
			SortUtil.print(data);
		}
		// api使用经过调优的快速排序
		Arrays.sort(origin);
		System.out.print("jdkApi:  ");
		SortUtil.print(origin);
	}

}
