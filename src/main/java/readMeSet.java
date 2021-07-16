import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/3
 * Project: Ben-leetcode-practice
 */
public class readMeSet {
    public static void main(String[] args) {
        String web = "https://leetcode.com/problems/set-mismatch/";
        String number = "645";
        addnewline(web, number);
    }
    public static void addnewline (String web, String number) {
        File file = new File("README.md");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("[" + number + "](" + web + ")|[leetcode-" + number + ".md](src/question/leetcode-" + number + ".md)|[leetcode" + number + ".java](src/main/java/leetcode" + number + ".java)|[leetcode" + number + "Test.java](src/test/java/leetcode" + number + "Test.java)\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addnewline (String web, int number) {
        addnewline(web, Integer.toString(number));
    }
    public static void addJianZhi(String web, int number) {
        File file = new File("README.md");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("[" + number + "](" + web + ")|[jianzhi-" + number + ".md](src/question/jianzhi-" + number + ".md)|[jianzhi" + number + ".java](src/main/java/jianzhi" + number + ".java)|[jianzhi" + number + "Test.java](src/test/java/jianzhi" + number + "Test.java)\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
