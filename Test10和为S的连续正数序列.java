package edu.xalead;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 思路分析：
 * 滑动窗口算法。
 */
public class Test10和为S的连续正数序列 {
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int left=1;
        int right=2;
        while (right>left){
            int a=((left+right)*(right-left+1))/2;
            if(a==sum){
                ArrayList arrayList=new ArrayList();
                for(int i=left;i<=right;i++){
                    arrayList.add(i);
                }
                list.add(arrayList);
                left++;
            }else if (a<sum){
                right++;
            }else {
                left++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(15));
    }
}
