#!/usr/bin/env groovy
pipeline {
    agent any

    stages {
        stage('Scan') {
            steps {
                withSonarQubeEnv(installationName: 'sonar1'){
                    bat 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}
