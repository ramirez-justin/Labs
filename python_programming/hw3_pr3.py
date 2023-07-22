# Justin Ramirez

def remove_intervals(intervals, weights):
    # Create a list of tuples with start, finish times and weights.
    sorted_intervals = sorted([(start, finish, weight) for (start, finish), weight in zip(intervals, weights)], key=lambda x: x[1])

    n = len(sorted_intervals)
    # Initialize dynamic programming table
    dp = [0] * (n + 1)
    dp[1] = sorted_intervals[0][2]
    
    # Create a list to store the finish times
    finish = [0] + [i[1] for i in sorted_intervals]
    
    # Compute maximum weight of non-overlapping intervals.
    for i in range(2, n + 1):
        # Find the largest index j such that sorted_intervals[j] doesn't overlap with sorted_intervals[i]
        j = i - 1
        while j >= 1:
            if sorted_intervals[j-1][1] <= sorted_intervals[i-1][0]:
                break
            j -= 1
        dp[i] = max(dp[j] + sorted_intervals[i-1][2], dp[i-1])

    # Backtrack to find the intervals to remove
    i = len(sorted_intervals)
    to_keep = []
    while i > 0:
        if i > 0 and dp[i] == dp[i-1]:
            i -= 1
        else:
            to_keep.append(sorted_intervals[i-1])
            j = i - 1
            while j >= 1:
                if sorted_intervals[j-1][1] <= sorted_intervals[i-1][0]:
                    break
                j -= 1
            i = j
    to_remove = [interval for interval in sorted_intervals if interval not in to_keep]
    # Return only start and finish times
    to_remove = [(start, finish) for start, finish, weight in to_remove]
    return to_remove


# Test cases
print(remove_intervals([(1,2),(2,3),(3,4),(1,3)], [2,2,2,2]))  # Returns: [(1,3)]
print(remove_intervals([(1,2),(2,3),(3,4),(5,7)], [1,2,3,4]))  # Returns: []
print(remove_intervals([(6,8),(6,8),(2,6),(1,4),(5,8),(3,5)], [3,2,5,3,7,10]))  # Returns: [(6,8),(2,6),(1,4),(5,8)]
