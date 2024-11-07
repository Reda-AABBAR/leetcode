public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prifix;
        if(strs == null || strs.length == 0) return "";
        prifix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String newPrifix = "";
            if(prifix.length() > strs[i].length())
                prifix = prifix.substring(0,strs[i].length());
            for (int j = 0; j < prifix.length(); j++) {
                if (prifix.isEmpty()) return "";
                if(prifix.charAt(j) != strs[i].charAt(j)) {
                    prifix = newPrifix;
                    break;
                }
                newPrifix = newPrifix.concat(String.valueOf(prifix.charAt(j)));
            }
        }
        return prifix;
    }

    public static void main(String[] args) {

    }
}
