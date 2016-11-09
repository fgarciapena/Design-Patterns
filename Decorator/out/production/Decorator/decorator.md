#Decorator

Alright, so, this might no be *that* far fetched. I think that Decorator is similar to Composite, because Decorators
are composed of... components. So, what does this do? It allows us to extend the functionality of different components
according to what we want to do with them. It also brings the same disadvantages that Composite has, which is that
it's tricky to debug and test this because it's so dinamic and flexible. Although this is the case, maintaining the code isn't that much of a challenge.

Something that's not part of Composite is that we can split a class' functionality with this pattern.