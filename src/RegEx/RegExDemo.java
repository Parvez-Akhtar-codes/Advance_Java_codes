package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {

        String regex = ".*[a-z][0-9]";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher;
        matcher = pattern.matcher("1223445adaaf12345");
        Boolean matchfound = matcher.find();
        if(matchfound){
            System.out.println("Match Found");
        }else{
            System.out.println("Match Not Found");
        }
    }
}
