# Pascals triangle 2

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
		
		// 1st row
        if(rowIndex == 0){
            list.add(1);
            return list;
        }
		// 2nd row
        if(rowIndex == 1){
            list.add(1);
            list.add(1);
            return list;
        }
        list.add(1);
        list.add(1);
		
		// Iterate till k
        for(int i=2;i<=rowIndex;i++){
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
        }
        return list;
    }
}