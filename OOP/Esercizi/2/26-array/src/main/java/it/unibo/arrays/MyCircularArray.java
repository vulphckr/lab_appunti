package it.unibo.arrays;

class MyCircularArray {

    int[] array;

    MyCircularArray() {
    }

    MyCircularArray(int size) {
    }

    void add(final int elem) {
    }

    void reset() {
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {

        // 1) Creare un array circolare di dieci elementi

        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare

        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare

        // 4) Invocare il metodo reset

        // 5) Stampare il contenuto dell'array circolare

        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
    }
}
