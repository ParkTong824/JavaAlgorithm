package programmersLevel0;

import java.util.HashMap;
import java.util.Map;

public class Solution66 {
    Map<String, String> morse = new HashMap<>(){{
        put(".-","a");put("-...","b");put("-.-.","c");put("-..","d");put(".","e");
        put("..-.","f");put("--.","g");put("....","h");put("..","i");put(".---","j");
        put("-.-","k");put(".-..","l");put("--","m");put("-.","n");put("---","o");
        put(".--.","p");put("--.-","q");put(".-.","r");put("...","s");put("-","t");
        put("..-","u");put("...-","v");put(".--","w");put("-..-","x");put("-.--","y");
        put("--..","z");
    }};
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] checkLetter = letter.split(" ");
        for (int i = 0 ; i < checkLetter.length ; i++) {
            answer.append(morse.get(checkLetter[i]));
        }
        return answer.toString();
    }
}

/*
morse = {
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
}
 */
