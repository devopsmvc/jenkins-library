def call() {
    stage('Deploy') {
        echo 'Deploying the application...'
        sh 'scp target/*.jar user@server:/path/to/deploy'
    }
}

