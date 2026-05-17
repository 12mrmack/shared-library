def call(String status, String message) {

    mail(
        to: env.EMAIL_TO,
        subject: "${status}: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        body: """
${message}

Job Name: ${env.JOB_NAME}
Build Number: ${env.BUILD_NUMBER}
Build URL: ${env.BUILD_URL}
"""
    )
}
