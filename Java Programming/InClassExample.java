import java.util.HashMap;

import javax.lang.model.util.ElementScanner6;

public class InClassExample {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        numsMap.put(0, nums);
        for (int i = 0; i < nums.length; i++) {
            if(numsMap.containsKey(target)){
                return ;
            } else 
                return;
        }
    }

    public static void doSomething(){

    }
}
