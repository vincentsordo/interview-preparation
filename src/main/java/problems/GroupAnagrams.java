package problems;

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 *
 * Note:
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class GroupAnagrams {
    /**
     * Space: O(n^2)
     * Time: O(n^2logn)
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // use a hashmap, space will be increased by O(n)
        // sort each of the input strings O(nlogn) and determine if they equal the key
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String sortedString = sortString(str);
            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(str);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(sortedString, newList);
            }
        }

        return new ArrayList<>(map.values());
    }

    /**
     * Space: O(n)
     * Time: O(nlogn)
     * @param str
     * @return
     */
    private String sortString(String str) {
        char [] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}
