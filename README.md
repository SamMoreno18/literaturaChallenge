# literaturaChallenge



Descripción:
Implementa una aplicación Java que funciona como una biblioteca digital, permitiendo a los usuarios buscar libros y autores en una base de datos.

### Configuración

#### Variables de Entorno
Para que la aplicación funcione correctamente, debe configurar las siguientes variables de entorno:

| VARIABLE      | DESCRIPCIÓN                                  |
|---------------|----------------------------------------------|
| `DB_HOST`     | Ruta a la base de datos con su puerto        |
| `DB_NAME`     | Nombre de la base de datos: "liter_alura"    |
| `DB_USR`      | Usuario de la base de datos                  |
| `DB_PASSWORD` | Contraseña de acceso a la base de datos      |

### Aplicación

#### Menú
Literalura consta de 6 opciones con las que puedes interactuar:

1. **Buscar Libro por Título:**
   - La aplicación solicita al usuario el nombre de un libro y lo busca usando la API previamente mencionada. Si encuentra el libro y no está almacenado en la base de datos, lo guarda.
2. **Listar Libros Registrados:**
   - Lista todos los libros almacenados en la base de datos.
3. **Listar Autores Registrados:**
   - Lista todos los autores almacenados en la base de datos.
4. **Listar Autores Vivos en un Determinado Año:**
   - Solicita el ingreso de un año y el sistema busca los autores vivos en ese año.
5. **Listar Libros por Idioma:**
   - Lista los idiomas disponibles, indicando cuál es el código que debe ingresarse para buscar los libros en ese idioma.
6. **Los 10 Libros Más Descargados:**
   - Muestra los 10 libros más descargados que estén almacenados en la base de datos.

0. **Salir:**
   - Finaliza la aplicación.

#### Funcionalidades Detalladas

1. **Buscar Libro por Título:**
   - La aplicación solicita al usuario el nombre de un libro, lo busca utilizando la API especificada. Si el libro se encuentra y no está en la base de datos, se guarda.

2. **Listar Libros Registrados:**
   - Esta opción lista todos los libros almacenados en la base de datos.

3. **Listar Autores Registrados:**
   - Esta opción lista todos los autores almacenados en la base de datos.

4. **Listar Autores Vivos en un Determinado Año:**
   - Solicita al usuario el ingreso de un año y el sistema busca los autores que estaban vivos en ese año.

5. **Listar Libros por Idioma:**
   - Lista los idiomas disponibles, mostrando el código que debe ingresarse para buscar los libros en ese idioma específico.

6. **Los 10 Libros Más Descargados:**
   - Muestra una lista de los 10 libros más descargados que están almacenados en la base de datos.

#### Nota
Este proyecto forma parte del Alura Challenge Literalura Badge.
