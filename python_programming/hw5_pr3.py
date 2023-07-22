# Justin Ramirez

"""
The time complexity is polynomial in the size of the input (specifically, 
quadratic in the number of colors and linear in the number of houses). 
The reason it is polynomial and not pseudopolynomial is that all 
the parameters (n and k) represent actual counts of different entities 
(houses and colors), not the numerical values of the entities themselves.
"""

# Top-down (recursive) dynamic programming:
def minCost_recursive(costs):
    n = len(costs)
    k = len(costs[0])
    dp = [[(float('inf'), [])]*k for _ in range(n)]

    def helper(house, color):
        if house < 0:
            return 0, []
        if dp[house][color][0] != float('inf'):
            return dp[house][color]
        
        min_cost = float('inf')
        min_color_seq = []
        for prev_color in range(k):
            if prev_color == color:
                continue
            cost, color_seq = helper(house-1, prev_color)
            if cost < min_cost:
                min_cost = cost
                min_color_seq = color_seq
                
        dp[house][color] = min_cost + costs[house][color], min_color_seq + [color]
        return dp[house][color]
    
    return min(helper(n-1, color) for color in range(k))



# Bottom-up (iterative) dynamic programming:
def minCost_iterative(costs):
    n = len(costs)
    k = len(costs[0])
    dp = [[(0, [])]*k for _ in range(n)]
    
    dp[0] = [(costs[0][i], [i]) for i in range(k)]

    for i in range(1, n):
        for j in range(k):
            min_cost, min_color_seq = min(dp[i-1][:j] + dp[i-1][j+1:], key=lambda x: x[0])
            dp[i][j] = min_cost + costs[i][j], min_color_seq + [j]

    return min(dp[-1], key=lambda x: x[0])

costs1 = [[8, 2, 4], [10, 4, 20], [6, 3, 4], [4, 8, 7]]
costs2 = [[4,6],[1,12]]
print(minCost_recursive(costs1))
print(minCost_iterative(costs2))

