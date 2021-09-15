node {
  stage('build') {
    sh '/opt/gradle/gradle-6.4.1/bin/gradle build'
  }
  stage('TEST') {
   	sh '/opt/gradle/gradle-6.4.1/bin/gradle test'
  }
  stage('clean') {
   	sh '/opt/gradle/gradle-6.4.1/bin/gradle clean'
  }
}
