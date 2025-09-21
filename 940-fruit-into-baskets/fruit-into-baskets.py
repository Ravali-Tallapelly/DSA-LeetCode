class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        k=2
        dict={}
        maxLen=-1
        left=0
        for i in range(len(fruits)):
            if fruits[i] not in dict:
                dict[fruits[i]]=1
            else:
                dict[fruits[i]]+=1
            while len(dict)>k:
                dict[fruits[left]]-=1
                if dict[fruits[left]]==0:
                    del dict[fruits[left]]
                left+=1
            if len(dict)<=k:
                length=i-left+1
                maxLen=max(maxLen,length)
        return maxLen