String call(String name = 'human') {
    echo "test, ${name}."
    String res=sh "pwd"
    return res
}