[![Scala Steward badge](https://img.shields.io/badge/Scala_Steward-helping-blue.svg?style=flat&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAQCAMAAAARSr4IAAAAVFBMVEUAAACHjojlOy5NWlrKzcYRKjGFjIbp293YycuLa3pYY2LSqql4f3pCUFTgSjNodYRmcXUsPD/NTTbjRS+2jomhgnzNc223cGvZS0HaSD0XLjbaSjElhIr+AAAAAXRSTlMAQObYZgAAAHlJREFUCNdNyosOwyAIhWHAQS1Vt7a77/3fcxxdmv0xwmckutAR1nkm4ggbyEcg/wWmlGLDAA3oL50xi6fk5ffZ3E2E3QfZDCcCN2YtbEWZt+Drc6u6rlqv7Uk0LdKqqr5rk2UCRXOk0vmQKGfc94nOJyQjouF9H/wCc9gECEYfONoAAAAASUVORK5CYII=)](https://scala-steward.org)

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
- June 22nd 2018: Upgrade sbt 1.1.6 and ScalaJS 0.6.23 + others.
- June 14th 2020: Upgrade libs.

## Is the template up to date ?
Whenever I make any changes to this template I run it and push the update to [tbje/full-stack](https://github.com/tbje/full-stack).
On this repository Scala Steward is providing [PRs](https://github.com/tbje/full-stack/pulls) for updated dependencies and plugins so you can check how lazy I've been updating
the template.
