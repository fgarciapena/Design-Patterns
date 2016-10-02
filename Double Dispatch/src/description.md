# Double Dispatch

Double Dispatch is a design pattern. A design pattern is a generic solution to a recurrent problem.
It is usually a good practice that promotes class encapsulation. They're effective and reusable.

Double dispatch uses the fact that a knowledge knows its own type during runtime, which allows us to create a function
that passes "this", as in the object. Allowing the class that has its method called to know what type of object it's
dealing with.