class Solution {
    public int solution(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            arr[i+1] = lcm(arr[i],arr[i+1]);
        }
        return arr[arr.length-1];
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp = a%b;
            a=b;
            b=temp;
        }
        System.out.println(a);
        return a;
    }
    public int lcm(int a, int b){
        return a*b/gcd(a,b);
    }

}