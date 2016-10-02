# Prototype

Prototype is a design pattern that is used to create objects that are a copy of existing objects while preserving
encapsulation. It also saves time if you're, for example, copying from an entity that you retrieved from a database
since you're saving up on queries.

The disadvantage of this pattern is that clone() has to be in every single class you plan to use it on. The more
complex the hierarchy, the more complex it is to maintan.