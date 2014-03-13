package co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.hibernate;
// Generated 13/03/2014 01:18:27 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * PaqueteTuristico generated by hbm2java
 */
public class PaqueteTuristico  implements java.io.Serializable {


     private Integer idPaqueteTuristico;
     private Persona persona;
     private String nombre;
     private String codigo;
     private String descripcion;
     private String ubicacion;
     private int disponibilidad;
     private double costo;
     private Boolean oferta;
     private String estado;
     private Boolean publicado;
     private Set<Servicio> servicios = new HashSet<Servicio>(0);
     private Set<Registro> registros = new HashSet<Registro>(0);
     private Set<CompraServiciosPaquetes> compraServiciosPaqueteses = new HashSet<CompraServiciosPaquetes>(0);

    public PaqueteTuristico() {
    }

	
    public PaqueteTuristico(Persona persona, String nombre, String codigo, String descripcion, String ubicacion, int disponibilidad, double costo) {
        this.persona = persona;
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.disponibilidad = disponibilidad;
        this.costo = costo;
    }
    public PaqueteTuristico(Persona persona, String nombre, String codigo, String descripcion, String ubicacion, int disponibilidad, double costo, Boolean oferta, String estado, Boolean publicado, Set<Servicio> servicios, Set<Registro> registros, Set<CompraServiciosPaquetes> compraServiciosPaqueteses) {
       this.persona = persona;
       this.nombre = nombre;
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.ubicacion = ubicacion;
       this.disponibilidad = disponibilidad;
       this.costo = costo;
       this.oferta = oferta;
       this.estado = estado;
       this.publicado = publicado;
       this.servicios = servicios;
       this.registros = registros;
       this.compraServiciosPaqueteses = compraServiciosPaqueteses;
    }
   
    public Integer getIdPaqueteTuristico() {
        return this.idPaqueteTuristico;
    }
    
    public void setIdPaqueteTuristico(Integer idPaqueteTuristico) {
        this.idPaqueteTuristico = idPaqueteTuristico;
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
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    public Set<Servicio> getServicios() {
        return this.servicios;
    }
    
    public void setServicios(Set<Servicio> servicios) {
        this.servicios = servicios;
    }
    public Set<Registro> getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set<Registro> registros) {
        this.registros = registros;
    }
    public Set<CompraServiciosPaquetes> getCompraServiciosPaqueteses() {
        return this.compraServiciosPaqueteses;
    }
    
    public void setCompraServiciosPaqueteses(Set<CompraServiciosPaquetes> compraServiciosPaqueteses) {
        this.compraServiciosPaqueteses = compraServiciosPaqueteses;
    }




}


