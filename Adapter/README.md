#Adapter

Adapter is a not-so-good design pattern which comes as a consequence of the fact that programmers can't know everything
that's going to happen in the foreseeable future. It adapts an interface in order to work with another interface,
in the way that an english-spanish dictionary "adapts", or rather translates english to spanish and vice-versa.

Because it's a measure to adapt an interface to use things from another interface, it brings with itself and adapter
class that allows the adaptee to work. This adapter class is contained in the other interface, which brings a lot of
class coupling and de-encapsulation.

It allows allows us to reuse code with things that weren't expected to have to begin with at the cost of coupling 
and de-encapsulation. Otherwise, we'd have to rewrite everything to work with the new asset.