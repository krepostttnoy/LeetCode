import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romans = new HashMap<>();
        {
            romans.put('I', 1);
            romans.put('V', 5);
            romans.put('X', 10);
            romans.put('L', 50);
            romans.put('C', 100);
            romans.put('D', 500);
            romans.put('M', 1000);
        }

        int result = 0;

        for(int i = 0; i < s.length(); i++){
            int currentVal = romans.get(s.charAt(i));

            if(i + 1 < s.length()){
                int nextVal = romans.get(s.charAt(i + 1));
                if(currentVal < nextVal){
                    result += (nextVal - currentVal);
                    i++;
                    continue;
                }
            }
            result += currentVal;
        }
        return result;
    }
}