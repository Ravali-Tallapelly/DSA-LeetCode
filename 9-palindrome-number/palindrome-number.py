class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0:
            return False
        rev=int(str(x)[::-1])
        if rev==x:
            return True 
        else:
            return False
        