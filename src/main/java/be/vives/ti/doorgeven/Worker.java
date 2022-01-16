package be.vives.ti.doorgeven;

public class Worker {

    public void start()  {
        methodeA();
    }

    private void methodeA() {
        methodeB();
    }

    private void methodeB() {
        methodeC();
    }

    private void methodeC() {
        methodeD();
    }

    private void methodeD() {
        methodeE();
    }

    private void methodeE() {
        System.out.println("Methode E werd succesvol uitgevoerd");
    }

}
