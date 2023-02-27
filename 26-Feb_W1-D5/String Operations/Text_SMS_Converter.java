/*
 * Converting Text to SMS Language
SMS language or textese (also known as txt-speak, txtese, chatspeak, txt, txtspk, txtk, txto, texting language, txt lingo, SMSish, txtslang,or txt talk) is a term for the abbreviations and slang commonly used with mobile phone text messaging.
Some of the abbreviations used are
s for yes
u for you
2day for today
y for why
Many grandpas have started sending SMSes to their grandchildren. But they are not familiar with the SMS lingo.
Write a program that would convert a given text in proper English to SMS lingo? Consider only the 4 words listed above.
Input Format:
Input consists of a single string. Assume that the maximum length of the string is 200 and all letters are in lower-case.
Output Format:
The output consists of a single string.


Sample Input 1:
where were you yesterday?
Sample Output 1:
where were u sterday?

Sample Input 2:
why is today a working day for you?
Sample Output 2:
y is 2day a working day for u?
 */
import java.util.*;
public class Text_SMS_Converter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.contains("yes")){
           str = str.replace("yes","s");
        }
        if(str.contains("you")){
            str = str.replace("you", "u");
        }
         if(str.contains("today")){
            str = str.replace("today", "2day");
        }
        if(str.contains("why")){
            str = str.replace("why", "y");
        }
        System.out.println(str);
        sc.close();
    }
}
