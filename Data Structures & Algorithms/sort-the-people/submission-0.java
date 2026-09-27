class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<names.length;i++){
            for(int j=i;j<names.length;j++){
                if(heights[i]<=heights[j]){
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;

                    int temps=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temps;


                }
            }
        }
        return names;
    }
}