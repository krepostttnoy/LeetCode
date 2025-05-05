class Solution{
    public boolean isPolyndrom(int x){
        int reversed_num = 0;
        int orig = x;
        if(x<0){
            return false;
        }

        while(x!=0){
            reversed_num = reversed_num * 10 + x%10;
            x /= 10;
        }
        return orig == reversed_num;
    }
}
