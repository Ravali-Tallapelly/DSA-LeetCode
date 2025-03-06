You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

Note: Positive number starts from 1. The array can have negative integers too.

Examples:

Input: arr[] = [2, -3, 4, 1, 1, 7]
Output: 3
Explanation: Smallest positive missing number is 3.
Input: arr[] = [5, 3, 2, 5, 1]
Output: 4
Explanation: Smallest positive missing number is 4.
Input: arr[] = [-8, 0, -1, -4, -3]
Output: 1
Explanation: Smallest positive missing number is 1.

class Solution:
    
    #Function to find the smallest positive number missing from the array.
    def missingNumber(self,arr):
        n=len(arr)
        if n==0:
            return 1
        i=0
        while i<n:
            pos=arr[i]-1
            if 1<=arr[i]<n and arr[i]!=arr[pos]:
                arr[pos],arr[i]=arr[i],arr[pos]
            else:
                i+=1
        for i in range(n):
            if arr[i]!=i+1:
                return i+1
        return n+1
            
