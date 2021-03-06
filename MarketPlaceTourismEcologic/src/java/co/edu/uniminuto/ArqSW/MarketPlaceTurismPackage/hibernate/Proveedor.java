package co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.hibernate;
// Generated 13/03/2014 01:18:27 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private int idProveedor;
     private Persona persona;
     private String razonSocial;
     private String codigo;
     private String direccion;
     private String telefono;
     private String paginaWeb;
     private String email;
     private boolean confirmarProveedor;
     private Set<CompraServiciosPaquetes> compraServiciosPaqueteses = new HashSet<CompraServiciosPaquetes>(0);

    public Proveedor() {
    }

	
    public Proveedor(int idProveedor, Persona persona, String razonSocial, String codigo, String direccion, String telefono, String paginaWeb, String email, boolean confirmarProveedor) {
        this.idProveedor = idProveedor;
        this.persona = persona;
        this.razonSocial = razonSocial;
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
        this.email = email;
        this.confirmarProveedor = confirmarProveedor;
    }
    public Proveedor(int idProveedor, Persona persona, String razonSocial, String codigo, String direccion, String telefono, String paginaWeb, String email, boolean confirmarProveedor, Set<CompraServiciosPaquetes> compraServiciosPaqueteses) {
       this.idProveedor = idProveedor;
       this.persona = persona;
       this.razonSocial = razonSocial;
       this.codigo = codigo;
       this.direccion = direccion;
       this.telefono = telefono;
       this.paginaWeb = paginaWeb;
       this.email = email;
       this.confirmarProveedor = confirmarProveedor;
       this.compraServiciosPaqueteses = compraServiciosPaqueteses;
    }
   
    public int getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getPaginaWeb() {
        return this.paginaWeb;
    }
    
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isConfirmarProveedor() {
        return this.confirmarProveedor;
    }
    
    public void setConfirmarProveedor(boolean confirmarProveedor) {
        this.confirmarProveedor = confirmarProveedor;
    }
    public Set<CompraServiciosPaquetes> getCompraServiciosPaqueteses() {
        return this.compraServiciosPaqueteses;
    }
    
    public void setCompraServiciosPaqueteses(Set<CompraServiciosPaquetes> compraServiciosPaqueteses) {
        this.compraServiciosPaqueteses = compraServiciosPaqueteses;
    }




}


