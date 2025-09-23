class Train {
	int nTotSeats;
	int nFirstClassSeats;
	int nSecondClassSeats;
	int nFirstClassReservedSeats;
	int nSecondClassReservedSeats;

	void build(int firstClasSeats, int secondClassSeats){
		this.nFirstClassSeats = firstClasSeats;
		this.nSecondClassSeats = secondClassSeats;
		this.nTotSeats = firstClasSeats + secondClassSeats;
		this.nFirstClassReservedSeats = 0;
		this.nSecondClassReservedSeats = 0;
	}
	
	void reserveFirstClassSeats(int seatsToReserve){
		if(this.nFirstClassReservedSeats + seatsToReserve <= this.nFirstClassSeats){
			this.nFirstClassReservedSeats += seatsToReserve;
		} else { 
			System.out.println("[Prima classe] Si sta cercando di riservare più posti di quanto possibile.");
		}
	}
	void reserveSecondClassSeats(int seatsToReserve){
		if(this.nSecondClassReservedSeats + seatsToReserve <= this.nSecondClassSeats){
			this.nSecondClassReservedSeats += seatsToReserve;
		} else {
			System.out.println("[Seconda classe] Si sta cercando di riservare più posti di quanto possibile.");
		}
	}
	double getTotOccupancyRatio(){
		return ((nFirstClassReservedSeats + nSecondClassReservedSeats) * 100) / nTotSeats;
	}
	double getFirstClassOccupancyRatio(){
		return (nFirstClassReservedSeats * 100) / nFirstClassSeats;
	}
	double getSecondClassOccupancyRatio(){
		return (nSecondClassReservedSeats * 100) / nSecondClassSeats;
	}
	void deleteAllReservations(){
		this.nFirstClassReservedSeats = this.nSecondClassReservedSeats = 0;
	}
}