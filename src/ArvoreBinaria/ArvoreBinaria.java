package ArvoreBinaria;

import ArvoreBinaria.NoArvoreBinaria;

public class ArvoreBinaria<T> {

    private NoArvoreBinaria raiz;

    public ArvoreBinaria() {

    }

    public void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public boolean pertence(NoArvoreBinaria no, T info) {
        if (no.equals(info)) {
            return true;
        }
        if (no.getDireita() != null) {
            if (pertence(no.getDireita(), info)) {
                return true;
            }
        }
        if (no.getEsquerda() != null) {
            if (pertence(no.getEsquerda(), info)) {
                return true;
            }
        }

        return false;
    }

    public boolean pertence(T info) {
        if (info.equals(raiz)) {
            return true;
        }
        return (pertence(raiz.getDireita(), info) ? true : pertence(raiz.getEsquerda(), info));
    }

    public String toString() {
        if (raiz != null) {
            return arvorePre(raiz);
        }
        return "Vah sio!";
    }

    public String arvorePre(NoArvoreBinaria no) {
        String retorno = no.getInfo().toString();
        if (no.getDireita() != null) {
            retorno += " " + arvorePre(no.getDireita());
        }
        if (no.getEsquerda() != null) {
            retorno += " " + arvorePre(no.getEsquerda());
        }
        return retorno;
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    public int contarNos(NoArvoreBinaria no) {
        int qtdNos = 1;
        if (no.getDireita() != null) {
            qtdNos += contarNos(no.getDireita());
        }
        if (no.getEsquerda() != null) {
            qtdNos += contarNos(no.getEsquerda());
        }
        return qtdNos;
    }

}
