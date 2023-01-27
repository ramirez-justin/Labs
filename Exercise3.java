//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 1/29

// Big-O time analysis for bubble sort
    // O(n^2)
// Big-O space analysis for bubble sort
    // O(1)
// Big-O time analysis for counting sort
    // O(n*log(n))
// Big-O space analysis for counting sort
    // O(n)
/* Comparison between two algorithms. 
 * 
 * The time complexity of my bubble sort code is O(n^2) and the space complexity is O(1)
 * This is because the outer loop runs for n-1 times and the inner loop runs for 
 * n-1 times for each iteration of the outer loop. The inner loop also performs a swap operation which takes constant time.
 * The space complexity is O(1) because it uses a single temporary variable to perform the swap operation, which does not grow with the size of the input.
 * 
 * The time complexity of the counting sort algorithm is O(n) + O(n) + O(n) + O(nlog(n)) = O(nlog(n))
 * The space complexity, you are creating a new count array with the size max + 1, which is O(n) in worst case 
 * scenario, so the space complexity of the algorithm is O(n).
 * 
 * This means that bubble sort while requiring les space for any size problem will require a lot more time as the input size increases
*/