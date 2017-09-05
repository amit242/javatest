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
            trigger('TestPipeline') {
                parameters {
                    currentBuild()
                }
            }
        }
        always {
            deleteDir()
        }
    }
}