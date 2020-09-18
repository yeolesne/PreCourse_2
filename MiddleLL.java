/*
 * Find Mid Point of a Singly Linked List.
 * 
 * Using Floyd's algorithm
 * Fast pointer -> increments by 2
 * Slow pointer -> increments by 1
 * Stop when fast is null && fast.next is null
 * Slow pointer will be the middle of a Linked List
 */


/*
 * Time Complexity: O (N) -> To traverse through 'N' nodes of a LL
 * 
 * Space Complexity: O (1) -> No extra space used
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.precourse2;

/* Linked list node */
class Node 
{ 
    int data; 
    Node next; 
    Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
} 

public class MiddleLL {
	Node head; // head of linked list 
	
	/* Function to print middle of linked list */
	   //Complete this function
	    void printMiddle() 
	    { 
		//Implementation using Fast and slow pointers
	    Node fast = head;
	    Node slow = head;
	    
	    // Increment fast pointer by 2 and slow pointer by 1 until fast pointer reaches null or last element in LL
	    while(fast != null && fast.next != null) {
	    	slow = slow.next;
	    	fast = fast.next.next;
	    	
	    }
	    // Print the middle of a LL
	    System.out.println("Middle of a Linked List is: " + slow.data);
	    
	    } 
	    
	    // Push elements in to LL
	    public void push(int new_data) 
	    { 
	        Node new_node = new Node(new_data); 
	        new_node.next = head; 
	        head = new_node; 
	    } 
	    
	    // Print the elements of a LL
	    public void printList() 
	    { 
	        Node tnode = head; 
	        while (tnode != null) 
	        { 
	            System.out.print(tnode.data+"->"); 
	            tnode = tnode.next; 
	        } 
	        System.out.println("NULL"); 
	    } 
	    
	    // Main method
	    public static void main(String [] args) 
	    { 
	        MiddleLL llist = new MiddleLL(); 
	        for (int i = 15; i > 0; --i) 
	        { 
	            llist.push(i); 
	            llist.printList(); 
	            llist.printMiddle(); 
	        } 
	    } 

}
