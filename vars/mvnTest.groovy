def call() {

    sh "mvn clean compile"
    sh "mvn test"
}
