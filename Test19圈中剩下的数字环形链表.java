package edu.xalead;

public class Test19圈中剩下的数字环形链表 {
    static class LinkNode {
        LinkNode node;
        int val;
        LinkNode(int val){
            this.val=val;
        }
    }
    public static LinkNode huanxing(int num){
        LinkNode first=null;
        if (num<1){
            System.out.println("num输入不正确");
            return null;
        }
        LinkNode curboy=null;
        for (int i=0;i<num;i++){
            LinkNode boy=new LinkNode(i);
            if (i==0){
                first=boy;
                first.node=first;
                curboy=first;
            }else {
                curboy.node=boy;
                boy.node=first;
                curboy=boy;
            }
        }
        return first;
    }
    public  void  baoshu(int StartNo,int countnumber,int nums){
        LinkNode first=huanxing(nums);
        if(first==null||StartNo<1||StartNo>nums){
            System.out.println("参数输入有误");
        }
        LinkNode helper=first;
        while (true){
            if (helper.node==first){
                break;
            }
            helper=helper.node;
        }
        for (int i=0;i<StartNo-1;i++){
            first=first.node;
            helper=helper.node;
        }
        int a=0;
        while (true){
            if (helper==first){
                a=first.val;
                break;
            }
            for (int i=0;i<countnumber-1;i++){
                first=first.node;
                helper=helper.node;
            }
            first=first.node;
            helper.node=first;
        }
        System.out.println(a);
    }
}
