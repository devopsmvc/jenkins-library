def call() {
    stage('Code Quality') {
        echo 'Checking code quality...'
        sh 'mvn sonar:sonar'
    }
}

