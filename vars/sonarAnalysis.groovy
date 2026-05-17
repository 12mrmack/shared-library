def call() {

    withSonarQubeEnv('sonarqube') {

        sh '''
            mvn sonar:sonar             -Dsonar.projectKey=secretsanta-generator             -Dsonar.projectName=secretsanta-generator
        '''
    }
}
