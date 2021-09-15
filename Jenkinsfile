node {
  stage('WRAPPER') {
    sh "/opt/gradle/gradle-6.4.1/bin/gradle wrapper"
  }
  stage('BUILD') {
    sh "./gradlew cleanBuild"
  }
}
