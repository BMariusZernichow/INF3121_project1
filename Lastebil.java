class LasteBil extends FossilBil {
  private double nyttevekt;

  LasteBil (String regnr, double utslipp, double nyttevekt) {
    super(regnr, utslipp);
    this.nyttevekt = nyttevekt;
  }

  public double getNyttevekt() {
    return nyttevekt;
  }

  @Override
  // override av Array Objects toString slik at utskrift til terminal gir
  // meningsfylt informasjon
  public String toString () {
    return "LASTEBIL - registreringsnummer: " + getRegnr() + "\r\n"
    + "LASTEBIL - utslipp: " + getUtslipp() + "\r\n"
    + "LASTEBIL - nyttevekt: " + getNyttevekt();
  }

}
