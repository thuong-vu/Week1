import java.util.Arrays;

public class HomeworkWeek1 {
    public static void main(String[] args) {
        System.out.println(reverseWords("I'm fine, thank you. And you?") + "\n");

        int[] nums = {5, 7, 9, 6, 4, 9, 3, 0, 45};
        int[] sortedNums = sortInt(nums, "des");
        for (int num : sortedNums) {
            System.out.print(num + ", ");
        }
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        int len = words.length;
        String[] reverseWords = new String[len];
        for (int i = 0; i < len; i++) {
            reverseWords[i] = words[len - i - 1];
        }
        return Arrays.toString(reverseWords);
    }

    public static int[] sortInt(int[] nums, String orderBy) {
        int len = nums.length;
        if (len == 1) {
            return nums;
        } else {
            int pos, temp;
            for (int i = 0; i < len; i++) {
                pos = i;
                for (int j = i + 1; j < len; j++) {
                    if (nums[j] < nums[pos]) {
                        pos = j;
                    }
                }
                temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
            }
            if (orderBy.equals("asc")) {
                System.out.print("Ascending sorted: ");
                return nums;
            } else {
                int[] desNums = new int[len];
                for (int i = 0; i < len; i++) {
                    desNums[i] = nums[len - i - 1];
                }
                System.out.print("Descending sorted: ");
                return desNums;
            }
        }
    }
}
