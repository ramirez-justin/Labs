# Justin Ramirez

def max_segments(segments):
    events = [] # list to store the length of each segment
    for a, b in segments:
        events.append((a, 1))  # Segment starts
        events.append((b, -1))  # Segment ends

    # Sort the events. If there is a tie, ending event comes first.
    events.sort(key=lambda x: (x[0], -x[1])) # handles overlapping segments

    # Counters for 
    max_count = 0
    current_count = 0

    # Process each event
    for _, count_diff in events:
        current_count += count_diff
        max_count = max(max_count, current_count)

    return max_count

if __name__ == "__main__":
    segments = [(-0.3,2.7),(-1,0.5), (2.5,3.3),(-0.7,2.3),(0.5,1.7)]
    print(f"k = {max_segments(segments)}")
    
    """
    6(b) For the run-time to be O(n), we'd need to be able to sort the input in linear time. 
    Linear time sorting is possible under certain conditions, such as if the range of input 
    values is relatively small and the values are integers, we can use counting sort. 
    """