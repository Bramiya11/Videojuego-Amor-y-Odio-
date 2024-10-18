package Precuelas;
import java.util.Scanner;
public class Main {
    static int amor=0;
    static int odio=0;
    static String desicion="";
    static String ruta="";
    
    static void esperar1(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Historia h=new Historia();
        
        
        //Ventanas
        Ventana v1 = new Ventana();
        
        
        //Líderes
        Lider lo=new Lider("Long",10,10);
        Lider ly=new Lider("Lyana",10,10);
        
        
        System.out.println("Amor y Odio\nDesarrollado por Sofía Iguarán Borja y Brandon Ramirez Bedoya\n");
        esperar1();
        System.out.println(h.getPresentacion1());
        esperar1();
        
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getPresentacion2());
        
        
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getDialogo1());
        v1.setTitle("Long");
        v1.imagenLong();
        v1.setVisible(true);
        
        
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getDialogo2());
        v1.setTitle("Lyana");
        v1.imagenLyana();
        v1.setVisible(true);
        
        
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        v1.setVisible(false);
        v1.dispose();
        System.out.println(h.getDialogo3());
        System.out.println("\n"+h.getToma1());
        while (true){
            desicion=s.nextLine();
            if (desicion.equals("A")){
                amor++;
                ruta=desicion;
                break;
            }else if (desicion.equals("O")){
                odio++;
                ruta=desicion;
                break;
            }
            else{
                System.out.println("Ingresa una opción entre A y O y presiona [ENTER]");
            }
        }
        switch (ruta){
            case "A":
                System.out.println("\n"+h.A1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.A2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.getToma2A());
                break;
            case "O":
                System.out.println("\n"+h.O1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.O2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.getToma2O());
                break;
        }
        while (true){
            desicion=s.nextLine();
            if (desicion.equals("A")){
                amor++;
                ruta=ruta+desicion;
                break;
            }else if (desicion.equals("O")){
                odio++;
                ruta=ruta+desicion;
                break;
            }
            else{
                System.out.println("Ingresa una opción entre A y O y presiona [ENTER]");
            }
        }
        switch (ruta){
            case "AA":
                System.out.println("\n"+h.AA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AA4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.getToma3AA());
                break;
            case "AO":
                System.out.println("\n"+h.AO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.getToma3AO());
                break;
            case "OA":
                System.out.println("\n"+h.OA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OA4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OA5());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OA6());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.getToma3OA());
                break;
            case "OO":
                System.out.println("\n"+h.OO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OO4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OO5());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.getToma3OO());
                break;
        }
        while (true){
            desicion=s.nextLine();
            if (desicion.equals("A")){
                amor++;
                ruta=ruta+desicion;
                break;
            }else if (desicion.equals("O")){
                odio++;
                ruta=ruta+desicion;
                break;
            }
            else{
                System.out.println("Ingresa una opción entre A y O y presiona [ENTER]");
            }
        }
        switch (ruta){
            case "AAA":
                System.out.println("\n"+h.AAA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AAA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                break;
            case "AAO":
                System.out.println("\n"+h.AAO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AAO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                break;
            case "AOA":
                System.out.println("\n"+h.AOA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AOA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AOA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AOA4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AOA5());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                break;
            case "AOO":
                System.out.println("\n"+h.AOO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AOO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.AOO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                break;
            case "OAA":
                System.out.println("\n"+h.OAA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OAA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OAA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OAA4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OAA5());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                break;
            case "OAO":
                System.out.println("\n"+h.OAO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OAO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OAO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                break;
            case "OOA":
                System.out.println("\n"+h.OOA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OOA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OOA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                break;
            case "OOO":
                System.out.println("\n"+h.OOO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OOO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("\n"+h.OOO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                break;
        }
    }
}
