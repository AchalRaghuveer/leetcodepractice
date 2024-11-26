/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "";
        while(l1.next != null){
            s1 = l1.val + s1;
            l1 = l1.next;
        }
        s1 = l1.val+s1;
        String s2 = "";
        while(l2.next != null){
            s2 = l2.val + s2;
            l2 = l2.next;
        }
        s2 = l2.val+s2;
        System.out.println(s1 + "  "+ s2);
        BigInteger i1 = new BigInteger(s1);
        BigInteger i2 = new BigInteger(s2);

        BigInteger ans = i1.add(i2);

        System.out.println(ans);

        String ansStr = ans.toString();
        ListNode finL = new ListNode();
        ListNode retL = new ListNode();
        String[] sArr = ansStr.split("");
        List<ListNode> listOfNodes = new ArrayList<>();
        for(int i=sArr.length-1; i>=0; i--){
            String cr = sArr[i];
            listOfNodes.add(new ListNode(Integer.parseInt(cr)));

        } 
        int i=0;
        for(i=0; i<listOfNodes.size()-1; i++){
            listOfNodes.get(i).next = listOfNodes.get(i+1);
        }
        listOfNodes.get(i).next = null;

        return listOfNodes.get(0);
        
    }
}