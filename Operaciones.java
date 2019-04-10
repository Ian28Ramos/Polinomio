import java.math.*;

public class Operaciones
{
    double discriminante,x1,x2,raiz;
    
    public double Discriminante(double a,double b, double c)
    {
        this.discriminante=discriminante;
        double b2=b*b;
        discriminante=b2-4*a*c;
        return discriminante;
    }
    
    public void DisPos(double discriminante,double a, double b)
    {
        Raiz(discriminante);
        double raiz=getRaiz();
        double x1=0,x2=0;
        this.x1=x1;
        this.x2=x2;
        System.out.println("∆="+discriminante+"\t raíz="+raiz+"\t a="+a+"\t b="+b);
        x1=(-b+raiz)/(2*a); //x1=(-1*(b/(2*a)))+(raiz/2*a);
        x2=(-b-raiz)/(2*a); //x2=(-1*(b/(2*a)))-(raiz/2*a);
        System.out.println("Las raices son: "
                +"\n x1= "+x1
                +"\n x2= "+x2);
    }
    
    public void DisCero(double a,double b)
    {
        x1=-1*(b/(2*a));
        System.out.println("a="+a+"\t b="+b);
        System.out.println("La raíz x1 es: "+x1);
    }
    
    public void DisNeg(double discriminante,double a,double b)
    {
        this.discriminante=discriminante*-1;
        Raiz(discriminante);
        double raiz=getRaiz();
        double x1I=0,x2I=0,x1R=0,x2R=0;
        String x1="",x2="";
        System.out.println("∆="+discriminante+"\t raíz="+raiz+"\t a="+a+"\t b="+b);
        x1R=-b/(2*a);
        x1I=raiz/(2*a);
        x2R=-b/(2*a);
        x2I=-raiz/(2*a);
        x1=String.valueOf(x1R)+"+"+String.valueOf(x1I)+"i";
        x2=String.valueOf(x2R)+String.valueOf(x2I)+"i";
        System.out.println("Las raices son: "
                +"\n x1= "+x1
                +"\n x2= "+x2);
    }
    
    public double getDiscriminante()
    {
        return discriminante;
    }
    
    public double Raiz(double r)
    {
       double raiz=Math.sqrt(r);
       this.raiz=raiz;
       return raiz;
    }
    
    public double getRaiz()
    {
        return raiz;
    } 
}
