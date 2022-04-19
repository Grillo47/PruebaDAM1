package modelo;

import java.time.LocalDate;

public class Estacion  implements Comparable<Estacion>{

	private int id_estacion;
	private String nombre_estacion;
	private LocalDate fecha;
	private TipoEstacion tipoEstacion;
	
	
	
	
	public Estacion() {
		super();
	}
	public Estacion(int id_estacion, String nombre_estacion, LocalDate fecha, TipoEstacion tipoEstacion) {
		super();
		this.id_estacion = id_estacion;
		this.nombre_estacion = nombre_estacion;
		this.fecha = fecha;
		this.tipoEstacion = tipoEstacion;
		
		
	}
	public Estacion(String nombre_estacion, LocalDate fecha, TipoEstacion tipoEstacion) {
		super();
		this.nombre_estacion = nombre_estacion;
		this.fecha = fecha;
		this.tipoEstacion = tipoEstacion;
	}
	public int getId_estacion() {
		return id_estacion;
	}
	public void setId_estacion(int id_estacion) {
		this.id_estacion = id_estacion;
	}
	public String getNombre_estacion() {
		return nombre_estacion;
	}
	public void setNombre_estacion(String nombre_estacion) {
		this.nombre_estacion = nombre_estacion;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public TipoEstacion getTipoEstacion() {
		return tipoEstacion;
	}
	public void setTipoEstacion(TipoEstacion tipoEstacion) {
		this.tipoEstacion = tipoEstacion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estacion [id_estacion=");
		builder.append(id_estacion);
		builder.append(", nombre_estacion=");
		builder.append(nombre_estacion);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", tipoEstacion=");
		builder.append(tipoEstacion);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Estacion o) {
		return this.getFecha().compareTo(o.getFecha());
	}
	
	

}
