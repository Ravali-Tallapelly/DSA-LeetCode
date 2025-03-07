#User function Template for python3
class Solution:
	def minCoins(self, coins, sum):
		n=len(coins)
		dp=[float('inf')]*(sum+1)
		dp[0]=0
		for coin in coins:
		    for j in range(coin,sum+1):
		        dp[j]=min(dp[j],1+dp[j-coin])
		if dp[sum]==float('inf'):
		    return -1
		else:
		    return dp[sum]
		
		   
