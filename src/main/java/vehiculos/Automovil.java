package vehiculos;

public class Automovil extends Vehiculo {
	int puestos;
	static int CantidadAutomoviles;
	
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		CantidadAutomoviles += 1;
	}
	
	public int getPuestos(){
        return puestos;
    }
	
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
