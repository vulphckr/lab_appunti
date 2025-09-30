package it.unibo.arrays;

class MyCircularArray {

    int[] array;
    int currIndex;
    int size;

    MyCircularArray(int size) {
        array = new int[size];
        currIndex = 0;
        this.size = size;
    }

    MyCircularArray() {
        this(10);
    }

    void add(final int elem) {
        if(currIndex == size){
            currIndex = 0;
        }
        array[currIndex] = elem;
        currIndex++;
    }

    void reset() {
        int i = 0;
        for( ; i<this.size; i++ ){
            this.array[i] = 0;
        }
        currIndex = 0;
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]\n");
    }

    public static void main(final String[] args) {
        int i = 0;
        MyCircularArray circArray = new MyCircularArray();
        for( i = 1 ; i <= 10 ; i++ ){
            circArray.add(i);
        }
        for( i = 11 ; i <= 15 ; i++ ){
            circArray.add(i);
        }
        circArray.reset();
        for( i = 1 ; i <= 7 ; i++ ){
            circArray.add(i);
        }
        for( i = 11 ; i <= 15 ; i++ ){
            circArray.add(i);
        }
        circArray.printArray();
    }
}
