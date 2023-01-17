public class RadnikPoSatu extends Radnik{

    int cenaSata = 15;

    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun, int brojSati, int brojDana) {
        super(ime, prezime, jmbg, ziroRacun);
        super.plata = this.cenaSata * brojSati * brojDana;
    }



    @Override
    public void isplatiPlatu(){
        super.isplatiPlatu();
    }
}
