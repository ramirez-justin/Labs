import java.util.*;

// Justin Ramirez
// CSC 2720 Assignment 4
// Class Time: TH 1415
// Due time: 4/11/2023 @ 2359

public class DataStructuresAssignment4 {
    /*
     * Test Cases:
     * Input: s = "ACGTACGTAC"
     * Output: []
     * 
     * Input: s = "ACGTACGTACGTACGT"
     * Output: ["ACGTACGTAC"]
     * 
     * Input: s = "ACGTACGTACGTACGTGGGTTTACGTACGT"
     * Output: ["ACGTACGTAC"]
     */
    public static void main(String[] args) {
        String ex1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"; // test case string 1
        String ex2 = "AAAAAAAAAAAAA";  // test case string 2

        System.out.print("\nFor input 1, '" + ex1 + "' the repeated sequences are: ");
        System.out.print(findRepeatedDNASequences(ex1));
        System.out.print("\nFor input 2, '" + ex2 + "' the repeated sequences are: ");
        System.out.print(findRepeatedDNASequences(ex2));
    }

    /**
     * Method for identifying repeated 10 character substrings along the original string
     * @param s
     * @return List of repeated substrings
     */
    public static List<String> findRepeatedDNASequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);  // New substring from i to i+10
            if (seen.contains(substring)) {   // test if substring has been seen already
                if (!repeated.contains(substring)) {    // tests if the substring has not been repeated yet
                    repeated.add(substring);    // add to set of repeated 
                    result.add(substring);  // add to the list of results
                }
            } else {
                seen.add(substring);    // else add to set of seen substrings
            }
        }
        return result;
    }
}

