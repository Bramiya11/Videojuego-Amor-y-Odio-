package Precuelas;
public class Militante extends Personaje{
    int militantes;
    
    public void setMilitantes(int militantes){
        this.militantes = militantes;
    }
    
    public int getMilitantes(){
        return militantes;
    }
    
    public Militante(String nombre, int vida, int ataque, int militantes){
        Militante.this.setNombre(nombre);
        Militante.this.setVida(vida);
        Militante.this.setAtaque(ataque);
        Militante.this.setMilitantes(militantes);
    }
    
    public void infoMiliAlpha(){
        System.out.println("Militantes de Alpha: " + this.militantes);
    }
    
    public void infoMiliBeta(){
        System.out.println("Militantes de Beta: " + this.militantes);
    }
}
