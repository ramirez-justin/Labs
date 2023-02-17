// Justin Ramirez
// CSC 2720 Assignment2
// Class Time: TH 1415
// Due time: 2/21/2023 @ 2359

class DuplicateWordFinder {
    public static void main(String[] args) {

    }

    public static String[] hasDuplicates(String[] words) {
        String[] temp = new String[words.length];
        int k = 0;
        for (int i = 0; i <words.length-1; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j <words.length-1; j++) {
                if (words[i]  == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[k++] = words[i];
            }
        }
        String[] newWords = new String[k];
        for (int i = 0; i < k; i++) {
            newWords[i] = temp[i];
        }
        return newWords;
    }
}