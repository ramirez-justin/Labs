# Justin Ramirez

def top_down_largest_square(matrix):
    n, m = len(matrix), len(matrix[0])
    dp = [[-1]*m for _ in range(n)]

    def solve(i, j):
        if i < 0 or j < 0:
            return 0
        if dp[i][j] != -1:
            return dp[i][j]
        dp[i][j] = min(solve(i-1, j), solve(i, j-1), solve(i-1, j-1)) + 1 if matrix[i][j] == 'a' else 0
        return dp[i][j]

    max_side = max(solve(i, j) for i in range(n) for j in range(m))
    return max_side * max_side


def bottom_up_largest_square(matrix):
    n, m = len(matrix), len(matrix[0])
    dp = [[0]*m for _ in range(n)]
    max_side = 0

    for i in range(n):
        for j in range(m):
            if matrix[i][j] == 'a':
                if i == 0 or j == 0:
                    dp[i][j] = 1
                else:
                    dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1
                max_side = max(max_side, dp[i][j])

    return max_side * max_side


matrix1 = [["a","w","a","w","w"], ["a","w","a","a","a"], ["a","a","a","a","a"], ["a","w","w","a","w"]]
matrix2 = [["a","a","a","w"], ["a","w","a","a"],["a","a","a","a"]]
matrix3 = [["w","w","w"], ["w","w","w"]]

print(top_down_largest_square(matrix1))
print(bottom_up_largest_square(matrix2))
print(top_down_largest_square(matrix3))

