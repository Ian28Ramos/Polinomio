import java.util.Scanner;

public class Binomio 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i;
        String a,b,c;
        //Operaciones Op=new Operaciones();
        Validaciones V=new Validaciones();
        
        System.out.println("Introduzca los valores de a, b y c: ");
                V.Valores();
                a=V.getValor();
                System.out.println(a);
                V.Valores();
                b=V.getValor();
                System.out.println(b);
                V.Valores();
                c=V.getValor();
                System.out.println(c);
                
        double a1=Double.parseDouble(a);
        double b1=Double.parseDouble(b);
        double c1=Double.parseDouble(c);
        
        if(a1!=0 && b1!=0)
        {
            V.APos(a1,b1,c1);
        }
    }
}
