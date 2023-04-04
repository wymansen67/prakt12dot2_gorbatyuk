abstract class GitHubUser: Sesuriti {
    abstract var username:String

    override var psswd: String
        get() = "12345"
        set(value) {}

    abstract var countRepositories: UByte

    override fun UserInfo(){}
}