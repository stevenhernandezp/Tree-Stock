# Tree-Stock

## Sistema de Inventario con Árbol Binario de Búsqueda

### Objetivo

Desarrollar una aplicación de consola en Java que permita gestionar un inventario de productos utilizando un árbol binario de búsqueda. El sistema permite registrar productos mediante un ID y un nombre, mostrar el inventario ordenado por ID y buscar productos de manera eficiente.

El proyecto tiene como propósito comprender el funcionamiento de las estructuras dinámicas, especialmente la relación entre los nodos mediante referencias izquierda y derecha, además de aplicar programación recursiva y control de versiones con GitHub.

## Tecnologías utilizadas

* Java
* JDK de Eclipse Temurin
* Visual Studio Code
* Git y GitHub

## Estructura del proyecto

El proyecto está dividido estrictamente en tres clases:

```text
Tree-Stock/
│
├── Producto.java
├── ArbolInventario.java
├── Main.java
└── README.md
```

### Producto.java

Esta clase representa el nodo del árbol. Contiene los datos del producto y las referencias que permiten conectarlo con otros nodos.

Sus atributos principales son:

* `int id`: identificador del producto.
* `String nombre`: nombre del producto.
* `Producto izquierdo`: referencia al nodo hijo izquierdo.
* `Producto derecho`: referencia al nodo hijo derecho.

La organización del árbol se realiza de acuerdo con el ID del producto. Los valores menores se ubican hacia la izquierda y los valores mayores hacia la derecha.

### ArbolInventario.java

Esta clase contiene la lógica principal del árbol binario de búsqueda.

Incluye:

* Inserción recursiva de productos.
* Recorrido inorden.
* Búsqueda recursiva por ID.
* Referencia a la raíz del árbol.

Durante la inserción, el programa compara el ID del nuevo producto con el ID del nodo actual. Si es menor, continúa por el lado izquierdo; si es mayor, continúa por el lado derecho.

El recorrido inorden visita primero el lado izquierdo, luego el nodo actual y finalmente el lado derecho. Por esta razón, los productos se muestran ordenados de menor a mayor según su ID.

### Main.java

Esta clase contiene la interfaz de consola y permite al usuario interactuar con el sistema mediante un menú utilizando `switch-case`.

El menú contiene las siguientes opciones:

```text
1. Registrar Producto
2. Mostrar Inventario
3. Buscar Producto
0. Salir
```

## Funcionamiento

### 1. Registrar Producto

El usuario ingresa el ID y el nombre del producto.

Antes de realizar la inserción, el sistema verifica si ya existe un producto con el mismo ID. Si el ID ya está registrado, se informa al usuario y no se realiza una nueva inserción.

### 2. Mostrar Inventario

El sistema realiza un recorrido inorden del árbol y muestra los productos organizados de menor a mayor según su ID.

Ejemplo:

```text
ID: 20 - Nombre: Pan
ID: 30 - Nombre: Leche
ID: 40 - Nombre: Huevos
ID: 50 - Nombre: Arroz
ID: 60 - Nombre: Aceite
ID: 70 - Nombre: Cafe
ID: 80 - Nombre: Azucar
```

### 3. Buscar Producto

El usuario ingresa el ID del producto que desea consultar.

Si el producto existe, el sistema muestra su ID y nombre. Si no existe, muestra un mensaje indicando que el producto no fue encontrado.

### 0. Salir

Finaliza la ejecución del programa.

## Ejemplo de estructura del árbol

Al registrar los siguientes productos:

```text
50 - Arroz
30 - Leche
70 - Cafe
20 - Pan
40 - Huevos
60 - Aceite
80 - Azucar
```

La estructura del árbol queda de la siguiente manera:

```text
              50
            /    \
          30      70
         /  \    /  \
       20   40  60   80
```

La regla utilizada es:

```text
ID menor → lado izquierdo
ID mayor → lado derecho
```

De esta manera, cada nodo contiene referencias hacia sus posibles hijos izquierdo y derecho.

## Cómo ejecutar el proyecto

### Requisitos

Tener instalado:

* JDK de Eclipse Temurin.
* Visual Studio Code.
* Extensión de Java para Visual Studio Code.

### Compilación

Abrir la terminal en la carpeta del proyecto y ejecutar:

```bash
javac *.java
```

### Ejecución

Después de compilar, ejecutar:

```bash
java Main
```

El sistema mostrará el menú principal de Tree-Stock.

## Pruebas realizadas

Durante las pruebas se verificaron las siguientes funcionalidades:

* Registro de productos.
* Inserción de productos en el árbol.
* Organización mediante ID.
* Recorrido inorden.
* Búsqueda de productos existentes.
* Búsqueda de productos inexistentes.
* Validación de IDs repetidos.
* Visualización de un inventario vacío.
* Funcionamiento del menú y sus diferentes opciones.

## Capturas de pantalla

### Menú principal

![Menú principal](capturas/menu.png)

### Registro de productos

![Registro de productos](capturas/insercion.png)

### Inventario ordenado

![Inventario ordenado](capturas/inventario.png)

### Búsqueda de producto

![Búsqueda de producto](capturas/busqueda.png)

> Las imágenes anteriores corresponden a capturas realizadas durante la ejecución del proyecto.

## Repositorio

Repositorio público de GitHub:

(https://github.com/stevenhernandezp/Tree-Stock)

## Video de sustentación

Video de sustentación individual:
https://youtu.be/ZL6pqzKs9cY?si=FACIGsECXbmPQIss

En el video se explica la estructura del árbol binario de búsqueda, la función de los punteros izquierdo y derecho, la inserción recursiva, el recorrido inorden y la búsqueda de productos mediante su ID.

## Control de versiones

El desarrollo del proyecto se realizó utilizando Git y GitHub.

Se realizaron avances mediante commits para registrar las diferentes etapas del desarrollo:

1. Creación del nodo y lógica inicial del árbol.
2. Implementación del menú y funcionamiento del sistema.
3. Documentación, comentarios y pruebas finales.


STEVEN JOSE HERNANDEZ PUELLO