package Precuelas;
public class Beta extends Tribu{

    public Beta(int felicidad, int confianzaLider) {
        Beta.this.setFelicidadTribu(felicidad);
        Beta.this.setConfianzaLider(confianzaLider);
    }
    
    public void infoBeta(){
        System.out.println("Felicidad de la Tribu Beta: " + this.getFelicidadTribu());
        System.out.println("Confianza de la Tribu Beta en Lyana: " + this.getConfianzaLider());
    }
}
