pipeline {
    agent any
    stages {
	 stage ('Clean') {
	        steps {
		       sh '/opt/gradle/gradle-6.4.1/bin/gradle clean'
            }
        }
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
	stage ('Tempertaure conversion') {
		steps {
			temp(98)
		}
	}
    }
}
