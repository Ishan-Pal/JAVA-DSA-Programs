class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         
         int max = candies[0]; 
         
         for (int i = 1; i < candies.length; i++) 
             if (candies[i] > max) 
                 max = candies[i]; 
        
        List<Boolean> output = new ArrayList<>(); 
        
        for(int i =0; i<candies.length; i++){
            if(candies[i]+extraCandies<max){
                output.add(false);
            }else{
                output.add(true);
            }
        }
        
        return output;
    }
}