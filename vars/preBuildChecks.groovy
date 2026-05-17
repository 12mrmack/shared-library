def call() {

    sh '''
        mvn clean compile
        mvn checkstyle:check
    '''
}
