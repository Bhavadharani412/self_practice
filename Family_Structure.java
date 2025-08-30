public class Solution {
	public static String kthChildNthGeneration(int n, long k) {
		boolean gender = false;
        while(n>1){
            if(k%2==0){
                k=k/2;
                gender = !gender;
            } 
            else k = (k+1)/2;
            n--;
        }
        if(gender) return "Female";
        else return "Male";
	}
}
