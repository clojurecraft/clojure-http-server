# clojure-http-server

Bare-minimum clojure http-server that can be deployed to Heroku.

Prerequisites: Java and [Leiningen](https://leiningen.org/) 

[Live Code Video](https://drive.google.com/file/d/1wpUdl0Njx5tygQvd0t3Mf0V-n4J_R-6G/view?usp=sharing)

## Developing

**REPL**:
`lein repl` then `(start! 8080)`

**RUN (without REPL)**: `lein run 8080`

**UBERJAR**: `lein uberjar` then `java -jar target/app-0.0.1-standalone.jar 8080`


## Deploying

After setting up an app on Heroku, `git push heroku master` should suffice.


