
# Archivos .JAR (Ejecutables)
Los archivos __JAR (Java Archive)__ son archivos de Java con el código compilado de los archivos __.class__ y comprimido con el __formato ZIP__ para que más adelante sean interpretados y ejecutados por la __máquina virtual de Java (JVM)__.

El formato ZIP contiene archivos .class que es el codifo compilado de Java.

Para generar estos archivos podemos entrar a __File > Project Structure > Artifacts__ y seleccionar la opción de __JAR > From modules with dependencies__. Luego de esto podemos compilar nuestro proyecto desde __Build > Build Artifacts > Build__ y podremos nuestros archivos ejecutables en la carpeta __out/artifacts/__.

verificar la versión de Java instalada en su máquina:
```
java -version
```

verificar versión del compilador responsable de compilar el código fuente:
```
javac -version
```

verificar las variables PATH.
```
echo %PATH%
```

Ejecutar el programa compilado.
```
java -jar HolaMundoJava.jar
```
