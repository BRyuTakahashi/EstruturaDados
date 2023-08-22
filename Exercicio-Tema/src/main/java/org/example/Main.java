package org.example;

public class Main {
    public static void main(String[] args) {

        Evento OF = new Evento("Okinawa Fest");
        Barraca carrao = new Barraca("Seinen Carrão", "Seinen");
        Barraca SM = new Barraca("Santa Maria", "Seinen");

        Comida karague = new Comida("Karague", 20.0, true, false);
        Comida tamago = new Comida("Tamago Sando", 12.0, false, true);
        Comida bulgogui = new Comida("Bulgogui", 18.0, true, false);

        OF.adicionarBarraca(carrao);
        OF.adicionarBarraca(SM);
        carrao.adicionarVendavel(karague);
        carrao.adicionarVendavel(tamago);
        SM.adicionarVendavel(bulgogui);

        System.out.println(karague.getPreco());
        System.out.println(tamago.getPreco());
        System.out.println(bulgogui.getPreco());
    }
}