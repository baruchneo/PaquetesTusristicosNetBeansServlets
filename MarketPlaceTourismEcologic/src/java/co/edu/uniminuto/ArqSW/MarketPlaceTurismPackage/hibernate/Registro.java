package co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.hibernate;
// Generated 13/03/2014 01:18:27 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Registro generated by hbm2java
 */
public class Registro  implements java.io.Serializable {


     private int idRegistroLog;
     private Servicio servicio;
     private TipoRegistro tipoRegistro;
     private PaqueteTuristico paqueteTuristico;
     private CompraServiciosPaquetes compraServiciosPaquetes;
     private Mensajes mensajes;
     private String titulo;
     private String descripcion;
     private Date fechaRegistro;
     private int idPersona;

    public Registro() {
    }

	
    public Registro(int idRegistroLog, TipoRegistro tipoRegistro, String titulo, String descripcion, Date fechaRegistro, int idPersona) {
        this.idRegistroLog = idRegistroLog;
        this.tipoRegistro = tipoRegistro;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.idPersona = idPersona;
    }
    public Registro(int idRegistroLog, Servicio servicio, TipoRegistro tipoRegistro, PaqueteTuristico paqueteTuristico, CompraServiciosPaquetes compraServiciosPaquetes, Mensajes mensajes, String titulo, String descripcion, Date fechaRegistro, int idPersona) {
       this.idRegistroLog = idRegistroLog;
       this.servicio = servicio;
       this.tipoRegistro = tipoRegistro;
       this.paqueteTuristico = paqueteTuristico;
       this.compraServiciosPaquetes = compraServiciosPaquetes;
       this.mensajes = mensajes;
       this.titulo = titulo;
       this.descripcion = descripcion;
       this.fechaRegistro = fechaRegistro;
       this.idPersona = idPersona;
    }
   
    public int getIdRegistroLog() {
        return this.idRegistroLog;
    }
    
    public void setIdRegistroLog(int idRegistroLog) {
        this.idRegistroLog = idRegistroLog;
    }
    public Servicio getServicio() {
        return this.servicio;
    }
    
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    public TipoRegistro getTipoRegistro() {
        return this.tipoRegistro;
    }
    
    public void setTipoRegistro(TipoRegistro tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }
    public PaqueteTuristico getPaqueteTuristico() {
        return this.paqueteTuristico;
    }
    
    public void setPaqueteTuristico(PaqueteTuristico paqueteTuristico) {
        this.paqueteTuristico = paqueteTuristico;
    }
    public CompraServiciosPaquetes getCompraServiciosPaquetes() {
        return this.compraServiciosPaquetes;
    }
    
    public void setCompraServiciosPaquetes(CompraServiciosPaquetes compraServiciosPaquetes) {
        this.compraServiciosPaquetes = compraServiciosPaquetes;
    }
    public Mensajes getMensajes() {
        return this.mensajes;
    }
    
    public void setMensajes(Mensajes mensajes) {
        this.mensajes = mensajes;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }




}


