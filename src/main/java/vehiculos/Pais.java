package vehiculos;
import java.util.ArrayList;

public class Pais {
	String nombre;
	int ventasPais;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		ventasPais += 1;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getVentasPais() {
		return ventasPais;
	}
	
	public static Pais paisMasVendedor(){
        ArrayList<Fabricante> fabricantes = Vehiculo.getFabricantes(); 
        int mayor=0;
        Pais paisMayor = null;
        for (int i = 0;i<fabricantes.size();i++){
            Fabricante p_fabricante = fabricantes.get(i);
            if (p_fabricante.getPais().getVentasPais()>mayor){
                mayor = p_fabricante.getPais().getVentasPais();
                paisMayor = p_fabricante.getPais();
            }
        }

        return paisMayor;
    }
}
