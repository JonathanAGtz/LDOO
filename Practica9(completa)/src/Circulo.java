public class Circulo {
    public double P = 3.141592;
    public double radio;
    
    public Circulo(){
	}

	public Circulo(double P, double radio){
		establecerP(P);
		establecerRadio(radio);
	}

    private void establecerP(double P) {
        this.P = P;
    }
    
    public double obtenerP(){
		return P;
	}

    private void establecerRadio(double radio) {
        this.radio = radio;
    }
    
    public double obtenerRadio(){
		return radio;
	}
    
    @Override
	public String toString(){
		return super.toString() + "Circulo: " + obtenerP() + "\nRadio: " + obtenerRadio();
	}
}