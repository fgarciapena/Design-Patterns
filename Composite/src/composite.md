#Composite

**Composite** is (you guessed it) yet another design pattern which works great for hierarchical structures.
Why so? Because it defines a very clear interface which promotes decoupling and encapsulation. Every object knows what to do,
and the objects that can have other objects inside them are the ones that are "composed" of several more objects. A component can be inside another component.
Of course you'll want to traverse this as a tree, because the hierarchy that this resembles is a tree.

In this case I'm using an abstract class, and ideally you'd want to use interfaces for even more flexibility, but the same concept still applies.
The fact that everything comes from the same place means that the structure can be changed at any time, new things added at runtime and that you
can just call the method on the individual component.

So, all in all, this is composite:

- Composite defines a class structure that supports extensibility. This structure is composed of a component, one or more leaves, and a Composite class (in this case Folder is the Composite).
- Component defines methods for every class in the structure.
- Composite is the class that is composed by its components (such as a folder in a file system). 
- This pattern brings flexibility of structure and extensibility to the table, at sometimes.
- The bad thing is that since this structure is so flexible, it might sometimes be troublesome to test or debug.