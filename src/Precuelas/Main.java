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
        
        
        //Mundo y personajes
        Lider lo=new Lider("Long",10,10);
        Lider ly=new Lider("Lyana",10,10);
        Ciudadano ca = new Ciudadano("Civiles Alpha",0,0,250);
        Ciudadano cb = new Ciudadano("Civiles Beta",0,0,250);
        Militante ma = new Militante("Militantes Alpha",0,0,50);
        Militante mb = new Militante("Militantes Beta",0,0,50);
        Alpha a = new Alpha(8,9);
        Beta b = new Beta(6,8);
        
        
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
        
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        lo.mostrarInformacion();
        ca.infoCivilAlpha();
        ma.infoMiliAlpha();
        a.infoAlpha();
        
        //Imagen Lyana
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        System.out.println(h.getDialogo2());
        v1.setTitle("Lyana");
        v1.imagenLyana();
        v1.setVisible(true);
        
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
        ly.mostrarInformacion();
        cb.infoCivilBeta();
        mb.infoMiliBeta();
        b.infoBeta();
        
        //Primera desición
        System.out.println("\nPresiona [ENTER] para continuar...");
        s.nextLine();
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
                v1.setTitle("Ruta A");
                v1.imagenA();
                v1.setVisible(true);
                
                
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                ca.setCiviles(239);
                ca.infoCivilAlpha();
                ma.setMilitantes(40);
                ma.infoMiliAlpha();
                a.setFelicidadTribu(7);
                a.infoAlpha();
                
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();                
                System.out.println(h.getToma2A());
                break;
            case "O":
                System.out.println("\n"+h.O1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.O2());
                v1.setTitle("Ruta O");
                v1.imagenO();
                v1.setVisible(true);
                
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                a.setConfianzaLider(8);
                a.setFelicidadTribu(6);
                a.infoAlpha();
                
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
                
                a.setConfianzaLider(10);
                a.setFelicidadTribu(10);
                a.infoAlpha();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.AA2());
                v1.setTitle("Ruta AA");
                v1.imagenAA();
                v1.setVisible(true);
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                lo.setVida(9);
                lo.mostrarInformacion();
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
                
                a.setConfianzaLider(7);
                a.setFelicidadTribu(7);
                a.infoAlpha();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.AO2());
                v1.setTitle("Ruta AO");
                v1.imagenAO();
                v1.setVisible(true);
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.AO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                cb.setCiviles(120);
                mb.setMilitantes(0);
                cb.infoCivilBeta();
                mb.infoMiliBeta();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.getToma3AO());
                break;
            case "OA":
                System.out.println("\n"+h.OA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                v1.setTitle("Ruta OA");
                v1.imagenOA();
                v1.setVisible(true);
        
                System.out.println(h.OA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                a.setConfianzaLider(10);
                a.infoAlpha();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.OA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OA4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                lo.setAtaque(9);
                lo.setVida(6);
                lo.mostrarInformacion();
                ly.setAtaque(6);
                ly.setVida(3);
                ly.mostrarInformacion();
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
                
                v1.setTitle("Ruta OO");
                v1.imagenOO();
                v1.setVisible(true);
                System.out.println(h.OO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                a.setConfianzaLider(7);
                a.setFelicidadTribu(5);
                b.setConfianzaLider(10);
                b.setFelicidadTribu(10);
                a.infoAlpha();
                b.infoBeta();
                
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
                
                lo.setVida(0);
                lo.setAtaque(0);
                lo.mostrarInformacion();
                
                v1.setTitle("Ruta AAA");
                v1.imagenAAA();
                v1.setVisible(true);
                System.out.println(h.AAA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ca.setCiviles(0);
                ca.infoCivilAlpha();
                ma.setMilitantes(0);
                ma.infoMiliAlpha();
                b.setConfianzaLider(10);
                b.setFelicidadTribu(10);
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "AAO":
                System.out.println("\n"+h.AAO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ly.setAtaque(0);
                ly.setVida(0);
                ly.mostrarInformacion();
                lo.setAtaque(0);
                lo.setVida(0);
                lo.mostrarInformacion();
                
                v1.setTitle("Ruta AAO");
                v1.imagenAAO();
                v1.setVisible(true);
                System.out.println(h.AAO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ca.setCiviles(0);
                ca.infoCivilAlpha();
                cb.setCiviles(0);
                cb.infoCivilBeta();
                ma.setMilitantes(0);
                ma.infoMiliAlpha();
                mb.setMilitantes(0);
                mb.infoMiliBeta();
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
                
                lo.setAtaque(0);
                lo.setVida(0);
                lo.mostrarInformacion();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.AOA4());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ly.setAtaque(0);
                ly.setVida(0);
                ly.mostrarInformacion();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                v1.setTitle("Ruta AOA");
                v1.imagenAOA();
                v1.setVisible(true);
                System.out.println(h.AOA5());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ca.setCiviles(0);
                ca.infoCivilAlpha();
                cb.setCiviles(0);
                cb.infoCivilBeta();
                ma.setMilitantes(0);
                ma.infoMiliAlpha();
                mb.setMilitantes(0);
                mb.infoMiliBeta();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "AOO":
                System.out.println("\n"+h.AOO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                cb.setCiviles(0);
                cb.infoCivilBeta();
                mb.setMilitantes(0);
                mb.infoMiliBeta();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.AOO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ly.setAtaque(0);
                ly.setVida(0);
                ly.mostrarInformacion();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                v1.setTitle("Ruta AOO");
                v1.imagenAOO();
                v1.setVisible(true);
                System.out.println(h.AOO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                a.setConfianzaLider(10);
                a.setFelicidadTribu(10);
                a.infoAlpha();
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
                
                lo.setAtaque(0);
                lo.setVida(0);
                lo.mostrarInformacion();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.OAA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                System.out.println(h.OAA4());
                ca.setCiviles(0);
                ca.infoCivilAlpha();
                cb.setCiviles(0);
                cb.infoCivilBeta();
                ma.setMilitantes(0);
                ma.infoMiliAlpha();
                mb.setMilitantes(0);
                mb.infoMiliBeta();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                v1.setTitle("Ruta OAA");
                v1.imagenOAA();
                v1.setVisible(true);
                System.out.println(h.OAA5());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ly.setAtaque(0);
                ly.setVida(0);
                ly.mostrarInformacion();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "OAO":
                System.out.println("\n"+h.OAO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ly.setAtaque(0);
                ly.setVida(0);
                ly.mostrarInformacion();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.OAO2());
                lo.setAtaque(0);
                lo.setVida(0);
                lo.mostrarInformacion();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                v1.setTitle("Ruta OAO");
                v1.imagenOAO();
                v1.setVisible(true);
                System.out.println(h.OAO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ca.setCiviles(0);
                ca.infoCivilAlpha();
                cb.setCiviles(0);
                cb.infoCivilBeta();
                ma.setMilitantes(0);
                ma.infoMiliAlpha();
                mb.setMilitantes(0);
                mb.infoMiliBeta();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "OOA":
                System.out.println("\n"+h.OOA1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ca.setCiviles(0);
                ca.infoCivilAlpha();
                cb.setCiviles(0);
                cb.infoCivilBeta();
                ma.setMilitantes(0);
                ma.infoMiliAlpha();
                mb.setMilitantes(0);
                mb.infoMiliBeta();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.OOA2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                v1.setTitle("Ruta OOA");
                v1.imagenOOA();
                v1.setVisible(true);
                System.out.println(h.OOA3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                lo.setAtaque(0);
                lo.setVida(0);
                lo.mostrarInformacion();
                ly.setAtaque(0);
                ly.setVida(0);
                ly.mostrarInformacion();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
            case "OOO":
                System.out.println("\n"+h.OOO1());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                ly.setAtaque(0);
                ly.setVida(0);
                ly.mostrarInformacion();
                ca.setCiviles(0);
                ca.infoCivilAlpha();
                cb.setCiviles(0);
                cb.infoCivilBeta();
                ma.setMilitantes(0);
                ma.infoMiliAlpha();
                mb.setMilitantes(0);
                mb.infoMiliBeta();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println(h.OOO2());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                v1.setTitle("Ruta OOO");
                v1.imagenOOO();
                v1.setVisible(true);
                System.out.println(h.OOO3());
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                lo.setAtaque(0);
                lo.setVida(0);
                lo.mostrarInformacion();
                System.out.println("\nPresiona [ENTER] para continuar...");
                s.nextLine();
                
                System.out.println("Amor y Odio\nFinal: " + ruta);
                break;
        }
        v1.dispose();
    }
}
