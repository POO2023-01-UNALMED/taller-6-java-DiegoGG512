package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	String nombre;
	Pais pais;
	int ventasFabricantes;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		ventasFabricantes += 1;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
    public Pais getPais() {
        return pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getventasFabricantes() {
        return ventasFabricantes;
    }
    
    public static Fabricante fabricaMayorVentas(){
        ArrayList<Fabricante> fabricantes = Vehiculo.getFabricantes(); 
        int mayor=0;
        Fabricante fabricaMayor = null;
        for (int i = 0;i<fabricantes.size();i++){
            Fabricante p_fabricante = fabricantes.get(i);
            if (p_fabricante.getventasFabricantes()>mayor){
                mayor = p_fabricante.getventasFabricantes();
                fabricaMayor = p_fabricante;
            }
        }

        return fabricaMayor;
    }
    
}
