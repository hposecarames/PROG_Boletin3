package boletin3;

/**
 *
 * @author Hector Pose Carames
 */
public class Consumo {

    int km;
    int litros;
    int vMed;
    double pGas;
    double tiempo;
    double consumoEuros;
    double cMed;

    public Consumo(int km, int litros, int vMed, double pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public Consumo() {
    }

    public double getTempo() {

        tiempo = km / vMed;
        return tiempo;
    }

    public double consumoMedio() {

        cMed = (km / vMed) * pGas;
        return cMed;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getvMed() {
        return vMed;
    }

    public void setvMed(int vMed) {
        this.vMed = vMed;
    }

    public double getpGas() {
        return pGas;
    }

    public void setpGas(double pGas) {
        this.pGas = pGas;
    }

}
