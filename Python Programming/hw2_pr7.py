# Jusin Ramirez

def array_intersection(array1, array2):
    count_dict = {} # set to dedup
    intersection = []   #list to keep track

    # Count each element in the first array
    for num in array1:
        if num in count_dict:
            count_dict[num] += 1
        else:
            count_dict[num] = 1

    # Decrease the count for each element in the second array
    for num in array2:
        if num in count_dict and count_dict[num] > 0:
            intersection.append(num)
            count_dict[num] -= 1

    # sort the list
    intersection = sorted(intersection)
    
    return intersection


if __name__ == "__main__":
    array1 = [3,7,2,6,6,9,5,1,1]
    array2 = [9,4,9,8,6,1,0,6,6]
    print(f"The intersection of these arrays is: {array_intersection(array1, array2)}")
