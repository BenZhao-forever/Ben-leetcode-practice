import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
public class leetcode811 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/subdomain-visit-count/", 811);
    }
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> answer = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String cpdomain : cpdomains) {
            int number = 0;
            String web = "";
            for (int j = 0; j < cpdomain.length(); j++) {
                if (cpdomain.charAt(j) == ' ') {
                    number = Integer.parseInt(cpdomain.substring(0, j));
                    web = cpdomain.substring(j + 1);
                }
            }
            for (int j = 0; j < web.length(); j++) {
                if (j == 0 || web.charAt(j) == '.') {
                    String newweb = web.substring(j == 0 ? j : j + 1);
                    if (hashMap.containsKey(newweb)) {
                        hashMap.put(newweb, number + hashMap.get(newweb));
                    } else {
                        hashMap.put(newweb, number);
                    }
                }
            }
        }
        hashMap.forEach((web, number) -> answer.add(number.toString() + " " + web));
        return answer;
    }
}
