# Mediator

This example tries to simulate a typical fund extraction in an automated teller machine (ATM). This example uses the
State pattern to behave the behavior of the ATM machine according to whether it's full or not.

As you can see (even more so if you check out the Strategy design pattern), this looks extremely related to that
pattern, but it a key difference: the context in which the patterns are used.

State is used for problems that go from a certain state to another, and that is why the states even go as far as to
manage the current state of the ATM machine. This is called the intrinsic method. On the other hand, strategy
changes the, redundantly said, strategy for a certain thing to happen.

State offers structure and makes its intent clear, as well as removing several if and switch statements that other
solutions might propose. The transitions are explicit. What can be seen as a disadvantage is the amount of classes
that have to be created in order to properly represent the situation.
