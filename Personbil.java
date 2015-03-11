class PersonBil extends FossilBil {
  private int antPass;

  PersonBil (String regnr, double utslipp, int antPass) {
    super(regnr, utslipp);
    this.antPass = antPass;
  }

  public int getAntPass() {
    return antPass;
  }

  @Override
  // override av Array Objects toString slik at utskrift til terminal gir
  // meningsfylt informasjon
  public String toString () {
    return "PERSONBIL - registreringsnummer: " + getRegnr() + "\r\n"
    + "PERSONBIL - utslipp: " + getUtslipp() + "\r\n"
    + "PERSONBIL - antall passasjerer: " + getAntPass();
  }

}
