node {
  stage('BUILD') {
    sh "/opt/gradle/gradle-6.4.1/bin/gradle build"
  }
  stage('TEST') {
    sh "/opt/gradle/gradle-6.4.1/bin/gradle test"
  }
  stage('CLEAN') {
    sh "/opt/gradle/gradle-6.4.1/bin/gradle clean"
  }
}
