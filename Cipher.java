import java.util.*;
class Main {
    public static String Compress(String str){
        StringBuilder ans = new StringBuilder();
        int count = 1;
        int i;
        for(i = 0 ; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)) count++;
            else{
                ans.append(str.charAt(i));
                ans.append(Integer.toString(count));
                count = 1;
            }   
        }
        ans.append(str.charAt(i));
        ans.append(Integer.toString(count));
        return ans.toString();
    }
    public static String Ceasar(String giveString, int rotatingNumber){
        StringBuffer ans = new StringBuffer();

        for(char ch : giveString.toCharArray()){
            if(Character.isLowerCase(ch)){
                char localRes = (char)((((int)ch) + rotatingNumber - 97) % 26 + 97);
                ans.append(localRes);
            }
            else{
                char localRes = (char)((((int)ch) + rotatingNumber - 65) % 26 + 65);
                ans.append(localRes);
            }
        }
        return ans.toString();

    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String givenString = "AAABCCCFZZZ";
        int rotatingNumber = 3;
        String ceasar = Ceasar(givenString, rotatingNumber);
        System.out.println(Compress(ceasar));
        scn.close();
    }
}
