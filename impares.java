public class impares {

    public static void main(String[] args)
    {
        System.out.println(imp(13579));        
    }

    public static int imp(int n)
    {
        if(n<10 && n % 2 == 1) return 1;
        else if(n%2==1) return 1 + imp(n/10);   
        return imp(n/10);   
    }       
}
