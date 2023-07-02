# Justin Ramirez

def count_good_sequences(n):
    ends_with_a, ends_with_b = 1, 1
    for i in range(2, n+1):
        # 'a' can be appended to any good sequence
        new_ends_with_a = ends_with_a + ends_with_b  
        # 'b' can only be appended to a good sequence ending with 'a'
        new_ends_with_b = ends_with_a  
        ends_with_a, ends_with_b = new_ends_with_a, new_ends_with_b
    # Total good sequences are those ending with either 'a' or 'b'
    return ends_with_a + ends_with_b  

print(count_good_sequences(4))  # Returns: 8