# Justin Ramirez

"""
The running time is pseudopolynomial because it depends on both 
the size of the input (n) and the numeric value of the input
(the sum of the elements in the array). Pseudopolynomial time 
algorithms have running times that are polynomial in the numeric 
value of the input. For this problem, the running time is O(n * sum), 
where sum is the sum of all elements in the array.
"""

def can_partition(nums):
    total = sum(nums)
    if total % 2 != 0:
        return False

    half = total // 2
    n = len(nums)
    dp = [[False] * (half+1) for _ in range(n+1)]
    dp[0][0] = True

    for i in range(1, n+1):
        for j in range(half+1):
            if j < nums[i-1]:
                dp[i][j] = dp[i-1][j]
            else:
                dp[i][j] = dp[i-1][j] or dp[i-1][j-nums[i-1]]

    if not dp[n][half]:
        return False

    subset1 = []
    subset2 = []
    i = n
    curr_sum = half
    while i > 0:
        if dp[i-1][curr_sum]:
            subset2.append(nums[i-1])
            i -= 1
        else:
            subset1.append(nums[i-1])
            curr_sum -= nums[i-1]
            i -= 1

    return [subset1, subset2]

nums = [1, 4, 3, 12, 19, 21, 22]
print(can_partition(nums))  # [[22, 21, 19, 1], [12, 4, 3]]

