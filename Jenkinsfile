pipeline {
    agent any

    tools {
        maven 'Maven_home'
        jdk 'Java_Home'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }

    post {
        failure {
            echo 'Build failed!'
        }
    }
}
