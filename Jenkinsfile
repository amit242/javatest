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
            script {
                build job: 'TestPipeline', propagate: false, wait: false, parameters: [[$class: 'StringParameterValue', name: 'PROJECT_TO_SCAN', value: 'XXXX']]
            }
        }
        always {
            deleteDir()
        }
    }
}