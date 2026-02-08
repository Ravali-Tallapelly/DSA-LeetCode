class Solution:
    def isPalindrome(self, s: str) -> bool:
        res=""
        for i in s:
            if i.isalnum():
                res+=i.lower()
            else:
                continue
        temp=res 
        if res==temp[::-1]:
            return True
        else:
            return False
