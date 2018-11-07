public class naranj {
    
    String naranja;
    //$15 por kilo 
    int precio = 15;
    
    public naranj (){
        
    }
    public naranj (String naranja,int precio){
        establecerPrecio(precio);
        
    }
    
    public String obtenerNaranja(){
        return "naranja";
    }
    
    public void establecerPrecio(int precio){
            this.precio = precio;
    }
    public int obtenerPrecio(){
        return precio;
    }
}