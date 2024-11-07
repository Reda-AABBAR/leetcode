public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pl1 = l1;
        ListNode pl2 = l2;
        ListNode begainresl = null;
        ListNode resl = null;
        int res = 0;
        while (pl2 != null && pl1 != null){
            res = (res/10 >= 1)? pl2.val + pl1.val + 1 : pl2.val + pl1.val;
            if(resl == null) begainresl=resl = new ListNode(res % 10);
            else {
                resl.next = new ListNode(res % 10);
                resl = resl.next;
            }
            pl2 = pl2.next;
            pl1 = pl1.next;
        }
        if(pl2 != null){
            while (pl2 != null){
                res = (res/10 >= 1)? pl2.val +  1 : pl2.val;
                resl.next = new ListNode(res % 10);
                resl = resl.next;
                pl2 = pl2.next;
            }
        }

        if(pl1 != null){
            while (pl1 != null){
                res = (res/10 >= 1)? pl1.val +  1 : pl1.val;
                resl.next = new ListNode(res % 10);
                resl = resl.next;
                pl1 = pl1.next;
            }
        }
        if(res/10 >= 1) {
            resl.next = new ListNode(res / 10);
            resl = resl.next;
        }
        return begainresl;
    }
}
