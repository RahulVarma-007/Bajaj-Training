package javatraining4;

interface Functionalnterface {
	int addition(int a,int b);
	
	default int mul(int a,int b) {
		return a*b;
	}
	
	static int div(int a,int b) {
		return a/b;
	}

}
