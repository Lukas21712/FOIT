package b_12FOIT.iv.einkaufsverwaltung;

public class Produkt {
    private String bezeichnung;
    private double preis;
    private static int anzahlProdukte;

    public Produkt() {
        anzahlProdukte++;
    }

    public Produkt(String bezeichnung) {
        this.bezeichnung = bezeichnung;

        anzahlProdukte++;
    }

    public Produkt(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;

        anzahlProdukte++;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public static int getAnzahlProdukte() {
        return anzahlProdukte;
    }

    @Override
    public String toString() {
        return "Produkt: " + bezeichnung + "\n" +
                "Preis: " + preis;
    }
}
