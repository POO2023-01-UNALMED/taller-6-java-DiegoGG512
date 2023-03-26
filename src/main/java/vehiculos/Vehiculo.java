package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	static int CantidadVehiculos;
	static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		CantidadVehiculos += 1;
		
		if (!fabricantes.contains(fabricante)){
            fabricantes.add(fabricante);
        }
	}
	
	public String getPlaca(){
        return placa;
    }
	
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public int getPuertas(){
        return puertas;
    }
	
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio (int precio){
        this.precio = precio;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public String getTraccion(){
        return traccion;
    }
    
    public void setTraccion(String traccion){
        this.traccion = traccion;
    }
    
    public Fabricante getFabricante() {
    	return fabricante;
    }
    
    public static ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }
    
    public String vehiculosPorTipo() {
    	return "Automoviles: "+Automovil.CantidadAutomoviles+"\nCamionetas: "+Camioneta.CantidadCamionetas+
                "\nCamiones: "+Camion.CantidadCamiones;
    }

}
