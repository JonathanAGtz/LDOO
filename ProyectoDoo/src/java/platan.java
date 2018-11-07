public class platan {
    String platano;
    //$20 por kilo 
    int precio = 20;
    
    public platan (){
        
    }
    public platan (String platano,int precio){
        establecerPrecio(precio);
        
    }
    public String obtenerNaranja(){
        return "platano";
    }
    
    public void establecerPrecio(int precio){
            this.precio = precio;
    }
    public int obtenerPrecio(){
        return precio;
    }
}