public class ArbolInventario {

    Producto raiz;

    public ArbolInventario() {
        raiz = null;
    }

   
    public void insertar(int id, String nombre) {
        Producto nuevoProducto = new Producto(id, nombre);

        if (raiz == null) {
            raiz = nuevoProducto;
        } else {
            insertarRecursivo(raiz, nuevoProducto);
        }
    }

  
    private void insertarRecursivo(Producto actual, Producto nuevoProducto) {

        if (nuevoProducto.id < actual.id) {

            if (actual.izquierdo == null) {
                actual.izquierdo = nuevoProducto;
            } else {
                insertarRecursivo(actual.izquierdo, nuevoProducto);
            }

        } else if (nuevoProducto.id > actual.id) {

            if (actual.derecho == null) {
                actual.derecho = nuevoProducto;
            } else {
                insertarRecursivo(actual.derecho, nuevoProducto);
            }
        }
    }

    public void inorden() {
        inordenRecursivo(raiz);
    }

    private void inordenRecursivo(Producto actual) {

        if (actual != null) {
            inordenRecursivo(actual.izquierdo);

            System.out.println("ID: " + actual.id + " - Nombre: " + actual.nombre);

            inordenRecursivo(actual.derecho);
        }
    }


    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    private Producto buscarRecursivo(Producto actual, int id) {

        if (actual == null || actual.id == id) {
            return actual;
        }

        if (id < actual.id) {
            return buscarRecursivo(actual.izquierdo, id);
        }

        return buscarRecursivo(actual.derecho, id);
    }
}