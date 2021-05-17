def call(String name = 'human') {
    echo "test, ${name}."
    return sh "pwd"
}