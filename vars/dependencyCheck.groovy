def call() {

    dependencyCheck additionalArguments: '''
        --scan .         --format HTML
    ''',
    odcInstallation: 'OWASP-Dependency-Check'

    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
