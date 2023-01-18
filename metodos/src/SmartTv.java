public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    //métodos para ligar ou desligar a TV
    public void ligar() {ligada = true;}
    public void desligar() {ligada = false;}

    //métodos para aumentar ou diminuir o volume
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    //métodos para mudar de canal de um em um
    public void aumentarCanal() {
        canal++;
        System.out.println("Mudando o canal para: " + canal);
    }
    public void diminuirCanal() {
        canal--;
        System.out.println("Mudando o canal para: " + canal);
    }

    //método para mudar de canal de acordo com a preferência do usuário
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando o canal para: " + canal);
    }
}
