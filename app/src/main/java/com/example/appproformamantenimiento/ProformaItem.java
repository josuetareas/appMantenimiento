package com.example.appproformamantenimiento;

public class ProformaItem {
    private String codigo;
    private String producto;
    private double precio;
    private int cantidad;

    // Constructor
    public ProformaItem(String codigo, String producto, double precio, int cantidad) {
        setCodigo(codigo);
        setProducto(producto);
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Código: máximo 6 caracteres
    public void setCodigo(String codigo) {
        if (codigo != null && codigo.length() > 6) {
            throw new IllegalArgumentException(
                    "Error: el código no puede tener más de 6 caracteres."
            );
        }

        this.codigo = codigo;
    }

    // Producto: máximo 40 caracteres
    public void setProducto(String producto) {
        if (producto != null && producto.length() > 40) {
            throw new IllegalArgumentException(
                    "Error: el producto no puede tener más de 40 caracteres."
            );
        }

        this.producto = producto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                " | " + producto +
                " | S/. " + precio +
                " | Cant: " + cantidad +
                " | Total: S/. " + getTotal();
    }
}