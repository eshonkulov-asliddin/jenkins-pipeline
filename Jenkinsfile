#!/usr/bin/env groovy
pipeline {
    agent any

    stages {
        stage('Scan') {
            steps {
                withSonarQubeEnv(installationName: 'sonar1'){
                    bat './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:sonar'
                }
        }
    }
}
