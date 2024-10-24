// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);  
        char first[]=strs[0].toCharArray(); //flower
        char last[]=strs[strs.length-1].toCharArray(); //flight
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            else{
                sb.append(first[i]);
            }
        }
        return sb.toString();
        
    }
}
