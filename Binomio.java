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
                V.Valores();
                b=V.getValor();
                V.Valores();
                c=V.getValor();
                
        double a1=Double.parseDouble(a);
        double b1=Double.parseDouble(b);
        double c1=Double.parseDouble(c);
        
        if(a1==0)
        {
            System.out.println("No es posible encontrar una solución");
        }
        else
        {
            if(a1==1)
            {
                V.A1(b1);
            }
            else if(b1==0 && c1!=0)
            {
                V.B0(a1, c1);
            }
            else if(c1==0 && b1!=0)
            {
                V.C0(a1,b1);
            }
            else if(c1==0 && b1==0)
            {
                V.BC0(a1);
            }
            else
            {
                V.APos(a1,b1,c1);
            }
        }
    }
}
