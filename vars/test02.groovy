def call(String name = 'human') {
    echo "test, ${name}."
    def res="sh "pwd""
    echo "${res}"
    return res
}