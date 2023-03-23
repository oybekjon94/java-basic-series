package javaBasics01;

//bu misolda biz berilgan elementning
// index raqamini topishimiz kere boladi
public class Problems10 {
    public static void main(String[] args) {
        Problems10 problem10 = new Problems10();
        int array[] = {-1,0,3,5,9,12};
        System.out.println(problem10.search(array,9));
    }
    public int search(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
