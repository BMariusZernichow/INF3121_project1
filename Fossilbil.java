class FossilBil extends Bil {
  private double utslipp;

  FossilBil (String regnr, double utslipp) {
    super(regnr);
    this.utslipp = utslipp;
  }

  public double getUtslipp() {
    return utslipp;
  }

  @Override
  // override av Array Objects toString slik at utskrift til terminal gir
  // meningsfylt informasjon
  public String toString () {
    return "FOSSILBIL - registreringsnummer: " + getRegnr() + "\r\n"
    + "FOSSILBIL - utslipp: " + getUtslipp();
  }

}
