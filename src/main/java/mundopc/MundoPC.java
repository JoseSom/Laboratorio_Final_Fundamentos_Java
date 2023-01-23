package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("BT", "HP");
        Raton ratonHP = new Raton("BT", "HP");
        Computadora computadoraHP = new Computadora("ComputadoraHP", monitorHP, tecladoHP, ratonHP);

        Orden ordenHP = new Orden();
        ordenHP.agregarComputador(computadoraHP);
        ordenHP.mostrarOrden();
    }
}
