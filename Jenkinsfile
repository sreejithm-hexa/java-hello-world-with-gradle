pipeline {
    agent any
    
    stages {
	stage ('Build') {
	        steps {
		       sh '/opt/gradle/gradle-6.4.1/bin/gradle build'
            }
        }
        stage ('test') {
	        steps {
		       sh '/opt/gradle/gradle-6.4.1/bin/gradle test'
            }
        }
    }
}
