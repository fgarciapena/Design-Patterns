# Factory Method

Factory Method is a Class that has absolutely nothing to do with the classes it generates. Its sole purpose is to
return instances according to what the other classes desire. Abstract Factory and Factory both have several
Factory Methods.

The advantages of this pattern are the encapsulation and decoupling it provides, for the instance creation of each
possible object is defined by easily changeable methods. The classes that create instances don't really care about
how they're generated.

On the other hand, the drawbacks of this pattern is that to add a new type of Product, you have to add a new
implementing class.
