class Solution:
    def reverse(self,str):
        ans=str[::-1]
        return ans
    def invert(self,str):
        ans=""
        for i in str:
            if i=='0':
                ans+='1'
            else:
                ans+='0'
        return ans
    def findKthBit(self, n: int, k: int) -> str:
        prev="0"
        while n>0:
            res=prev+'1'+self.reverse(self.invert(prev))
            prev=res
            n-=1
        return res[k-1]
        