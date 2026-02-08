class Solution:
    def reverse(self, x: int) -> int:
        res=0
        temp=0
        if x<0:
            temp=abs(x)
        else:
            temp=x
        while temp>0:
            rem=temp%10
            res=res*10+rem 
            temp//=10
        if res<-2**31 or res>2**31-1:
            return 0
        if x<0:
            return -res

        return res
        