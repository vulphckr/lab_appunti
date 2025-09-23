class UseTrain {
    public static void main(String[] args) {
        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         *
         *
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere per i parametri
         *
         * 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente
         *
         * 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe.
         *
         * 4) Cancellare tutte le prenotazioni
         *
         * 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
         * occupazione
         */
		 
		 Train frecciarossa = new Train();
		 frecciarossa.build(50, 150);
		 frecciarossa.reserveFirstClassSeats(49);
		 frecciarossa.reserveFirstClassSeats(2); // Per error testing
		 frecciarossa.reserveSecondClassSeats(74);
		 frecciarossa.reserveSecondClassSeats(2);
		 System.out.println("La percentuale di posti occupati in prima classe è: " + frecciarossa.getFirstClassOccupancyRatio() + "%");
		 System.out.println("La percentuale di posti occupati in seconda classe è: " + frecciarossa.getSecondClassOccupancyRatio() + "%");
		 frecciarossa.deleteAllReservations();
		 frecciarossa.reserveFirstClassSeats(17);
		 frecciarossa.reserveSecondClassSeats(127);
		 System.out.println("La percentuale di posti occupati in prima classe è: " + frecciarossa.getFirstClassOccupancyRatio() + "%");
		 System.out.println("La percentuale di posti occupati in seconda classe è: " + frecciarossa.getSecondClassOccupancyRatio() + "%");
    }
}
