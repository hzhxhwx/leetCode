package beforeStarting.oncenumber;

import java.util.HashMap;

/**给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素
 * @author 86185
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int i = singleNumber2(nums);
        System.out.println(i);

    }

    /**
     * hashMap 计数法
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int num : nums) {
            if (integerIntegerHashMap.get(num)==null){
                integerIntegerHashMap.put(num,1);
            }else{
                Integer integer = integerIntegerHashMap.get(num);
                ++integer;
                integerIntegerHashMap.put(num,integer);
            }
        }
        int singleNumber = 0;
        for (Integer integer : integerIntegerHashMap.keySet()) {
            if (integerIntegerHashMap.get(integer) == 1){
                singleNumber = integer;
            }
        }
        return singleNumber;
    }

    /**
     * 位运算法
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums) {

        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num =num ^nums[i];
        }
        return num;
    }
}
