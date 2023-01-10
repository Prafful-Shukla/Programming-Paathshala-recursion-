class Solution {
    public List<List<Integer>> combine(int n, int k) {
        //(1,n)
        //k numbers
        
        List<List<Integer>> ans=new ArrayList<>();//storing (list of unique subset))(length k) in list
        
        List<Integer> temp=new ArrayList<>();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        
        recursive(arr,0,  n,k  ,temp,ans);
        return ans;
        
      }  
    
        
        static void recursive(int[] inputA,int index,        int n ,int k,            List<Integer> temp, List<List<Integer>> store){
            
            //Base case
           
            if(index==n){
                if(temp.size()==k)
                    store.add(new ArrayList<>(temp));
                return;
            }
            
            //recursive case
            //start index=0;
            //temp []
            
            
            //element lega
            temp.add(inputA[index]);//then call for no or yes
            recursive(inputA,index+1,n,k,temp,store);
            
            //element nhi lega
            temp.remove(temp.size()-1);
            recursive(inputA,index+1,n,k,temp,store);
        }class Solution {
    public List<List<Integer>> combine(int n, int k) {
        //(1,n)
        //k numbers
        
        List<List<Integer>> ans=new ArrayList<>();//storing (list of unique subset))(length k) in list
        
        List<Integer> temp=new ArrayList<>();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        
        recursive(arr,0,  n,k  ,temp,ans);
        return ans;
        
      }  
    
        
        static void recursive(int[] inputA,int index,        int n ,int k,            List<Integer> temp, List<List<Integer>> store){
            
            //Base case
           
            if(index==n){
                if(temp.size()==k)
                    store.add(new ArrayList<>(temp));
                return;
            }
            
            //recursive case
            //start index=0;
            //temp []
            
            
            //element lega
            temp.add(inputA[index]);//then call for no or yes
            recursive(inputA,index+1,n,k,temp,store);
            
            //element nhi lega
            temp.remove(temp.size()-1);
            recursive(inputA,index+1,n,k,temp,store);
        }
