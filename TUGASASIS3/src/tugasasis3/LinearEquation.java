package tugasasis3;

/**
 *
 * @author santiclara
 */
public class LinearEquation {
    private double a,b,c,d;
    private int e,f;
    
    
    
    public LinearEquation(){
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        
        
    }
    public LinearEquation(double a, double b,double c,double d,int e,int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public void seta(double a){
        this.a=a;
    }
    public double geta(){
        return this.a;
    }
    public void setb(double b){
        this.b=b;
    }
    public double getb(){
        return this.b;
    }
    public void setc(double c){
        this.c=c;
    }
    public double getc(){
        return this.c;
    }
    public void setd(double d){
        this.d=d;
    }
    public double getd(){
        return this.d;
    }
    public void sete(int e){
        this.e=e;
    }
    public int gete(){
        return this.e;
    }
    public void setf(int f){
        this.f=f;
    }
    public int getf(){
        return this.f;
    }
    public double getx(){
        return (((e*d)-(b*f))/((a*d)-(b*c)));
    }
    public double gety(){
        return (((a*f)-(e*c))/((a*d)-(b*c)));
    }
    public void Persamaan(){
        System.out.println("Output : ");
        System.out.println("Sistem Persamaannya : ");
    }
    public void PersamaanLinear1(double a, double b, int e) {
        if(b<0) {
            System.out.println(+geta()+"x"+getb()+"y="+gete());
            
        }
        else if(b>=0){
            System.out.println(+geta()+"x"+getb()+"y="+gete());
        }
    }
    public void PersamaanLinear2(double c, double d, int f) {
        if(d<0) {
            System.out.println(+getc()+"x"+getd()+"y="+getf());
            
        }
        else if(d>=0){
            System.out.println(+getc()+"x"+getd()+"y="+getf());
    }
}
    public void Hasilnya(){
        System.out.println();
        System.out.println();
        System.out.println("Hasilnya : ");  
    }
    public void CekSolusi(){
        if ((geta()*getd())-(getb()*getc())==0){
                System.out.println("Sistem Tidak Memiliki Penyelesaian.");
            }else{
                System.out.printf("x ="+"%.2f",getx());
                System.out.printf(", y ="+"%.2f",gety());
                
        }
}}