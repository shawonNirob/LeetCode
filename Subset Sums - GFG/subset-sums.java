//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0, arr, ans, new ArrayList<>());
        return ans;
    }
    public void helper(int index, ArrayList<Integer> arr, ArrayList<Integer> ans, ArrayList<Integer> list){
        if(index == arr.size()){
            int sum=0;
            for(int i=0; i<list.size(); i++){
                sum += list.get(i);
            }
            ans.add(sum);
            return;
        }
        
        list.add(arr.get(index));
        helper(index+1, arr, ans, list);
        list.remove(list.size()-1);
        helper(index+1, arr, ans, list);
    }
}