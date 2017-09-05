pipeline {
    agent any
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
    }
    stages {
        stage('Setup') {
            steps {
                sh 'echo setup done'
                sh 'ls'
                echo "Hello ${params.PERSON}"
            }
        }
    }
    post {
        success {
            script {
                build job: 'TestPipeline', propagate: false, wait: false
            }
        }
        always {
            deleteDir()
        }
    }
}