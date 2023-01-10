//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends

//1st way

// class Solution {
//     public List<String> find_permutation(String S) {
//         // Code here
//         List<String> ans=new Arraylist<>();
//         StringBuilder br= new String Builder();
//         int[] isUsed=new int[26];
//         for(int i=0;i<S.length();i++){
//             isUsed[s.charAt(i)-'a']=1;
//         }
//         String per="";
//         rec(0,S,isUsed,per,ans);
//         Collections.sort(ans);
//         return ans;
//     }
    
//     static void rec(int index,String S,int[] isUsed,String per,List<String>ans){
        
//         if(index==S.length()-1){
//             //print
//             ans.add(per);
//             return;
//         }
//         for(int i=)
//         }
//     }
// }


//2nd way


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> answer=new ArrayList<>();
        //StringBuilder br= new String Builder();
        Set<String> ansSet=new HashSet<>();
        permutation(0,S,ansSet);
        for(String s:ansSet)answer.add(s);
        Collections.sort(answer);
        return answer;
    }
        public static void permutation(int idx,String S,Set<String>ans){
            if(idx>=S.length()){
                //print permutation or store
                ans.add(S);
                return;
            }
            for(int i=idx;i<S.length();i++){
                S=swap(idx,i,S);
                permutation(idx+1,S,ans);
                S=swap(idx,i,S);
            }
            
        }
    public static String swap(int a, int b, String s){
            char[] str = s.toCharArray();
            char t = str[a];
            str[a] = str[b];
            str[b] = t;
            return String.valueOf(str);
        }
}
