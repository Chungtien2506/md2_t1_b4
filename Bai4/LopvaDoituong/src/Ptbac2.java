import java.util.Scanner;

public class Ptbac2 {
     private  double a,b,c;
   public Ptbac2(double a,double b,double c){
        this.a = a;
        this.b = b ;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
        public double getDiscriminant(){
       return this.b*this.b-4*this.a*this.c;
    }
    public  double getNghiem1(){
     double delta = getDiscriminant();
         if(delta<0){
             return  0;
         }else {
             return (-this.b+Math.sqrt(delta)/this.a*2);
         }

    }
    public  double getNghiem2(){
       double delta = getDiscriminant();
           if (delta<0){
               return  0;
           } else {
               return (-this.b-Math.sqrt(delta)/this.a*2);
           }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao a");
        double a = scanner.nextDouble();
        System.out.println("nhap vao b");
        double b = scanner.nextDouble();
        System.out.println("nhap vao b");
        double c = scanner.nextDouble();
        Ptbac2 ptbac2 = new Ptbac2(a, b, c);
        double delta = ptbac2.getDiscriminant();
        if (ptbac2.getDiscriminant() > 0) {
            System.out.println("pt co 2 nghiem phan biet:" +  "x1"+ ptbac2.getNghiem1() + "va" +  "x2"+ptbac2.getNghiem2());
        } else if (ptbac2.getDiscriminant() == 0) {
            System.out.println("pt co nghiem kep:" + ptbac2.getNghiem1());
        } else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
    }

