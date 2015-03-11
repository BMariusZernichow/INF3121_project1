class ElBil extends Bil {
  private int batteri = 60;

  ElBil (String regnr, int batteri) {
    super(regnr);
    this.batteri = batteri;
  }

  public int getBatteri() {
    return batteri;
  }


  @Override
  // override av Array Objects toString slik at utskrift til terminal gir
  // meningsfylt informasjon
  public String toString () {
    //return Integer.toString(getBatteri());
    return "ELBIL - registreringsnummer: " + getRegnr() + "\r\n"
    + "ELBIL - batterikapasitet: " + getBatteri();
  }
}
