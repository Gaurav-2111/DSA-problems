class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();
        int i=0,j=0;
        while(i<firstList.length && j<secondList.length){
            int start = Math.max(firstList[i][0],secondList[j][0]);
            int end = Math.min(firstList[i][1],secondList[j][1]);
            if(firstList[i][1] > secondList[j][1]){
                if(start <= end){
                    result.add(new int[]{start,end});
                }
                j++;
            }else{
                if(start <= end){
                    result.add(new int[]{start,end});
                }
                i++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}