class ComplexNum {
	double re;
	double im;

    void build(double re, double im) {
		this.re = re;
		this.im = im;
    }

    boolean equal(ComplexNum num) {
		return this.re == num.re && this.im == num.im;
    }

    void add(ComplexNum num) {
		this.re += num.re;
		this.im += num.im;
    }

    String toStringRep() {
		String out = new String();
		if(this.re != 0)
			out += this.re;
		if(this.im > 0){
			if(this.im != 1){
				out = out + this.re + "+" + this.im + "i";
			} else return this.re + "+i";
		} else if(this.im < 0){
			if(this.im != -1){
				out = out + this.im + "i";
			} else out = out + "-i";
		}
	
		return out;
	}
}