import java.util.*;


class Main{
    public static void helper(int units[], ArrayList<Integer> ans, int target){
        
        for (int i = units.length - 1; i >= 0; i--){
            while (target >= units[i]){
                target -= units[i];
                ans.add(units[i]);
            }
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int units[] = {1, 2, 5, 10, 20, 50};
        int target = 29;
        ArrayList<Integer> ans = new ArrayList<>();
        helper(units, ans, target);
        Collections.reverse(ans);
        System.out.println(ans);
        scn.close();
    }
}
