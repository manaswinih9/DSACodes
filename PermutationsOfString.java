import java.util.ArrayList;
import java.util.*;

class Solution {
    private void recurPermutate(int index, char[] chars, List<String> ans) {
        if (index == chars.length) {
            ans.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(i, index, chars);
            recurPermutate(index + 1, chars, ans);
            swap(i, index, chars);
        }
    }
    private void swap(int i, int j, char[] chars) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public List<String> permute(String str) {
        List<String> ans = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return ans;
        }
        char[] chars = str.toCharArray();
        recurPermutate(0, chars, ans); 
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<String> permutations = solution.permute(s);
        System.out.println(permutations.toString());
    }
}
