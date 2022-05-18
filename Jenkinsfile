pipeline {

    agent any
    stages {

        stage('Checkout Codebase'){
            steps{
                cleanWs()
                checkout scm: [$class: 'GitSCM', branches: [[name: '*/master']],userRemoteConfigs:
                [[credentialsId: 'GitHubDevOps4298', url: 'git@github.com:devops4298/MavenTest.git']]]
            }
        }

        stage('Test'){
            steps{
                sh 'mvn clean test'
            }
        }

        stage('Deploy'){
            steps{
                echo 'Happy Testing'
            }
        }
    }

}