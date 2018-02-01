package Application;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nizari on 31.01.18.
 */
public class SentenceShuffler {
    
    static final String someWord = "abc def ghijk lmno";

    public static void main(String[] args) {
        reverse(someWord);
    }

    private static void reverse(String s) {
        String[] stringArray = s.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            String s1 = new StringBuilder(stringArray[i]).reverse().toString();
            System.out.print(s1 + " ");
        }
    }

    @Test
    public void shouldReverse() {
        SentenceShuffler.reverse(someWord);
        String expected = "cba fed kjihg onml";
        Assert.assertEquals(expected, expected);
    }
}
