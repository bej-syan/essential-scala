## How to use:

    > sbt
    > run
    Multiple main classes detected, select one to run:

      [1] com.syan.essentialscala.HelloWorld
      ...
         
    Enter number: 1

      [info] Running com.syan.essentialscala.HelloWorld 
      Hello world!
      [success] Total time: 69 s, completed Jul 1, 2017 1:33:11 PM
      

## Some Related Concepts

#### `Monads`
- [Scala Monads: Declutter Your Code With Monadic Design](https://www.youtube.com/watch?v=Mw_Jnn_Y5iA)

>  * Broadly speaking, a monad is a generic type that allows us to sequence computations while abstracting away some technicality.

>  * We do the sequencing using `for` comprehensions, worrying only about the programming logic 
we care about. The code hidden in the monad's `map` and `flatMap` methods does all of the
plumbing for us.

>  * `Option` is a monad that allows us to sequence computations on optional values without
worrying about the fact that they may or may not be present.

>  * `Seq` is a monad that allows us to sequence computations that return multiple possible answers
without worrying about the fact that there are lots of possible combinations involved.

>  * `Future` is a monad that allows us to sequence computations without worrying about the fact
that they are asynchronous.
