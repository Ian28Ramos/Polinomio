import java.util.Scanner;

public class Validaciones 
{
    Scanner sc=new Scanner(System.in);
    String V;
    Operaciones Op=new Operaciones();
    
    public void Valores()
    {
        this.V=V;
        try{
        System.out.print("Ingresa un valor: ");
        V=sc.nextLine();
        char v=V.charAt(0);
            if(Character.isDigit(v))
            {
            } 
        }catch(Exception e){System.err.println("Error de entrada, digite puros digitos");}
    }
    
    public String getValor()
    {
        return V;
    }
    
    public void APos(double a,double b,double c)
    {
        Op.Discriminante(a, b, c);
        double discriminante=Op.getDiscriminante();
        
        if(discriminante>0)
        {
            Op.DisPos(discriminante,a,b);
        }
        else if(discriminante==0)
        {
            Op.DisCero(a,b);
        }
        else if(discriminante<0)
        {
            Op.DisNeg(discriminante,a,b);
        }
    }
    
    public void A1(double b)
    {
        Op.Raiz((b*b)/4);
        double raiz=Op.getRaiz();
        double x1=(-b/2)+((raiz/4)-b);
        double x2=(-b/2)-((raiz/4)-b);
        System.out.println("x1= "+x1+"\nx2= "+x2);
    }
    
    public void B0(double a, double c)
    {
        Op.Raiz(-(c/a));
        double x1=Op.getRaiz();
        double x2=-(Op.getRaiz());
        System.out.println("x1= "+x1+"\nx2= "+x2);
    }
    
    public void C0(double a, double b)
    {
        Op.Raiz(b);
        double raiz=Op.getRaiz();
        double x1=(-b+raiz)/(2*a);
        double x2=(-b-raiz)/(2*a);
        System.out.println("x1= "+x1+"\nx2= "+x2);
        
    }
    
    public void BC0(double a)
    {
        Op.Raiz(a);
        double x1=Op.getRaiz();
        double x2=-(Op.getRaiz());
        System.out.println("x1= "+x1+"\nx2= "+x2);
    }
    
    public void ComprobacionB()
    {
        
    }
    
    public void ComprobacionC()
    {
        
    }
}
