package Precuelas;
import java.util.Scanner;
public class Main {
    static int amor=0;
    static int odio=0;
    static String desicion="";
    
    static void esperar1(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Lider lo=new Lider("Long",10,10);
        Lider ly=new Lider("Lyana",10,10);
        Historia h=new Historia();
        System.out.println("Amor y Odio");
        System.out.println("Desarrollado por Sofía Iguarán Borja y Brandon Ramirez Bedoya\n");
        esperar1();
        System.out.println(h.getPresentacion1());
        esperar1();
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getPresentacion2());
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getDialogo1());
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println("*IMAGEN*");
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getDialogo2());
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getDialogo3());
        System.out.println("\n"+h.getToma1());
        while (true){
            desicion=s.nextLine();
            if (desicion.equals("A")){
                amor++;
                break;
            }else if (desicion.equals("O")){
                odio++;
                break;
            }
            else{
                System.out.println("Ingresa una opción entre A y O y presiona [ENTER]");
            }
        }
        
    }
}
