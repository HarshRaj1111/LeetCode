package practiceArray;

public class secondlar {
    public static void main(String[] args) {
        int []arr = {1,10,7,6,5,3};
        int lar = arr[0]; int seclar = 0;
        for(int num:arr)
        {
            if(num>=lar){
                seclar = lar;
                lar = num;
            }
            else if (num>=seclar && num<lar) {
                seclar = num;
            }
        }
        System.out.println(seclar);
    }
}
