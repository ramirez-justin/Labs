//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 1/29

// Big-O time analysis for insertion sort
    // O(n^2)
// Big-O space analysis for insertion sort
    // O(1)
// Big-O time analysis for selection sort
    // O(n^2)
// Big-O space analysis for selection sort
    // O(1)
/* Comparison between two algorithms. 
 * 
 * The time complexity of the insertion sort algorithm is O(n^2). The outer 'for' loop runs n times, 
 * and the inner 'while' loop may run n times in the worst case, when the array is sorted in decreasing 
 * order, so the total number of operations is O(n^2). The space complexity is O(1), as the algorithm 
 * sorts the array in place and uses only a few variables to keep track of the current position in the array.
 * 
 * The time complexity of selection sort is O(n^2) where n is the number of elements in the array. 
 * This is because in each iteration, the algorithm needs to traverse the entire unsorted part of 
 * the array to find the minimum element, which takes O(n) time, and the number of iterations is n, 
 * making the total time complexity O(n^2). The space complexity of selection sort is O(1) because 
 * it sorts the elements in place, i.e., it does not require any extra memory to store the intermediate results.
 * 
 * The time complexity of both algorithms is the same but Insertion Sort has an advantage over 
 * Selection Sort when the input array is partially sorted or nearly sorted, because in that case 
 * the time complexity would be closer to O(n) as the number of shifts needed would be significantly less
 */