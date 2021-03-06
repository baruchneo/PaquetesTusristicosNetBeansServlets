package co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.hibernate;
// Generated 13/03/2014 01:18:27 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Servicio generated by hbm2java
 */
public class Servicio  implements java.io.Serializable {


     private Integer idServicio;
     private TipoServicio tipoServicio;
     private Persona persona;
     private String nombre;
     private String code;
     private String descripcion;
     private String ubicacion;
     private int disponibilidad;
     private double costo;
     private Boolean oferta;
     private String estado;
     private Boolean publicado;
     private Set<Registro> registros = new HashSet<Registro>(0);
     private Set<PaqueteTuristico> paqueteTuristicos = new HashSet<PaqueteTuristico>(0);
     private Set<CompraServiciosPaquetes> compraServiciosPaqueteses = new HashSet<CompraServiciosPaquetes>(0);

    public Servicio() {
    }

	
    public Servicio(TipoServicio tipoServicio, Persona persona, String nombre, String code, String descripcion, String ubicacion, int disponibilidad, double costo) {
        this.tipoServicio = tipoServicio;
        this.persona = persona;
        this.nombre = nombre;
        this.code = code;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.disponibilidad = disponibilidad;
        this.costo = costo;
    }
    public Servicio(TipoServicio tipoServicio, Persona persona, String nombre, String code, String descripcion, String ubicacion, int disponibilidad, double costo, Boolean oferta, String estado, Boolean publicado, Set<Registro> registros, Set<PaqueteTuristico> paqueteTuristicos, Set<CompraServiciosPaquetes> compraServiciosPaqueteses) {
       this.tipoServicio = tipoServicio;
       this.persona = persona;
       this.nombre = nombre;
       this.code = code;
       this.descripcion = descripcion;
       this.ubicacion = ubicacion;
       this.disponibilidad = disponibilidad;
       this.costo = costo;
       this.oferta = oferta;
       this.estado = estado;
       this.publicado = publicado;
       this.registros = registros;
       this.paqueteTuristicos = paqueteTuristicos;
       this.compraServiciosPaqueteses = compraServiciosPaqueteses;
    }
   
    public Integer getIdServicio() {
        return this.idServicio;
    }
    
    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }
    public TipoServicio getTipoServicio() {
        return this.tipoServicio;
    }
    
    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public int getDisponibilidad() {
        return this.disponibilidad;
    }
    
    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public double getCosto() {
        return this.costo;
    }
    
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public Boolean getOferta() {
        return this.oferta;
    }
    
    public void setOferta(Boolean oferta) {
        this.oferta = oferta;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Boolean getPublicado() {
        return this.publicado;
    }
    
    public void setPublicado(Boolean publicado) {
        this.publicado = publicado;
    }
    public Set<Registro> getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set<Registro> registros) {
        this.registros = registros;
    }
    public Set<PaqueteTuristico> getPaqueteTuristicos() {
        return this.paqueteTuristicos;
    }
    
    public void setPaqueteTuristicos(Set<PaqueteTuristico> paqueteTuristicos) {
        this.paqueteTuristicos = paqueteTuristicos;
    }
    public Set<CompraServiciosPaquetes> getCompraServiciosPaqueteses() {
        return this.compraServiciosPaqueteses;
    }
    
    public void setCompraServiciosPaqueteses(Set<CompraServiciosPaquetes> compraServiciosPaqueteses) {
        this.compraServiciosPaqueteses = compraServiciosPaqueteses;
    }




}


