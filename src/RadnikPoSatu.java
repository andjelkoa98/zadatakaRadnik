public class RadnikPoSatu extends Radnik{
    private int cenaSata;
    private int brojSati;
    private int brojDana;


    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun,int cenaSata, int brojSati, int brojDana) {
        super(ime, prezime, jmbg, ziroRacun);
        this.cenaSata = cenaSata;
        this.brojDana = brojDana;
        this.brojSati = brojSati;
    }

    private void obracunajPlatu(){
        super.plata = this.cenaSata * this.brojSati * this.brojDana;
    }

    @Override
    public void isplatiPlatu(){
        obracunajPlatu();
        super.isplatiPlatu();
    }
}
