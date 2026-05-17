def call(String status, String message) {

    emailext(
        subject: "${status}: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        body: """
            <h2>${message}</h2>

            <p>
                Job: ${env.JOB_NAME}<br>
                Build Number: ${env.BUILD_NUMBER}<br>
                Build URL: ${env.BUILD_URL}
            </p>
        """,
        to: env.EMAIL_TO,
        mimeType: 'text/html'
    )
}
