def call(String name = 'human') {
    echo "test, ${name}."
    String res=sh "pwd"
    return res
}
def test(String name = 'human') {
    echo "ZAWARUDO!!!"
    return "KO NO DIO DA!!"
}