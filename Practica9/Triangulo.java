public class Triangulo {
    public int x;
    public int y;
    public int z;
	

	public Triangulo(){
	}

	public Triangulo(int x, int y){
		establecerX(x);
		establecerY(y);
                establecerZ(z);
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
        
        public void establecerZ(int z){
		this.z = z;
	}

	public int obtenerZ(){
		return z;
	}

	public String obtenerNombre(){
		return "Triangulo";
	}

    @Override
	public String toString(){
return super.toString() + "Lado1: " + obtenerX() + "\nLado2: " + obtenerY() + "\nLado3:" + obtenerZ();
	}
}