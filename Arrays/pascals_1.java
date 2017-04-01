# Pascals Triangle 1

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> fList = new ArrayList<List<Integer>>();
		
		// 0th row
        if(numRows == 0){
            return fList;
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        fList.add(list);
		
		// 1st row
        if(numRows == 1){
            return fList;
        }
		
		// Iterate till the number of rows
        for(int i=2;i<=numRows;i++){
            List<Integer> temp = new ArrayList<Integer>();
            int p=0;
            int q=p+1;
			
			// Update list with new row
            temp.add(list.get(p));
            while(q<list.size()){
                temp.add(list.get(p) + list.get(q));
                p++;
                q++;
            }
            temp.add(list.get(p));
            list = temp;
			
			// Add new row to the final list
            fList.add(list);
        }
        return fList;
    }
}