public class Back{
    public static void main(String[] args) {
        String str = "ABCDEFG";
        char current  = str.charAt(1);
        String newStr = str.substring(0,1) + str.substring(1+1);
        System.out.println(current + newStr);
    }
}