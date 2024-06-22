@Library('my-shared-library') _

pipeline {
    agent any

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
                checkCodeQuality()
            }
        }
        stage('Deploy') {
            steps {
                deployApp()
            }
        }
    }
}

