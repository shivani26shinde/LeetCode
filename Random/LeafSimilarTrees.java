// Leaf similar trees

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1 = Traverse(root1,list1);
        list2 = Traverse(root2,list2);
        if(list1.size() != list2.size()){
            return false;
        }
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }
    public ArrayList<Integer> Traverse(TreeNode node, ArrayList<Integer> list){
        if(node == null){
            return list;
        }
        if(node != null && node.left == null && node.right == null){
            list.add(node.val);
            return list;
        }
        list = Traverse(node.right,list);
        list = Traverse(node.left,list);
        return list;
    }
}