package tree;

public class ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args) {

        int[] nums = {-10,-3,0,5,9};

    }

    public static TreeNode sortedArrayToBST(int[] nums){
        return buildBST(nums, 0, nums.length - 1);
    }

    private static TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);
        return root;
    }

}
