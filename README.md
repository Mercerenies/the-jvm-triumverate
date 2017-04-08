
# The JVM Triumverate

Once upon a time, I was working on a Scala project when I came upon a task that would be much
easier to do in Clojure than in Scala, so I set off to try and get the two languages to play
nice with each other. Long story short, it ended up being fairly easy with just a few odd
tricks here and there to get things working, so I figured I'd upload a minimal demo here.

This project uses SBT to compile a Scala object, a Clojure namespace, and two Java classes
together into one project. It demonstrates how to pass objects and functions around between
the three languages with ease. I may add some more languages or some more examples to this
later, depending on what feedback I get.
