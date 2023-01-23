 package ec.chris.puce;

public class Productos {
    private String codigo;
    private String cantidad;
    private String descripcion;
    private String precio;

    public Productos(String codigo, String cantidad, String descripcion, String precio) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public Productos() {
    	
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

  
}