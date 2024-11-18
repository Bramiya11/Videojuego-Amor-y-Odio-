package Precuelas;
public class Lider extends Personaje{
    
    public Lider(String nombre, int vida, int ataque){
        Lider.this.setNombre(nombre);
        Lider.this.setVida(vida);
        Lider.this.setAtaque(ataque);
    }
    
    @Override
    public void MostrarInformacion(){
        System.out.println("Nombre de líder: " + this.getNombre());
        System.out.println("Puntos de Salud de líder: " + this.getVida());
        System.out.println("Puntos de Ataque de líder: " + this.getAtaque());
    }
}
