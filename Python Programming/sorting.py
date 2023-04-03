
def bubbleSort(arr):
    n = len(arr)            # Length of the array
    for i in range(n):      # Traverse the elements of the array
        swapped = False     # Boolean value to optimize the code
        for j in range(0, n-i-1):       # Last i elements are already in place
            if arr[j] > arr[j+1]:       # If j element is great than the one that comes after, swap
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        if swapped == False:        # no swaps occured in a loop, all items are sorted
            break
    return arr


def insertionSort(arr):
    n = len(arr)


    
if __name__ == "__main__":
    nums = [2,8, 5, 3, 9, 4, 1]

    print(f"This is my array sorted by Bubble Sort:  {bubbleSort(nums)}")
