1.If you were to review the following code, what feedback would you give? 
Please be specific and indicate any errors that would occur as well as other best practices and code refactoring 
that should be done.
 
1.Answer

-Violation of fundamental programming principles:
-Principle of responsibility: You have to have a single java file do everything.
-Closed principle: the methods and coding of the class were not made to extend or be inherited.
-Complexity in the methods having many Boolean variables,
-Overloaded method and complex to understand.
-Little handling of exceptions,
-Difficult to understand when doing maintenance or modification.
-Code or monology unit: if the code is modified in some funconality or validation, it will probably stop working.
-Do not implement principles of design patterns, nor is order implemented in it.
-Does not implement unit tests

----------------------------------------------------------------------------
2.Rewrite the code based on the feedback you provided in question 1. Please include unit tests on your code.

Rafactoring
-Implementation of design patterns and good practices of object-oriented programming. (interface, singleton)
- Mainly the programming practices were used (use interfaces over abstract classes,
limit the scope of local variables,  Divide classes into packages with different names and correct nomenclature,
Classes with descriptive names, variable names and more telling methods.
Independent and decoupled components, handle exceptions
Unit tests using jUnit.
---------------------------------------------------------------------------------------------------
ESPAÑOL

1. Si revisara el siguiente código, ¿qué comentarios le daría?
Sea específico e indique cualquier error que pueda ocurrir, así como otras mejores prácticas y refactorización de código
Eso debería hacerse.
 
1 respuesta

-Violación de los principios fundamentales de programación:
-Principio de responsabilidad: debe tener un solo archivo java para hacer todo.
-Principio cerrado: los métodos y la codificación de la clase no se hicieron para ampliar o heredar.
-Complejidad en los métodos que tienen muchas variables booleanas,
-Método sobrecargado y complejo de entender.
-Poco manejo de excepciones,
-Difícil de entender al hacer mantenimiento o modificación.
-Código o unidad de monología: si el código se modifica con cierta funcionalidad o validación, probablemente dejará de funcionar.
-No implemente principios de patrones de diseño, ni el orden se implementa en él.
-No implementa pruebas unitarias

-------------------------------------------------- --------------------------
2.Vuelva a escribir el código en función de los comentarios que proporcionó en la pregunta 1. Incluya pruebas unitarias en su código.

Rafactoring
-Implementación de patrones de diseño y buenas prácticas de programación orientada a objetos. (interfaz, singleton)
- Principalmente se utilizaron las prácticas de programación (usar interfaces sobre clases abstractas,
-limitar el alcance de las variables locales, dividir las clases en paquetes con diferentes nombres y nomenclatura correcta,
Clases con nombres descriptivos, nombres de variables y más métodos reveladores.
Componentes independientes y desacoplados, manejan excepciones
Pruebas unitarias con jUnit,
