# Justin Ramirez

def length_of_longest_substring(s):
    n = len(s)  # length of the string
    char_set = set()    # empty set to store char and dedup
    ans = i = j = 0     # init ans, i, j vars
    while i < n and j < n:
        # try to extend the range [i, j]
        if s[j] not in char_set:
            char_set.add(s[j])
            j += 1
            ans = max(ans, j - i)
        else:
            char_set.remove(s[i])
            i += 1
    return ans


if __name__ == "__main__":
    print(length_of_longest_substring("abcabcbb"))  
    print(length_of_longest_substring("xxxxxxxx")) 
    print(length_of_longest_substring("pubwwkewsin")) 
