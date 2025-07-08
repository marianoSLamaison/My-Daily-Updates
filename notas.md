# Notas
Aqui guardo notas referenciando datos importantes de java
y maven y spring

//Rest controller aclara que la app es el controler
//en otras palabras es lo que spring tomara en cuenta cuando maneje
//requests
@RestController
//esto es equivalente a usar 
/*
 * SpringBootConfiguration
 * y SpringAutoConfiguration
 * y ComponentScan
 * La segunda lo que hace es que le dara configuraciones a spring
 * basandose en las dependencias disponibles
 * 
 */
@SpringBootApplication
Por estandar java no te permite guardar jars dentro de jars. 
Lo comun es por tanto guardar un solo jar con todo , pero los projectos tipo spring
se salen del standar y permiten guardar jars dentro de jars
