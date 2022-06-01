class Solution {
    public int solution(String name) {
        int answer = 0;
        int AIndex=0;
        int min=name.length()-1;
        for(int i=0; i<name.length(); i++){
            answer+=Math.min(name.charAt(i)-'A','Z'-name.charAt(i)+1);
            AIndex=i+1;
            while(AIndex<name.length() && name.charAt(AIndex)=='A'){
                AIndex++;
            }
            min = Math.min(min,(i*2)+name.length()-AIndex);//앞으로 나아가다가 다시 뒤로 가는게 빠를 때
            min = Math.min(min,(name.length()-AIndex)*2+i);//처음부터 뒤로 가서 앞으로 나아가기
        }
        return answer+min;
    }
}