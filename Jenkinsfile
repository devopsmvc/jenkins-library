@Library('my-shared-library') _

pipeline {
    agent any

    // tools {
    //     maven 'Maven3'
    // }

    environment {
        SONARQUBE_URL = 'http://172.31.64.193:9000'
    }

    stages {
        stage('Build') {
            steps {
                buildApp()
            }
        }
        stage('Test') {
            steps {
                testApp()
            }
        }
        stage('Code Quality') {
            steps {
                script {
                    echo "SonarQube URL: ${env.SONARQUBE_URL}"
                    withSonarQubeEnv('SonarQube') {
                        sh 'mvn sonar:sonar -Dsonar.host.url=$SONARQUBE_URL'
                    }
            }
        }
        stage('Deploy') {
            steps {
                deployApp()
            }
        }
    }
}

