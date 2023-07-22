# Justin Ramirez
"""
This is considered pseudopolynomial instead of polynomial is because the 
running time is polynomial in the numeric value of the input (the total size limit S), 
not in the size of the input itself. In other words, if S were represented in unary, 
the running time would be polynomial, but since S is typically represented in binary 
(where the size of the input is proportional to log S), the running time is actually 
exponential in the size of the input.
"""

def knapsack(S, sizes, values, n):
    dp = [[0 for _ in range(S+1)] for _ in range(n+1)]

    for i in range(n+1):
        for s in range(S+1):
            if i == 0 or s == 0:
                dp[i][s] = 0
            elif sizes[i-1] <= s:
                dp[i][s] = max(values[i-1] + dp[i-1][s-sizes[i-1]], dp[i-1][s])
            else:
                dp[i][s] = dp[i-1][s]

    total_value = dp[n][S]

    # find the items put in the knapsack
    items = []
    s = S
    for i in range(n, 0, -1):
        if dp[i][s] != dp[i-1][s]:
            items.append(i-1)  # item indices are 0-based
            s -= sizes[i-1]

    return total_value, items
