package problems.Inteviewing.io;

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
 *
 * People Asking This Question
 * - interviewing.io
 *
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

    /**
     * Space: O(n*k) - where k is the max length of one of the strings
     * Time: O(n*k)
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagramsUsingCharacterCount(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List> ans = new HashMap<>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
