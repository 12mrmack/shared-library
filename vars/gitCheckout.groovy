def call(String branch,String gitUrl){
	stage('Checkout Code') {
                checkout scmGit(
                    branches: [[name: '${branch}']],
                    extensions: [],
                    userRemoteConfigs: [[
                        url: ${gitUrl}
                    ]]
                )
                echo 'Repository Checkout Successful'
            }
}
