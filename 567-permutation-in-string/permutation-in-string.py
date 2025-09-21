from collections import Counter
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        n1=len(s1)
        n2=len(s2)
        if n1>n2:
            return False
        subWindow=Counter(s1)
        window=Counter(s2[:n1])
        if subWindow==window:
            return True
        for i in range(n1,n2):
            window[s2[i-n1]]-=1
            if window[s2[i-n1]]==0:
                del window[s2[i-n1]]
            window[s2[i]]+=1
            if window==subWindow:
                return True
        return False
        

        