class Calculator {
	int nOpDone;
	double lastRes;
	
	void build(){
		this.nOpDone = 0;
		this.lastRes = 0.0;
	}
	double add(double a, double b){
		this.nOpDone++;
		return this.lastRes = a+b;
	}
	double sub(double a, double b){
		this.nOpDone++;
		return this.lastRes = a-b;
	}
	double mul (double a, double b){
		this.nOpDone++;
		return this.lastRes = a*b;
	}
	double div (double a, double b){
		this.nOpDone++;
		return this.lastRes = a/b;
	}
}