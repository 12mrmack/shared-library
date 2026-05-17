def call() {

    sh 'mvn clean compile'

    sh 'mvn checkstyle:checkstyle'

    recordIssues(
        tools: [checkStyle(pattern: '**/checkstyle-result.xml')]
    )
}
