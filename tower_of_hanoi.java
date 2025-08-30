import java.util.ArrayList;
public class Solution{
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int src = 1, aux = 2, des = 3;
        solve(n, ans, src, aux, des);
        return ans;
    }
    private static void solve(int n, ArrayList<ArrayList<Integer>> ans, int src, int aux, int des){
        if(n == 0)return;
        solve(n-1, ans, src, des, aux);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(src);
        temp.add(aux);
        ans.add(temp);
        solve(n-1, ans, des,aux, src);
    }
}
