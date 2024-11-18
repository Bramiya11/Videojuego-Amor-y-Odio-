package Precuelas;
public class Ciudadano extends Personaje{
    int civiles;
    
    public void setCiviles(int civiles){
        this.civiles = civiles;
    }
    
    public int getCiviles(){
        return civiles;
    }
    
    public Ciudadano(String nombre, int vida, int ataque, int civiles){
        Ciudadano.this.setNombre(nombre);
        Ciudadano.this.setVida(vida);
        Ciudadano.this.setAtaque(ataque);
        Ciudadano.this.setCiviles(civiles);
    }
    
    public void infoCivilAlpha(){
        System.out.println("Civiles de Alpha: " + this.civiles);
    }
    
    public void infoCivilBeta(){
        System.out.println("Civiles de Beta: " + this.civiles);
    }
}
