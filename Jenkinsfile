node {
  stage('BUILD') {
    sh "chmod -R 755 gradlew"
    sh "./gradlew build"
  }
  stage('TEST') {
    sh "./gradlew build test"
  }
  stage('CLEAN') {
    sh "./gradlew build clean"
  }
}
