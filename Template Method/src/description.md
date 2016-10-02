# Template Method

Template Method is another design pattern. A Template Method is a final method (in this case: transfer) that calls
an abstract method (in this case: calculateCommission). As you can see, transfer(the template method) is implement in
the parent class, while calculateCommission is an abstract method that is implemented in the children.

The advantage of this design pattern is that if a new type of account shows up, you don't have to change the
transfer method. It defines steps that can change within a fixed structure.

This specific problem could have also been solved using a Strategy design pattern, which implements an interface.
If you have a general behavior where few things change, template method is more convenient. However, if they are
two completely different types of transference, Strategy is more convenient.
