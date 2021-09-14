# api-empleadas
API Rest que permite la creación, edición, lectura y eliminación de una base de datos de empleadas de una empresa con sus categorías. Permite, también, la actualización de sueldos y cálculos de éstos a través de Pattern Desgign Strategy: en este caso, se uso como modelo el cálculo de sueldos de un empleado. Si el empleado es Administrativo, el sueldo actual no puede ser menor al sueldo de la categoria cuando haya recalculo. En el caso de un Auxiliar, el sueldo actual siempre es el sueldo de la categoria. En caso de vendedores, se usa el sueldo de la categoria base + 10% de comisiones sobre ventas. Para este caso se puso una interface SueldoCalculator, que se usa en la clase Categoria para calcular el sueldo. Cuando una categoria tenga nombre Administrativo, Auxiliar o Ventas se instancia el algoritmo especifico y en ell momento de calcular, el algoritmo ya esta definido y es dinamico.

Tecnologias utilizadas: Java 11 SpringBoot

Deployment: Heroku

https://ada-empleadas-fdifelice.herokuapp.com/

Documentación en Postman: https://documenter.getpostman.com/view/16169862/U16jP6Sh

Base de Datos: MySQL

![empleadas](https://user-images.githubusercontent.com/75486164/133185631-307218b9-4162-428b-8547-050e1758d5c4.png)

