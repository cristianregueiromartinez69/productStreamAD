package products;

/**
 * clase Productos con los atributos de los productos getter y setter
 *
 * @author cristian
 * @version 1.0
 */
public class Product {

    /**
     * atributos privados de la clase
     */
    private String codigo;
    private String descripcion;
    private double precio;

    public Product() {

    }

    /**
     * constructor de la clase
     *
     * @param codigo el codigo del producto
     * @param descripcion la descripcion del producto
     * @param precio el precio del producto
     */
    public Product(String codigo, String descripcion, double precio) {
        super();
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     * getter y setter de los atributos
     *
     * @return el atributo correspondiente
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * metodo to string con los atributos de clase
     */
    @Override
    public String toString() {
        return "Producto: " + "\n" + "Codigo: " + codigo + "\nDescripcion: " + descripcion + "\nprecio: " + precio;
    }

}
