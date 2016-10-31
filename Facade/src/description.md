# Facade

**Facade** is a design pattern that compiles a subsystems' classes' functionality into one class which the user classes can use.
A good analogy to refer to is a setup Wizard, which allows you to set the settings and retrieve things you want through
one single interface, but even then it does not prevent every single functionality to be accessed through the specific
class it contains it.

Facade usually uses a Singleton to keep it to just one single facade. It can also be an interface or an abstract class,
which comes with even more decoupling!

Its benefits are:

- It provides a simple interface to a complex system withou reducing the options provided by the total system.
- Facade translates the requests of user classes to the subsystems that can fulfill those requests. Because the user only interacts with the Facade, 
the internal working of the system can change, while the users to the Facade can remain unchanged.
- Facade promotes low coupling between a user and its subsystems. It also reduces coupling between the subsystems themselves.
Every subsytem can have its own Facade and the other subsystems can be users to eachother.