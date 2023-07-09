# Justin Ramirez
def top_down_min_cost(costs):
    n = len(costs)
    dp = [[0]*3 for _ in range(n)]

    def solve(i, j):
        if i < 0:
            return 0
        if dp[i][j] != 0:
            return dp[i][j]
        dp[i][j] = costs[i][j] + min(solve(i-1, k) for k in range(3) if k != j)
        return dp[i][j]

    return min(solve(n-1, j) for j in range(3))


def bottom_up_min_cost(costs):
    n = len(costs)
    dp = [[0]*3 for _ in range(n)]

    for i in range(n):
        for j in range(3):
            dp[i][j] = costs[i][j]
            if i > 0:
                dp[i][j] += min(dp[i-1][k] for k in range(3) if k != j)

    return min(dp[n-1])


costs1 = [[17, 2, 17], [8, 4, 10], [6, 3, 19], [4, 8, 12]]
costs2 = [[17,2,17],[16,16,5],[14,3,19]]
costs3 = [[3,5,3],[5,1,4],[1,5,2]]

print(top_down_min_cost(costs1))
print(top_down_min_cost(costs2))
print(bottom_up_min_cost(costs3))
