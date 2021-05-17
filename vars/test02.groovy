def call(String name = 'human') {
    echo "test, ${name}."
    def res = sh script: 'pwd',returnStdout: true
    echo "call ${res}"
    return res
}