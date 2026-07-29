class Solution {

  static boolean isLetter(char ch){
        return (ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z');
    }
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !isLetter(arr[left])){
                left++;
            }
            while(left<right && !isLetter(arr[right])){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }

        return (new String(arr));
    }
}