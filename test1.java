package edu.xalead;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 * 思路：用一个二重循环，遍历数组中出现的元素，看他们出现几次，不能包括本身遍历一个元素计数器清零一次。
 */
public class test1 {
    public  static int  MoreThanHalfNum_Solution(int [] array){
        int count=0;
        for (int i=0;i<array.length;i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            int a = array.length / 2;
            if (count >= a) {
                return array[i];
            }
            count=0;
        }
        return 0;
    }

    public static void main(String[] args) {
        int []a={1,2,3,2,4,2,5,2,3};
        System.out.println(MoreThanHalfNum_Solution(a));
    }
}
