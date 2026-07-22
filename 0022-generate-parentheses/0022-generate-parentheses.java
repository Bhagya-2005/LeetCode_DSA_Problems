class Solution {

  public  static  void generate(List<String> result,int max,int open,int close,String unproceed){
            if(unproceed.length()==(2*max)){
                result.add(unproceed);
                return;
            }

            if(open<max){
                generate(result,max,open+1,close,unproceed+"(");
            }
            if(close<open){
                generate(result,max,open,close+1,unproceed+")");
            }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result= new ArrayList<String>();
        generate(result,n,0,0,"");
        return result;
        
    }
}