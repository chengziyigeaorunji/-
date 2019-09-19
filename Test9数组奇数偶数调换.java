package edu.xalead;

import java.util.ArrayList;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Test9数组奇数偶数调换 {
    public static void reOrderArray(int [] array){
        for(int j=0;j<array.length-1;j++){
            for(int i=0;i<array.length-1;i++){
                if(array[i]%2==0&&array[i+1]%2==1){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]={2,4,6,8,5,10};
        reOrderArray(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
