node {
  stage('BUILD') {
    sh "chmod -R 755 gradlew"
    sh "/opt/gradle/gradle-6.4.1/bin/gradle wrapper"
    sh "./gradlew build"
  }
  stage('TEST') {
    sh "./gradlew build test"
  }
  stage('CLEAN') {
    sh "./gradlew build clean"
  }
}
