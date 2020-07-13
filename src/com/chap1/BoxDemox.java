package com.chap1;

class BoxNew {
	double width;
	double height;
	double depth;

	double volume() {
		return width * height * depth;
	}

	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}

class BoxDemox {
	public static void main(String args[]) {
		BoxNew mybox1 = new BoxNew();
		BoxNew mybox2 = new BoxNew();
		double vol;
		mybox1.setDim(10, 20, 15);
		mybox2.setDim(3, 6, 9);
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}
}
