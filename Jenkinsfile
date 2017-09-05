pipeline {
    agent any
    stages {
        stage('Setup') {
            steps {
                sh 'echo setup done'
                sh 'ls'
            }
        }
    }
    post {
        success {
            build job: 'TestPipeline', propagate: false, wait: false
        }
        always {
            deleteDir()
        }
    }
}