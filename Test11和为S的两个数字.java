package edu.xalead;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的
 * 思路分析：
 * 因为数组是排序的，所以相差越大这两个数成绩越小所以：
 * 若ai + aj == sum，就是答案（相差越远乘积越小）
 * 若ai + aj > sum，aj肯定不是答案之一（前面已得出 i 前面的数已是不可能），j -= 1
 * 若ai + aj < sum，ai肯定不是答案之一（前面已得出 j 后面的数已是不可能），i += 1
 * i从头开始，j从尾开始遍历。
 */
public class Test11和为S的两个数字 {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum){
        ArrayList arrayList=new ArrayList();
        int left=0;
        int right=array.length-1;
        while (left<right){
            if(array[left]+array[right]==sum){
                arrayList.add(array[left]);
                arrayList.add(array[right]);
                return arrayList;
            }
            if(array[left]+array[right]>sum){
                right--;
            }
            if (array[left]+array[right]<sum){
                left++;
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int []a={1,3,9,11,18,19,20,52};
        System.out.println(FindNumbersWithSum(a,21));
    }
}
