package Precuelas;
public class Alpha extends Tribu{
    
    public Alpha(int felicidad, int confianzaLider){
        Alpha.this.setFelicidadTribu(felicidad);
        Alpha.this.setConfianzaLider(confianzaLider);
    }
    
    public void infoAlpha(){
        System.out.println("Felicidad de la Tribu Alpha: " + this.getFelicidadTribu());
        System.out.println("Confianza de la Tribu Alpha en Long: " + this.getConfianzaLider());
    }
}
