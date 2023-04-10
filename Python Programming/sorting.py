"""
Sorting algorithm that works by comparing each element to the next and moving 
higher elements to the end until no swaps occur
Time Complexity: O(n^2)
Space Complexity: O(1)
"""
def bubbleSort(nums):
    n = len(nums)            # Length of the list
    for i in range(n):      # Traverse the elements of the list
        swapped = False     # Boolean value to optimize the code
        for j in range(0, n-i-1):       # Last i elements are already in place
            if nums[j] > nums[j+1]:       # If j element is great than the one that comes after, swap
                nums[j], nums[j+1] = nums[j+1], nums[j]
                swapped = True
        if swapped == False:        # no swaps occured in a loop, all items are sorted
            break
    return nums


"""
Sorting alrogithm that works by moving the minimum element to the front of the 
unsorted portion of an list
Time Complexity: O(n^2)
Space Complexity: O(1)
"""
def selectionSort(nums):
    n = len(nums)        # Length of the list
    for i in range(n):  # Traverse through all list elements
        min_idx = i     # Find min element of remaining unsorted part of the list
        for j in range(i+1, n):     # Only looks at unsorted part of the list
            if nums[min_idx] > nums[j]:   # Search for minimum element index 
                min_idx = j
        nums[i], nums[min_idx] = nums[min_idx], nums[i]     # Swap front of unsorted list and min element
    return nums

"""
Sorting algorithm that works by spliting a list into a sorted and an unsorted part. 
Values from the unsorted part are picked and placed at the correct position in the 
sorted part.

"""
def insertionSort(nums):
    n = len(nums)   # Length of list
    for i in range(1, n):
        key = nums[i]
        j = i-1
        while j >= 0 and key < nums[j]:
            nums[j+1] = nums[j]
            j -= 1
        nums[j+1] = key
    return nums




def countingSort(nums):
    n = len(nums)


def heapSort(ar):
    n = len(nums)

def quickSort(nums):
    n = len(nums)


def mergeSort(nums):
    n = len(nums)




if __name__ == "__main__":
    nums = [2,8, 5, 3, 9, 4, 1, 6, 235, 65, 234543, 57, 34534, 24356, 56478, 23, 567, 235, 67689, 324536, 4565, 567, 5676, 57]

    print(nums)

    print("This is my list sorted by Bubble Sort: ", bubbleSort(nums))

    print("This is my list sorted by Bubble Sort: ", selectionSort(nums))

    print(nums)
