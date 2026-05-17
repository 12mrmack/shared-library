def call() {

    sh '''
        gitleaks detect         --source .         --report-format html         --report-path gitleaks-report.html
    '''
}
