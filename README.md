# design-patterns-java
Use different patterns with Java: Creational Patterns, Structural Patterns, Behavioral Patterns

A continuación se exponen los diferentes patrones y algunas anotaciones.

# Notas sobre patrones

## Creacional

### Factory Method

Nos permite la creación de un objeto que a priori no sabemos como va a ser.

* Product
* ConcreteProduct
* Creator: con el método de fabricación, devolviendo un obj Product
* ConcreteCreator: sobreescribe la factoria para devolver un obj Product

Nos permite delegar la creación de objetos.
Al añadir nuevas implementaciones del objete Product, no hay que modificar la creación.
Nos facilita la creación al concentrarse en un método.

La desventaja es que tenemos que crear bastantes clases.

### Abstract Factory

Es una fábrica de fábricas de Factory Method, es decir, una supefábrica.
Primero decidimos que fábrica hará el objeto, y luego dicha fábrica hará el objeto.
Está orientado a la combinación de productos.
Hay que forzar la dependencia mutua entre objetos.

* Interfaz AbstracFactory: Para la creación de producto
* Múltiples Factory Method : implementan la interfaz de AbstracFactory
* Interfaz AbstractProduct: para un concreto tipo de Product
* Product

Aislamos al cliente la lógica.
Promueva la consistencia.

Es buena para promover la independencia y aislamiento.

Para crear nuevos productos, hay que modificar las fábricas abstractas como las concretas.

### Builder

Nos permite crear un objeto complejo a partir de un objeto fuente, y tendremos un único punto del objeto fuente.

* Director: Se encarga el objecto usando el constructor Builder
* Builder: Interfaz abstracta de objetos.
* ConcreteBuilder: implementa Builder para construir un objeto concreto

Reduce el acoplamiento. Menos dependendencia.
Permite crear estructura compleja.
El código de construcción es diferente de la representación
Tenemos un mayor control en la construcción.

### Prototype

Permite un objeto cree una copia de si mismo, sin tener que conocer como está formado.
Al clonarlo, es un método más rápido que crearlos.

* Interfaz Prototype
* Implementaciones de Prtotype

Y si se puede plantear cuando clonarlos es menos costos que crearlo, debido a la complejidad del objeto.
También evitamos usar parámetros repetidos.

NOTA: No usar clonable, usar las siguientes alternativas:
	- Copiar en un constructor.
	- Método de factoria.
	- Método custom copy(), donde generamos un nuevo objeto y le asignamos los propiedades del objeto.
	
### Singleton

Compartimos un objeto en todas partes, teniendo una única instancia de dicho objeto.

Es dificil de testear el código, y tiene la misma referencia, y no se le puede cambiar la información interna del objeto.

## Comportamiento

### Chain of Responsability

Nos evita acoplar de el emisor a su receptor, permitiendo poder acoplar a más de un receptor, siendo que pueda responder cualquiera, de manera jerarquizada.
Es de manera jerarquizada, ya que si no puede responser el primer receptor, se lo pasa al siguiente.

* Intefaz Handler: Tendrá métodos para asignar el siguiente en la cadena, y para definir el requerimiento para hacer nuestra lógica o aplicar al siguiente de la cadena.

Nos reduce el grado de acoplamiento.
Podemos modificar los responsables de la cadena o la lógica, sin afectar al resto del negocio.

No nos asegura que reciba la solicitud alguien, si no se define bien el algoritmo.
Es dificil de debuggear.

### Command

Abstraer la lógica de negocia en acciones discretas que llamamos comandos.
Encapsulamos toda la lógica en la acción.

* Interfaz Command : ejecuta una operación
* Clase ConcreteCommand: Enlaza el objeto Receiver y una acción
* Receiver : 
* Client : Que define un ConcreteCommand y establece su receptor.
* Invoker : realiza una petición

El ejemplo será 2 operaciones
a) la activación de tarjeta
1. Enviar el pin al cliente
2. El cliente debe activar la tarjeta con dicho pin
3. Se envia notificación a cliente

b) Baja
1. Desactivarla
2. Notificación a cliente que está desactivada.

La ventaja que podemos añadir nuevos comandos, sin modificar la lógica inicial y solo modificar el comando que corresponda.
Nos reduce el acoplamiento.

La desventaja es que aumenta el número de clases

### Iterator

Nos ofrece un mecanismo, para accder de manera secuencial en una colección de datos.
Cada colección de datos, debe suministrar su propio iterador, sin exponer su estructura interna de la colección o de la estructura en si.
Nos permitirá recorrer la colección de pricipio a fin, o en dirección inversa.

* Aggregate : Interfaz para definir un Iterator
* Iterator : Nos permite recorrer los elementos de un Aggregate
* concreteAggregate : impl Aggregate, deolviendo una instacia del Iterator apropiado
* ConcreteIterator : impl Iterator, y guarda la posición en cada momento

Podmeos acceder a una colección de objetos sin saber nada de su lógica.
Podmeos ir en cualquier orden.

En Java ya está hecho.

### Mediator

Mete una capa intermedia, para que la interacción entre objetos sea mediante ella.
Usado para cuando tenemos muchos objetos interactuando entre ellos.

Elementos destacables:
- Interfaz mediator: establece la comunicación entre objetos
- Concrete mediator: implementa mediator, y establece como los objetos se comunican entre ellos. Además los conoce y los mantiene
- Interfaz de comunicación con Mediator: Establece como se han de comunicar los objetos con Mediator, de una manera estándar.

Cada objeto conoce su mediator y lo usa para comunicarse con otros objetos.

Con este patrón rebajamos la complejidad de una comunicación entre objetos entre si, comunicación de muchos a muchos, a una comunicación de uno a muchos.
Los objetos no conocen la complejidad del resto de objetos, y delegan en el mediator para que realice esa lógica.
Es un sistema centralizado.

La desventaja es que la clase mediator puede llegar a complicarse mucho y crecer mucho. Para ello, habrá que ir separando el código en otras clases.

### Memento

Se utiliza para restaurar a un objeto a un estado anterior.
Tenemos una clase Memento, que viene a ser un punto de restauración ante el ciclo de vida de un objeto. Y nos permite restaurar el estado de un objeto a un estado anterior.

Elementos destacables:
- Caretaker: Encargado de mantener a salvo el objeto Memento
- Memento: encargado de guardar el estado de un objeto Originator
- Originator: crea un objeto Memento y contiene una instantanea de su estado interno, que podemos recuperar.


Podemos descartar estados no deseados.
Desventaja: Un alto número de Memento puede requerir mucha memoria y mucho mantenimiento por manejar las clases memento.

### Observer

Nos permite reaccionar a los cambios de estado en el objeto observado.
Es decir, nos permite monitorizar el estado de un objeto en nuestro programa.

Se usa cuando tenemos que detectar eventos en tiempos de ejecución y buscamos notificar a otros objetos que se ha modificado su estado.
Cuando hay una dependencia de relación de uno a muchos, que requiere que un objeto notifique a múltiples objetos que ha cambiado. Esta es la mejor opción.

Elementos destacables:
- Subject: Es una interfaz que define las operaciones de registrar los Observer y desregistrarlo. Además de notificar a todos los Observers.que el observable ha cambiado.
- Concrete Subject: La implementación de la interfaz Subject
- Observer: Interfaz que define las operaciones que se utilizan para notificar el subject. Contendría un método update, para notificar a las implementaciones (Concrete Observer) la modificaciones del Observable

Ventajas:
* Nos permite comunciar dos capas de abstracción.
* Notification broadcast: Un objeto subject envía su noticación a todos los observer que están observando, sin enviarlo a ningún objeto en concreto.

### State

Nos permite modificar el comportamiento de un objeto según el estado interno en el que esté.

Asi evitamos múltiples uso de if/else

Elementos destacable:
- State: Interfaz que define implementaciones, que será suministrada a un objeto para modificar su comportamiento.

Nos permite agregar nuevos estados y comportamientos en nuestra aplicación si que afecte a otros componentes.
Lo malo es que nos lleva a tener muchas clases

### Interpreter

Dado un lenguaje, define una representación para su gramática junto con un interpréte del lenguaje
Se usa para definir un lenguaje, para representar expresiones regulares que representen cadenas a buscar dentro de otras cadejans.

Se usa poco.

Elementos destacables:
- AbstractExpression: define la interfaz con la ejecución de una operación, que se le pasará un contextos.
- Implementaciones de AbstractExpression (TerminalExpression: con símbolo de gramática, y NonterminalExpression: símbolos no terminales de la gramática)
- Context: elemento a interpretar
- Client: encargado de construir la expresión

Es fácil introducir las expresiones en la gramática.

No es eficiente en rendimiento.
Dificil de mantener en gramática compleja.

### Strategy

Nos permite escoger una implementación específica de algoritmo o tarea en tiempo de ejecución de otras implementaciones para la misma tarea.
Encapsula los algoritmos en clases, permitiendo de una manera sencilla que sean reutilizados.
Por eso, es en tiempo de ejcución, cuando la aplicación decide que algoritmo va a utilizar en dicho momento.
Por tanto, en función de la tarea en la que estamos, podemos elegir la implementaación, sin alterar el flujo de trabajo de nuestra aplicaicón.

Elementos destacables:
- Interfaz Strategy: interfaz común a todos los algoritmos.
- context: que tiene una referencia a Strategy

Podemos seleccionar el algoritmo sin modificar a la arquitectura.
Al estar encapsulados por separado, podemos introducir nuevos fácilmente y elegir en tiempo de ejecución.

La clase base de estrategia tiene que contener todas las estrategias, se usen o no.

### Template method

Define los pasos secuenciales para ejecutar un algoritmo de varios pasos.
Define la estructura del algoritmo y las implementaciones definen los pasos.

Elementos destacables:
- Abstract Class: Define la estructura del algoritmo, con un método del algoritmo y otros métodos a implementar por las subclases.

Nos ahorra duplicar código, al quedar la parte común en la parte abstracta.
Es fácil de aprender.

Lo malo, que creas bastantes clases.

### Visitor

Nos permite separar un algoritmo, en la estructura del objeto en el que opera, sin modificar dicha estrucura.

Usamos una clase Visitor, que cambia una clase de ejecución Elemento.

* Visitor: Interfaz que utilizamos para declarar las operaciones para todos los tipos de clase visitables o element.
* ConcreteVisitor: Implementa Visitor y debe de implementar todos los métodos declarados de Visitor. responsable de las diferentes operaciones.
* Elemento: Interfaz que declara la operación de aceptación. Punto de entrada que permite a un objeto ser visitado por Visitor
* ConcreteElement: implementa Element

Nos permite añadir nuevas operaciones a la interfaz Visitante, y no se ven afectadas el resto.
En contra, si tiene muchas operaciones, será complejo su extensión.

## Estructural

### Adapter

Permite que 2 interfaces no relacionadas, puedas trabajar juntas sin ningún tipo de problemas.
Convertimos la interfaz de una clase, en otra que esperan los clientes.

* Adapter
* Interfaz a adaptar
* Interfaz a devolver

El problema es que necesita muchas clases, y de muchas adaptaciones. Puede ser más difil de entender.

### Bridge

Desacoplar una implementación para que los 2 puedan variar independientemente.

* Abstraction:
* Implementor: Interfaz de la clase
* RefinedAbstraction: Extiende Abstraction
* ConcreteImplementor: que implementa Implementor

Los cambios en una implementación no afectan al cliente. Podemos evolucionar Abstraction e Implementor independientemente.
Escondemos los detalles de la implementación a los clientes.

### Composite

Usado para contruir algoritmos u objetos complejos mediante algoritmos u objetocs más simples y parecidos entre si, mediante una construccion recursiva y en forma de árbol.
Tendremos una interfaz común para tratar a los objetos.

* Component: interfaz que define el elemnto común.
* Leaf: No tiene hijos
* Composite: define el comportamiento de los hijos.

el cliente controlara todo a partir de Component

Será sencillo agregar componentes.
Al ser múltiples objetos encadenados, es más dificilde seguir.

### Decorator

Se usa para agreegar a caracteristicas a una instancia particular de una clase sin llegar a modificar el resto de instancias la misma clase.
Alternativa flexible a la subclasificación para tener más funcionalidad.
Al decorar un objeto, cambiamos su comportamiento pero no su interfaz, de forma dinámica.
Usado cuando queremos cambiar el comportamiento de un objeto pero no el de toda la clase.

* Component: interfaz contenerdor o envoltorio, que tiene las reponsabilidades asociadas en tiempo de ejecución.
* ConcreteComponent: Objeto original al que añadimos nuevas responsabilidades en el programa
* Decorator: Clase abstracta, con referencia a Component e implementa la interfaz del componente.
* concreteDecorator: Contiene una funcionalidad concreta.

Nos da más sencillez en vez de usar herencia, y crear comportamientos distintos.
Con herencia, tendría ser más complicado.

Lo malo es que tiene muchos objetos anidados.

### Facade

Busca simplicar con un interfaz el acceso a múltiples sistema, creando una interfaz de alto nivel.
Sistema fácil de usar para el cliente.

* Clase Facade: contendrá lógica de otros módulos, y expondrá 

Lo mejor es que facilita la complejidad del código al cliente.

Lo dificil es que se puede complicar el tratar cuando sea algo complejo.

### Flyweight

Permite el uso compartido de objetos, para tratar un gran número de objetos pequeños.
Un Flyweigth es un objeto que puede ser usado en múltiples contextos simultaneamente, actuando de manera independiente en cada contexto.

Al compartir objetos, ahorramos espacio en memoria.
Los objetos a compartir, sería muy similares entre si.

* Interfaz Flyweight
* Flyweight 1: implementa Interfaz Flyweigth y almacena los estados que se comparten, si los hay.
* Unshared Flyweigth 1:implementa Interfaz Flyweigth y no será compartida.
* Flyweight FActroy: factoria para gestionar los objs flyweight, y proporcionar un obj si no fue creado con anterioridad.

Al final reducimos el número de objetos a crear en el sistema, y nos da un mecanismo centralizado para controlar los estados de objetos virtuales.

La desventaja es que suele ser un patrón complicado y dificil de tracear los errores.

### Proxy

Intermediario para acceder a un objeto, y con ello controlar el objeto y siendo el objeto proxy el cual se usa para acceder.

Tipos:
* proxy remoto
* proxy virtual
* proxy de protección
* smart proxy

Destaca
* Subject: interfaz que expone la funcionalida disponible
* RealSubject: imple. de subject
* Proxy: que oculta el objeto RealSubject y que es que se usa.

Evitamos la duplicación de objetos.

La desventaja, que metemos una capa de abstracción extra, pese a que se puede acceder directamente al objeto real.

# Documentación

* Aprende a utilizar los Patrones de Diseño Software en Java y da a tus aplicaciones un salta de calidad en el código. [Curso Udemy](https://indra.udemy.com/course/patrones-de-diseno-java/learn/lecture/15690268?start=15#overview).