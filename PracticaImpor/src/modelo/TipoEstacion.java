package modelo;

public class TipoEstacion {

	private int id_tipo_estacion;
	private String nombre_estacion;
	
	
	public TipoEstacion() {
		super();
	}
	
	
	
	public TipoEstacion(String nombre_estacion) {
		super();
		this.nombre_estacion = nombre_estacion;
	}



	public TipoEstacion(int id_tipo_estacion, String nombre_estacion) {
		super();
		this.id_tipo_estacion = id_tipo_estacion;
		this.nombre_estacion = nombre_estacion;
	}
	public int getId_tipo_estacion() {
		return id_tipo_estacion;
	}
	public void setId_tipo_estacion(int id_tipo_estacion) {
		this.id_tipo_estacion = id_tipo_estacion;
	}
	public String getNombre_estacion() {
		return nombre_estacion;
	}
	public void setNombre_estacion(String nombre_estacion) {
		this.nombre_estacion = nombre_estacion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TipoEstacion [id_tipo_estacion=");
		builder.append(id_tipo_estacion);
		builder.append(", nombre_estacion=");
		builder.append(nombre_estacion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
