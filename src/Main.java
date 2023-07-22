public class Main {
    public static void main(String[] args) {
        System.out.println(GuthrieIndex(42));
    }
    static int GuthrieIndex(int n) {
        int index=0;
        if (n>1){
            while(n!=1){
                if(n%2==0)n/=2;
                else n=(n*3)+1;
                   index++;
            }

        }
return index;
    }
}