package Precuelas;
import java.util.Scanner;
public class Main {
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
        
        
        //Introducción
        System.out.println("Amor y Odio\nDesarrollado por Sofía Iguarán Borja y Brandon Ramirez Bedoya\n");
        esperar1();
        System.out.println(h.getPresentacion1());
        esperar1();
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getPresentacion2());
        
        //Imagen Long
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getDialogo1());
        v1.setTitle("Long");
        v1.imagenLong();
        v1.setVisible(true);
        
        
        //Imagen Lyana
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getDialogo2());
        v1.setTitle("Lyana");
        v1.imagenLyana();
        v1.setVisible(true);
        
        
        //Primera desición
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        v1.setVisible(false);
        v1.dispose();
        System.out.println(h.getDialogo3());
        System.out.println("\n"+h.getToma1());
        while (true){
            desicion=s.nextLine();
            if (desicion.equals("A")){
                ruta=desicion;
                break;
            }else if (desicion.equals("O")){
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
                System.out.println(h.A2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.getToma2A());
                break;
            case "O":
                System.out.println("\n"+h.O1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.O2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.getToma2O());
                break;
        }
        
        
        //Segunda desición
        while (true){
            desicion=s.nextLine();
            if (desicion.equals("A")){
                ruta=ruta+desicion;
                break;
            }else if (desicion.equals("O")){
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
                System.out.println(h.AA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AA4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.getToma3AA());
                break;
            case "AO":
                System.out.println("\n"+h.AO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.getToma3AO());
                break;
            case "OA":
                System.out.println("\n"+h.OA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OA4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OA5());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OA6());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.getToma3OA());
                break;
            case "OO":
                System.out.println("\n"+h.OO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OO4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OO5());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.getToma3OO());
                break;
        }
        
        
        //Tercera desición
        while (true){
            desicion=s.nextLine();
            if (desicion.equals("A")){
                ruta=ruta+desicion;
                break;
            }else if (desicion.equals("O")){
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
                System.out.println(h.AAA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "AAO":
                System.out.println("\n"+h.AAO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AAO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "AOA":
                System.out.println("\n"+h.AOA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AOA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AOA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AOA4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AOA5());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "AOO":
                System.out.println("\n"+h.AOO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AOO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.AOO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "OAA":
                System.out.println("\n"+h.OAA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OAA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OAA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OAA4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OAA5());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "OAO":
                System.out.println("\n"+h.OAO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OAO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OAO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "OOA":
                System.out.println("\n"+h.OOA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OOA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OOA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "OOO":
                System.out.println("\n"+h.OOO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OOO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OOO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
        }
    }
}
