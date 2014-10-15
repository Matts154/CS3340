/*
 * Matt S
 * CS3340 - PC03
 * October 14, 2014
 */
package assignment;

public class MyStack {
	private Integer SIZE;
	private Integer top;
	private Integer[] arr;
	private static Integer count = 0;

	public MyStack() {
		count++;
		SIZE = 5;
		top = 0;
		arr = new Integer[SIZE];
	}

	public MyStack(Integer size) {
		count++;
		SIZE = size;
		top = 0;
		arr = new Integer[SIZE];
	}

	public boolean isFull() {
		return top == SIZE;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public void push(Integer i) {
		arr[top++] = i;
	}

	public Integer pop() {
		return arr[--top];
	}

	public String toString() {
		String s = "";

		for (int i = 0; i < SIZE; i++)
			s = s + arr[i] + " ";

		return s;
	}

	public static Integer getStaticCount() {
		return count;
	}

	public static void setStaticCount(Integer c) {
		count = c;
	}

}
