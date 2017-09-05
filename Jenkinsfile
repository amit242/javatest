pipeline {
    agent any
    stages {
        stage('Setup') {
            steps {
                script {
                    echo 'hello'

                    def upstreamCause = currentBuild.rawBuild.getCause(hudson.model.Cause.UpstreamCause)
                    if (upstreamCause == null) {
                        echo 'error*****'
                        echo "I said, Hello Mr. ***${upstreamCause}***"
                    } else {
                        def upstream = upstreamCause.getUpstreamProject()
                        echo "I said, Hello Mr. ***${upstreamCause}***, ###${upstream}###"
                    }
                    git branch: 'master', credentialsId: 'b440fec8-36bf-4476-a254-e23962e43ca1', url: 'https://github.com/amit242/javatest.git'
                }


            }
        }
    }
}