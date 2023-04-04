class GitHubSignIn: GitHubUser() {
    override var username:String = "name"
    override var psswd: String = "12345"
    override var countRepositories: UByte
        get() = 0u
        set(value) {}

    override fun UserInfo() {
        println("Пользователь: $username")
        print("Количество репозиториев: $countRepositories")
    }
}