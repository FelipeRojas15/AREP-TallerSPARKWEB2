# Introduction to complex systems, JAVA, MVN AND GIT
> En este taller se realizará los cálculos de desviación estándar y la media de una tabla con n números, por medio de una
> LinkedList con propia implementación dentro de un proyecto Maven Java, con sus respectivas pruebas.
> Si quiere saber mas sobre el proyecto, puede leer el [Informe](https://github.com/FelipeRojas15/AREP_TallerMVN1/blob/master/Informe_Taller.pdf).

## Requerimientos 
Se necesita que tenga instalado en su computadora:
```sh
$ Java 1.8
$ Maven 3.6.3
```
con su respectiva configuracion
## Instalación
> **Clonar el repositorio:** 
```sh
$ https://github.com/FelipeRojas15/AREP_TallerMVN1
```
> **Compilar el proyecto:**
```sh
$ mvn package
```
> **Ejecutar el programa:** 
```sh
$ java -cp target/tallerLinkedList-1.0-SNAPSHOT.jar edu.escuelaing.arem.app.App
```
- El programa se ejecutara con el archivo de pruebas data.txt, si se desea ejecutar el otro archivo de pruebas se debe dirigir a:

```sh
$ AREP_TallerMVN1/src/main/java/edu/escuelaing/arem/app/App.java
``` 
![Resultado de la prueba ](https://i.ibb.co/G7Zt4w3/result-Problem.png)
- Cambiar el archivo que se esta leyendo por **dataDos.txt** 

> **Ejecutar las pruebas:** 
```sh
$ mvn test
```
![Resultado de la prueba ](https://i.ibb.co/ZTbXYzY/TestRun.png)
> **Generar Javadoc:**
```sh
$ mvn javadoc:javadoc
$ mvn javadoc:jar
$ mvn javadoc:aggregate
$ mvn javadoc:aggregate-jar
$ mvn javadoc:test-javadoc
$ mvn javadoc:test-jar
$ mvn javadoc:test-aggregate
$ mvn javadoc:test-aggregate-jar
```
## Autor
**Brayan Felipe Rojas Bernal**
## Lincencia
Este proyecto posee la licencia MIT. Para mas detalles [Licencia](https://github.com/FelipeRojas15/AREP_TallerMVN1/blob/master/LICENSE.txt).


