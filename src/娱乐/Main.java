package 娱乐;

import java.util.*;

public class Main{
    public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                int number = sc.nextInt();
//                List totalList = new ArrayList();
//                for (int i = 0 ;i<number;i++){
//                    String[] s = sc.nextLine().split(" ");
//                    List list = new ArrayList();
//                    for (int j = 0 ; i< s.length;j++){
//                        list.add(Integer.parseInt(s[j]));
//                        totalList.add(list);
//                    }
//                }

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] s = sc.nextLine().split(",");
            ListNode head = new ListNode();
            ListNode mid = head;
            head.val = Integer.parseInt(s[0]);
            for (int i = 1 ;i < s.length; i ++){
                mid.next = new ListNode(Integer.parseInt(s[i]));
                mid = mid.next;
            }
            ListNode temp0 = new ListNode();
            ListNode temp1 = head;
            ListNode temp2 = head;
            ListNode temp3 = null;
            while(temp2!=null && temp2.next != null){
                temp2 = temp2.next;
                temp1.next = temp2.next;
                temp2.next = temp1;
                if (temp0.next == null) {
                    temp0.next = temp2;
                }
                if (temp3!=null){
                    temp3.next = temp2;
                }
                temp3 = temp1;
                temp1 = temp3.next;
                temp2 = temp3.next;
            }
            while (temp0.next!=null){
                System.out.print(temp0.next.val+",");
                temp0 = temp0.next;
                if (temp0.next.next == null){
                    System.out.print(temp0.next.val);
                    break;
                }
            }
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}