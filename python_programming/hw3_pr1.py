# Justin Ramirez

def is_subsequence(seq1, seq2):
    i, j = 0, 0
    while i < len(seq1) and j < len(seq2):
        if seq1[i] == seq2[j]:
            j += 1
        i += 1
    return j == len(seq2)

# Test cases
print(is_subsequence([1, 12, 4, 8, 10, 6], [12, 10, 6]))  # Returns: True
print(is_subsequence([-2, 0, 4, 0, 2, 7], [0, 2, 4]))  # Returns: False
