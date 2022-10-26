import java.util.Scanner;

public class BOI_SO_NHO_NHAT_CUA_N_SO_NGUYEN_DUONG_DAU_TIEN {
    public static long ucln(long a,long b){
        if(b==0) return a;
        return ucln(b,a%b);
    }
    public static long bcnn(long a,long b)
    {
        return (a*b)/ucln(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            int n=sc.nextInt();
            long s=1;
            for(long i=1;i<=n;i++)
            {
                s=bcnn(i,s);
            }
            System.out.println(s);
        }
    }
}
