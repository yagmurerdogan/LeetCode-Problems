package com.yagmurerdogan.addtwonumbers

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val head =
            ListNode(99) // whatever number, the first node is dummy, you will return the next node after the dummy.
        var cur = head
        var n1 = l1
        var n2 = l2
        var carry = 0

        while (n1 != null || n2 != null) {
            val sum = (n1?.`val` ?: 0) + (n2?.`val` ?: 0) + carry
            // for those not familiar with Kotlin
            // (n1?.`val` ?: 0) Elvis operator, == if (n1 == null ) n1?.`val` else  0
            cur.next = ListNode(sum % 10)
            cur = cur.next!!

            carry = if (sum > 9) 1 else 0
            if (n1 != null) n1 = n1.next
            if (n2 != null) n2 = n2.next
        }

        if (carry > 0) {
            cur.next = ListNode(carry)
            cur = cur.next!!
        }

        return head.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}