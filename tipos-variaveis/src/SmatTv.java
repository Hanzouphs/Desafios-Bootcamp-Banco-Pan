public class SmatTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void statusTv() {
        System.out.println("A Tv está ligada? " + ligada);
        System.out.println("O canal da Tv é: " + canal);
        System.out.println("O volume da Tv é: " + volume);
        
        
    }
}

