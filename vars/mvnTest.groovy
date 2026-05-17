def call(){
	stage('Maven Compile') {
                sh "mvn clean compile"
        }

        stage('Maven Test') {
                sh "mvn test"
        }
}
