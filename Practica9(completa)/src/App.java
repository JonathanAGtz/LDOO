public class App {
    public static void main (String []args){
        
        Figura [] c = new Figura[3];

	c [0] = new Cuadrado(16,3,48.0f);
	c [1] = new Triangulo(16,3);
	c [2] = new Circulo(16,3);
             
	for(int p = 0; p < c.length; p++){
		System.out.println(c[p].toString() + "\nArea:" + c[p].obtenerArea());
        }
    }
}