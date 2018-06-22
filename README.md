This is a minimal [Giter8][g8] template for Full Stack Scala with ScalaJS in the front & Akka HTTP in the back. Binding is done using Autowire and BooPickle.

```
sbt new tbje/full-stack.g8
```

It will create the project in a subdir called full-stack.

```
cd full-stack
sbt
reStart
```

Client code in `js`.
Server code in `jvm`.
Shared code in `shared`.

[g8]: http://www.foundweekends.org/giter8/

Changes:
June 22nd 2018: Upgrade sbt 1.1.6 and ScalaJS 0.6.23 + others.
