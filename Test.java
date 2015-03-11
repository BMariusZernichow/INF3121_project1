import java.io.*;
import java.util.*;

class Test implements Test {

  public static void main(String[] args) throws FileNotFoundException {
    hovedprogram();
  }

  public static void hovedprogram() throws FileNotFoundException {
    String bil = "BIL";
    String elbil = "EL";
    String fossilbil = "FOSSIL";
    String lastebil = "LASTEBIL";
    String personbil = "PERSONFOSSILBIL";
    String bilType = null;
    String regnr;
    int batteri;
    double utslipp;
    double nyttevekt;
    int antPass;

    ArrayList<Bil> dataliste = new ArrayList<Bil>();
    dataliste.clear();

    // leser inn filnavn fra terminal, leser innhold fra fil
    Scanner terminal = new Scanner(System.in).useLocale(Locale.ENGLISH);
    System.out.print("Skriv inn et filnavn: ");
    String filnavn = terminal.nextLine();

    File fil = new File(filnavn);
    Scanner scanner = new Scanner(fil);

    bilType = scanner.next();

    // sjekker om det finnes et element på neste linje
    while (scanner.hasNextLine() == true) {

      // tester om biltypen er av klassen: bil
      if (bilType.equals(bil)) {
        regnr = scanner.next();
        Bil b = new Bil(regnr);
        dataliste.add(b);
        if (scanner.hasNext()) {
          bilType = scanner.next();
        }
      }

      // tester om biltypen er av klassen: elbil
      if (bilType.equals(elbil)) {
        regnr = scanner.next();
        if (scanner.hasNextInt()) {
          batteri = scanner.nextInt();
          ElBil el = new ElBil(regnr, batteri);
          dataliste.add(el);
          if (scanner.hasNext()) {
            bilType = scanner.next();
          }
        }
        else {
          System.out.println("Feil: batteriverdien maa vaere av typen int");
        }
      }

      // tester om biltypen er av klassen: fossilbil
      if (bilType.equals(fossilbil)) {
        regnr = scanner.next();
        if (scanner.hasNextDouble()) {
          utslipp = scanner.nextDouble();
          FossilBil fb = new FossilBil(regnr, utslipp);
          dataliste.add(fb);
          if (scanner.hasNext()) {
            bilType = scanner.next();
          }
        }
        else {
          System.out.println("Feil: utslippsverdien maa vaere av typen double");
        }
      }

      // tester om biltypen er av klassen: lastebil
      if (bilType.equals(lastebil)) {
        regnr = scanner.next();
        if (scanner.hasNextDouble()) {
          utslipp = scanner.nextDouble();
          if (scanner.hasNextDouble()) {
            nyttevekt = scanner.nextDouble();
            LasteBil lb = new LasteBil(regnr, utslipp, nyttevekt);
            dataliste.add(lb);
            if (scanner.hasNext()) {
              bilType = scanner.next();
            }
          }
          else {
            System.out.println("Feil: nyttevektsverdien maa vaere av typen double");
          }
        }
        else {
          System.out.println("Feil: utslippsverdien maa vaere av typen double");
        }
      }

      // tester om biltypen er av klassen: personbil
      if (bilType.equals(personbil)) {
        regnr = scanner.next();
        if (scanner.hasNextDouble()) {
          utslipp = scanner.nextDouble();
          if (scanner.hasNextInt()) {
            antPass = scanner.nextInt();
            PersonBil pb = new PersonBil(regnr, utslipp, antPass);
            dataliste.add(pb);
            if (scanner.hasNext()) {
              bilType = scanner.next();
            }
          }
          else {
            System.out.println("Feil: verdien for antall passasjerer maa vaere av typen int");
          }
        }
        else {
          System.out.println("Feil: utslippsverdien maa vaere av typen double");
        }
      }
    }

    scanner.close();

    for (Bil bilen : dataliste) {
      if (bilen instanceof PersonBil) {
        System.out.println(bilen);
      }
    }
    }
    }
