package ArvoreBinaria;

public class Testes {

    public static void main(String[] args) {
        NoArvoreBinaria raiz = new NoArvoreBinaria("Raiz");
        
        ArvoreBinaria arvore = new ArvoreBinaria();
        System.out.println("vazia? " + arvore.estaVazia());
        arvore.setRaiz(raiz);
        System.out.println("vazia? " + arvore.estaVazia());
        
        NoArvoreBinaria direita1 = new NoArvoreBinaria("Direita1");
        raiz.setDireita(direita1);
        
        NoArvoreBinaria direita2 = new NoArvoreBinaria("Direita2");
        direita1.setDireita(direita2);
        
        NoArvoreBinaria direita3 = new NoArvoreBinaria("Direita3");
        direita2.setDireita(direita3);
        
        NoArvoreBinaria esquerda1 = new NoArvoreBinaria("Esquerda1");
        raiz.setEsquerda(esquerda1);
        
        NoArvoreBinaria esquerda2 = new NoArvoreBinaria("Esquerda2");
        esquerda1.setEsquerda(esquerda2);
        
        NoArvoreBinaria esquerda3 = new NoArvoreBinaria("Esquerda3");
        direita2.setEsquerda(esquerda3);
        
        NoArvoreBinaria noIsolado1 = new NoArvoreBinaria("Isolado1");
        
        
        System.out.println("Qtd de nós: " + arvore.contarNos());
        System.out.println("String: " + arvore.toString());
        System.out.println("Buscando valor: " + arvore.pertence(direita1));
        System.out.println("Deve buscara um nó que não está na árvore. Está na árvore? " + arvore.pertence(noIsolado1));
        System.out.println("Conferir se a árvore consegue avaliar se um valor armazenado na raiz pertence à árvore. " + arvore.pertence(raiz));
        System.out.println("Conferir se a árvore consegue avaliar se um valor armazenado num nó folha pertence à árvore");
    }
}
