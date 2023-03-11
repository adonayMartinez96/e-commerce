# e-commerce
Pasos para ejecutarlo:
1. Modificar base de datos en el application properties

2. En el aplicatión properties cambiar
# Hibernate ddl auto (create, create-drop, validate, update,none)
spring.jpa.hibernate.ddl-auto=none
Por
# Hibernate ddl auto (create, create-drop, validate, update,none)
spring.jpa.hibernate.ddl-auto=create
Esto solo la primera vez para que se creen ls tablas con el ORM

3. Regresar esa propiedad a none
# Hibernate ddl auto (create, create-drop, validate, update,none)
spring.jpa.hibernate.ddl-auto=none

4.Ejecutar el script: scriptPruebaTecnica.sql en mySql



