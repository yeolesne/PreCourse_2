/*
 * Time Complexity: O (logN)
 * 
 * Space Complexity: O (1) -> No extra space to store the elements
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.precourse2;

public class Exercise_1 {
	
	// Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    {
        //Write your code here
 
    	while(l <= r) {
    		// Calculate the mid. Instead of l + r / 2, do as below to avoid overflow error
    		int mid = l + (r-l) / 2;
    		
    		// If element at mid is equal to x, we found the element, return its index
    		if(arr[mid] == x) {
    			return mid;
    		}
    		// Else if element is greater than mid, move to right
    		else if(arr[mid] < x) {
    			l = mid + 1;
    		}
    		// Else, move to left
    		else {
    			r = mid - 1;
    		}
    	}
    	return -1;  // return -1, if element not found in array
    } 
  
    
    // Driver method to test the Binary Search on given sorted array 
    public static void main(String args[]) 
    { 
        Exercise_1 ob = new Exercise_1(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; // element to find
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present");  // If index returned is -1, then element not found in sorted array
        else
            System.out.println("Element found at index " + result);  // Else, print the index at which element found
    } 

}
