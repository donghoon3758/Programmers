class Solution {
    public long solution(int w, int h) {
        long answer =0;

        for(int i=0; i<w; i++){
            
        double a=((double)i*(double)h)/(double)w;
        answer+=(long)a;

}
        return answer*2;
    }
}