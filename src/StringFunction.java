import java.util.Locale;
public class StringFunction {
    public static void main(String [] args) {
        String s1 ="Rajesh Patel's home number 0751254698 &50.00 Java & Selenium * * *";
        String s2 = s1.replaceAll(" ","");//Remove space from given string
        System.out.println("Remove space:-"+s2);
        String digit =s1.replaceAll("[0-9]","");//Remove Digit from given String
        System.out.println("Remove digit:-"+digit);
        String num=s1.replaceAll("[^0-9]","");//Extract Number from given string
        System.out.println("Extract number:-"+num);
        String str_java=s1.replace("Java",""); //Remove word 'java' from given string
        System.out.println("Remove java word:-"+str_java);
        String spec_char=s1.replaceAll("[^a-zA-Z]+",""); //Remove special character from given string
        System.out.println("Remove Special character:-"+spec_char);
        String case1=s1.toUpperCase();//convert to uppercase given string
         System.out.println("To uppercase :-"+case1);
         String case2=s1.toLowerCase(); //covert to lowercase given string
         System.out.println("To Lowercase :-"+case2);
         int str_length=s1.length();//length of string
         System.out.println("Length of string :-"+str_length);
         int str_index=s1.indexOf("p");//index of p
         System.out.println("Index of p is:-"+str_index);
         String str_2=s1.replace("Patel's",""); //Remove word 'patel's' from given string
        System.out.println("Remove patel's word:-"+str_2);
    }}
