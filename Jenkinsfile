#!/usr/bin/env groovy
pipeline {
    agent any
    
    parameters {
        
        choice(name: 'ENVIRONMENT',
               choices: ['DEVELOPMENT', 'STAGING', 'PRODUCTION'],
               description: 'Pick the state.')
               
        password(name: 'API_KEY',
                 defaultValue: '123ABC',
                 description: 'Enter proper API KEY to proceed.')
                 
        text(name: 'CHANGELOG',
             defaultValue: 'Lorem ipsum is dummy text.',
             description: 'Something you want to tell in report')         
    }
    
    stages {
        stage('Test') {
            steps {
                echo 'Testing stage...'
            }
        }
        stage('Deploy') {
            when {
                expression {
                    params.ENVIRONMENT == 'PRODUCTION'
                }
            }
            steps {
                input message: 'Are you sure to deploy.'
                echo 'Product deployed.'
            }
        }
        stage('Report') {
            when {
                expression {
                    params.ENVIRONMENT == 'PRODUCTION'
                }
            }
            steps {
                echo params.CHANGELOG
            }
        }
        
    }
}
