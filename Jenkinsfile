node {
    def mvnHome = tool 'maven-3.5.2'
    def dockerImage
    def dockerImageTag = "developsexample${env.BUILD_NUMBER}"

    stage('Clone Repo') {
        git 'https://github.com/Leiina189427/b3-c3-dev-tu-sadi-leina'
    }

    stage('Build Project') {
        sh "'${mvnHome}/bin/mvn' -B -DskipTests clean package"
    }

    stage('Initialize Docker') {
        def dockerHome = tool 'MyDocker'
        env.PATH = "${dockerHome}/bin:${env.PATH}"
    }

    stage('Build Docker Image'){
        sh "docker -H tcp://192.168.8.100:2375 build -t devopsexample: ${env.BUILD_NUMBER} ."
    }

    stage ('Deploy Docker Image'){
        echo "Docker Image Tag Name : ${dockerImageTag}"
        sh "docker -H tcp://192.168.8.100:2375 run --name devopsexample -d -p 2222:2222 devosexample:${env.BUILD_NUMBER}"
    }

}

