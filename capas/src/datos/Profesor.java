package datos;

public class Profesor {
private String Nombre;

private long Numero;
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}

public long getNumero() {
	return Numero;
}
public void setNumero(long numero) {
	Numero = numero;
}
public Profesor() {
	super();
	
}
@Override
public String toString() {
	return "Profesor [Nombre=" + Nombre + ", Numero=" + Numero + "]";
}
public Profesor(String nombre, long numero) {
	super();
	Nombre = nombre;
	
	Numero = numero;
}
}
