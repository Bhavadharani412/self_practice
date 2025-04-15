import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        int n = arr.size();
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr.get(i); 
        }
        return xorr;
    }
}
