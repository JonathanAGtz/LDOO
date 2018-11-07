public class FiguraFactory {

    public static void main(String[] args) {
      FiguraFactory shapeFactory = new FiguraFactory();

      //get an object of Circle and call its draw method.
      Figura figura2 = shapeFactory.getFigura("Circulo");

      //call draw method of Circle
      figura2.draw();

      //get an object of Rectangle and call its draw method.
      Figura figura1 = shapeFactory.getFigura("Triangulo");

      //call draw method of Rectangle
      figura1.draw();

        //get an object of Square and call its draw method.
        Figura Figura0 = shapeFactory.getFigura("Cuadrado");

      //call draw method of square
      Figura0.draw();
   }

    private Figura getFigura(String circle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
