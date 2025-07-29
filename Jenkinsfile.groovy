pipeline {
    agent any 

    stages {
        stage('Checkout') {
            steps {
                // Check out code from scm (e.g., GitHub)
                checkout scm
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                // Compile the Java code
                sh 'javac Helloworld.java'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Run the compiled Java code
                sh 'java Helloworld'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // You can add deployment steps here if needed
                sh 'java Helloworld'
                echo "Deployment successful!"
            }
        }
    }
}