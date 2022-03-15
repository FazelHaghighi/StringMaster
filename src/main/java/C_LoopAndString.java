public class C_LoopAndString {
    /**
     * <p>Returns true if the string contains two consecutive character of
     * specified type.</p>
     *
     * <p>Example: "abbc" has two consecutive 'b'</p>
     *
     * @param s the given string
     * @param ch the given character
     * @return whether the string contains at least one consecutive pair of
     * the given character
     */
    public static boolean containsDoubleChar(String s, char ch) {

        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == s.charAt(i+1)) return true;
        }
        return false;
    }

    /**
     * <p>Implement Caesar cipher encryption algorithm (tag: cryptography)
     * Google it for more information</p>
     * <p>Only encrypt alphabetical characters:
     * <b>"ab c" shift=3 => "de f"</b></p>
     *
     * @param s text
     * @param offset shift amount
     */
    public static String caesarEncrypt(String s, int offset) {

        while(offset < 0)
        {
            offset += 26;
        }
        while(offset > 26)
        {
            offset -= 26;
        }
        char string[] = s.toCharArray();
        String answer = "";
        for(int i = 0; i < s.length(); i++)
        {
            int word  = 0;
            if((int)string[i] >= 65 && (int)string[i] <= 90)
            {
                if((int)string[i] + offset <= 90)
                {
                   word = (int)string[i] + offset;
                }
                else if((int)string[i] + offset > 90)
                {
                    word = (int)string[i] + offset - 26;
                }
            }
            else if((int)string[i] >= 97 && (int)string[i] <= 122)
            {
                if((int)string[i] + offset <= 122)
                {
                    word = (int)string[i] + offset;
                }
                else if((int)string[i] + offset > 122)
                {
                    word = (int)string[i] + offset - 26;
                }
            }
            else word = string[i];
            answer += (char) word;
        }
        return answer;
    }

    /**
     * <p>Implement Caesar cipher decryption algorithm (tag: cryptography)</p>
     * Google it for more information.</p>
     * <p>Ignore space: <b>"de f" shift=3 => "ab c"</b></p>
     * <p>You can use encryption method here.</p>
     *
     * @param s text
     * @param c shift amount
     */
    public static String caesarDecrypt(String s, int c) {
        return caesarEncrypt(s, -c);
    }

    /*
    If you have implemented all the previous parts completely and correctly
    feel free and add other methods as much as you want. Each extra method
    can add up to 5 points.

    Each method must come with its own unit-test.
     */
}
