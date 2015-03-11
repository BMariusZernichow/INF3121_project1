class Bil {
  private String regnr;

  Bil (String regnr) {
    this.regnr = regnr;
  }

  public String getRegnr() {
    return regnr;
  }

  @Override
  // override av Array Objects toString slik at utskrift til terminal gir
  // meningsfylt informasjon
  public String toString () {
    return "BIL - registreringsnummer: " + getRegnr();
  }
}
