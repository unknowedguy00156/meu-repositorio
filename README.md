# Validador de CPF – Maven e Gradle

Biblioteca simples que valida CPF. A mesma lógica (`src/`) está nos dois projetos; só muda o build.

## Maven
```
cd maven-project
.\mvnw.cmd test
.\mvnw.cmd package
java -jar target\validador-cpf-1.0.0.jar 529.982.247-25
jar tf target\validador-cpf-1.0.0.jar | findstr gson
```
O **Maven Shade Plugin** (fase `package`) copia as classes do Gson para dentro do JAR e
define a `Main-Class` no manifesto. Por isso `java -jar` encontra o Gson.

## Gradle
```
cd gradle-project
.\gradlew.bat build publishToMavenLocal
dir $env:USERPROFILE\.m2\repository\br\meuprojeto
```
