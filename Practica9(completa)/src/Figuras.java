public abstract class Figura {
        
        abstract public String obtenerNombre();

	public float obtenerArea(){
		return 0f;
	}

	public float obtenerPerimetro(){
		return 0f;
	}

    @Override
	public String toString(){
		return "\n -Figura: " + "\n" + obtenerNombre() + "\n";
	}

    void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
