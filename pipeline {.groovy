pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'JDK11'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t pet-clinic .'
            }
        }
        stage('Docker Run') {
            steps {
                sh 'docker run -d -p 8080:8080 pet-clinic'
            }
        }
    }
}