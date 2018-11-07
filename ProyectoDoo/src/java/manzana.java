public class manzana {
    String naranja;
    //$30 por kilo 
    int precio = 30;
    
    public manzana (){
        
    }
    public manzana (String manzana,int precio){
        establecerPrecio(precio);
        
    }
    
    public String obtenerNaranja(){
        return "Manzana";
    }
    
    public void establecerPrecio(int precio){
            this.precio = precio;
    }
    public int obtenerPrecio(){
        return precio;
    }
}
