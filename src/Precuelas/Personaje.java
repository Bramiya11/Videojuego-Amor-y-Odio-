package Precuelas;
public class Personaje {
    private String nombre;
    private int vida;
    private int ataque;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setVida(int vida){
        this.vida=vida;
    }
    
    public void setAtaque(int ataque){
        this.ataque=ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }
}
