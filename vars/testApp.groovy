def call() {
    stage('Test') {
        echo 'Running unit tests...'
        sh 'mvn test'
    }
}

