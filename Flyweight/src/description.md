#Flyweight

**Flyweight** is a design pattern that is used to save space for classes that use the same values or are very similar.
If several instances of the same class use the same attributes, there's no point to have several values
going around. That's a waste of space. A good idea is to keep a reference to the values somewhere else, effectively
making the spacial complexity constant. That's really cool!

Although this comes as a trade off. The fact that you need to check a reference to see the values implies
that there's some computational complexity into it, and while it's usually not that big of a deal, it's something
to keep in mind.

So, all in all, flyweight is:

- Amazing when several instances have the same values and are, overall, pretty similar.
- Since instances keep a reference of the flyweight which provides the necessary values, spacial complexity is O(1). 
- Due to the reference that is called, these calls and calculations add computational complexity, although it usually isn't that much of a deal.
- It uses a Factory which keeps a map of the existing Flyweights, so it uses both Factory *and* singleton.
 
