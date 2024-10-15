# netty-missing-natives-snapshot

# How to reproduce the issue
* Run the project using `devcontainer` (IntelliJ Idea is used)
* In terminal go to folder `IdeaProjects/netty-missing-natives-snapshot/`
* Execute `./mvnw test`

# Change between `amd64` and `arm64`

* Go to `Dockerfile` and choose the platform
* Go to `devcontainer.json` and choose the correct `JAVA_HOME`