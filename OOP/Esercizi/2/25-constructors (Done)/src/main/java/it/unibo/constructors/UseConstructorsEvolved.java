package it.unibo.constructors;

class UseConstructorsEvolved {

    public static void main(final String[] args) {
        // 1) Creare un treno con numero di posti di default, come nel caso
        // precedente (serve a verificare la nuova implementazione di Train()).

        // 2) Creare i seguenti treni usando il costruttore Train(int nFCSeats, int
        // nSCSeats)
        // - nFCSeats = 20; nSCSeats= 200;
        // - nFCSeats = 35; nSCSeats= 165;
        Train trenoski = new Train();
        Train frecciaRossa = new Train(20, 200);
        Train frecciaBianca = new Train(35, 165);

        trenoski.printTrainInfo();
        frecciaRossa.printTrainInfo();
        frecciaBianca.printTrainInfo();
    }
}

