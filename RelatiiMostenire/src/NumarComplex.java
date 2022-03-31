class NumarComplex {
	protected double re, im;
	// public double complex;

	public NumarComplex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	// public void setComplex(double re, double im,double re2, double im2) {
	// complex = (re * re2 + ((im * im2) * -1), re * im2 + im * re2);
	// }

	public NumarComplex adunare(NumarComplex a) {
		return new NumarComplex(re * a.re + ((im * a.im) * -1), re * a.im + im * a.re);
	}

	public String toString() {
		return re + " + " + im + " * i";
	}
}