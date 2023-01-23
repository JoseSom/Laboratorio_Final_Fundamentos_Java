package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(", contadorTeclados=").append(contadorTeclados);
        sb.append('}');
        return sb.toString();
    }
}
