public class Cuadrado {
    public int x;
    public int y;
	

	public Cuadrado(){
	}

	public Cuadrado(int x, int y){
		establecerX(x);
		establecerY(y);
	}

	public void establecerX(int x){
		this.x = x;
	}

	public int obtenerX(){
		return x;
	}

	public void establecerY(int y){
		this.y = y;
	}

	public int obtenerY(){
		return y; 
	}

	public String obtenerNombre(){
		return "Cuadrado";
	}

    @Override
	public String toString(){
		return super.toString() + "Lado1: " + obtenerX() + "\nLado2: " + obtenerY();
	}
}
