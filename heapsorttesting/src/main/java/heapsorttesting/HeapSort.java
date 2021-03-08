package heapsorttesting;

import java.util.Scanner;

/**
 * Heap Sort.
 */
public class HeapSort {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Método que ordena um vetor de inteiros utilizando o algoritmo de Heap Sort.
     *
     * Fonte: https://pt.wikipedia.org/wiki/Heapsort
     *
     * @param vetor - Vetor que será ordenado.
     */
    public void sort(int[] vetor) {
        if (vetor == null) {
            return;
        }
        int tamanho = vetor.length;
        int i = tamanho / 2;
        int pai;
        int filho;
        int t;
        while (true) {
            if (i > 0) {
                i--;
                t = vetor[i];
            } else {
                tamanho--;
                if (tamanho <= 0) {
                    return;
                }
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = (i * 2) + 1;
            secondLoop(filho, tamanho, vetor, pai, t);
        }
    }

    /**
     * Método para continuação do 'sort'.
     */
    public void secondLoop(int filho, int tamanho, int[] vetor, int pai, int t) {
        int filhoCont = filho;
        int tamanhoCont = tamanho;
        int[] vetorCont = vetor;
        int paiCont = pai;
        int tCont = t;

        while (filhoCont < tamanhoCont) {
            if ((filhoCont + 1 < tamanhoCont) && (vetorCont[filhoCont + 1] > vetorCont[filhoCont])) {
                filhoCont++;
            }
            if (vetorCont[filhoCont] > tCont) {
                vetorCont[paiCont] = vetorCont[filhoCont];
                paiCont = filhoCont;
                filhoCont = paiCont * 2 + 1;
            } else {
                break;
            }
        }
        vetorCont[paiCont] = tCont;
    }
}
