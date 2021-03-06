


/*

Pascal's Triangle

Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]



*/






public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> trilist = new ArrayList<>();
        
        List<Integer> pre = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> cur = new ArrayList<>();
            
            for (int j=1;j<=i;j++){
                if (j==1 || j==i){
                    cur.add(1);
                }else{
                    cur.add(pre.get(j-2)+pre.get(j-1));
                }
                
            }
            pre = cur;
            trilist.add(cur);
        }
        return trilist;
    }
}