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
            min = Math.min(min,(i*2)+name.length()-AIndex);//������ ���ư��ٰ� �ٽ� �ڷ� ���°� ���� ��
            min = Math.min(min,(name.length()-AIndex)*2+i);//ó������ �ڷ� ���� ������ ���ư���
        }
        return answer+min;
    }
}