//Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
//
//Implement run-length encoding and decoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.

import java.util.Scanner;

public class StringEncoding {
    public static String solution(String s1){
        int n = s1.length();
        String encodedstring = "";
        if(n < 2){
            encodedstring += "1" + s1;
            return encodedstring;
        }
        char ch = s1.charAt(0);
        int cnt = 1;

        for(int i = 1;i < n;i++){
            if(s1.charAt(i) != ch){

                //encodedstring.concat(Character.toStrng((char)cnt));
                encodedstring += (char)(cnt + '0');
                encodedstring += ch;
                cnt = 1;
                ch = s1.charAt(i);
            }
            else{
                cnt++;
            }
        }

        encodedstring += (char)(cnt + '0');
        encodedstring += ch;
        return encodedstring;
    }
}
