class ComplexNumCalculator {
	int nOpDone;
	ComplexNum lastRes;
	
	void build(){
		this.lastRes = new ComplexNum();
		this.lastRes.build(0.0, 0.0);
		this.nOpDone = 0;
	}
	ComplexNum add(ComplexNum a, ComplexNum b){
	
		this.lastRes.re = a.re + b.re;
		this.lastRes.im = a.im + b.im;
		nOpDone++;
		return this.lastRes;
	}
	ComplexNum sub(ComplexNum a, ComplexNum b){
		this.lastRes.re = a.re - b.re;
		this.lastRes.im = a.im - b.im;
		nOpDone++;
		return this.lastRes;
	}
	ComplexNum mul (ComplexNum a, ComplexNum b){
		this.lastRes.re = (a.re * b.re - a.im * b.im);
		this.lastRes.im = (a.re * b.im + a.im * b.re);
		nOpDone++;
		return this.lastRes;
	}
	ComplexNum div (ComplexNum a, ComplexNum b){
		this.lastRes.re = (a.re * b.re + a.im * b.im) / (b.re * b.re + b.im * b.im);
		this.lastRes.im = (a.im * b.re + a.re * b.im) / (b.re * b.re + b.im * b.im);
		this.nOpDone++;
		return this.lastRes;
	}
}