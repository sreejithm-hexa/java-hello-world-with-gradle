node {
  stage('WRAPPER') {
    sh "/opt/gradle/gradle-6.4.1/bin/gradle wrapper"
  }
  stage('BUILD') {
    sh "./opt/gradle/gradle-6.4.1/bin/gradlew build"
  }
  stage('TEST') {
    sh "./opt/gradle/gradle-6.4.1/bin/gradlew test"
  }
}
