import kotlinx.coroutines.*
suspend fun main(){
    try
    {
        var userOne: GitHubSignIn = GitHubSignIn()

        print("Введите никнейм первого пользователя:")
        userOne.username = readln()

        print("Введите пароль первого пользователя:")
        userOne.psswd = readln()

        print("Введите количество репозиториев первого пользователя:")
        userOne.countRepositories = readln()!!.toUByte()


        var userTwo: GitHubSignIn = GitHubSignIn()

        print("Введите никнейм второго пользователя:")
        userTwo.username = readln()

        print("Введите пароль второго пользователя:")
        userTwo.psswd = readln()

        print("Введите количество репозиториев второго пользователя:")
        userTwo.countRepositories = readln()!!.toUByte()


        var userThree: GitHubSignIn = GitHubSignIn()

        print("Введите никнейм третьего пользователя:")
        userThree.username = readln()

        print("Введите пароль третьего пользователя:")
        userThree.psswd = readln()

        print("Введите количество репозиториев третьего пользователя:")
        userThree.countRepositories = readln()!!.toUByte()

        for(i in 0..5){
            delay(500L)
        }
        if (userOne.countRepositories > userTwo.countRepositories && userOne.countRepositories > userThree.countRepositories)
        {
            println(userOne.UserInfo())
            println()

            if (userTwo.countRepositories > userThree.countRepositories)
            {
                println(userTwo.UserInfo())
                println()

                println(userThree.UserInfo())
            }
            else
            {
                println(userThree.UserInfo())
                println()

                println(userTwo.UserInfo())
            }
        }
        else if (userTwo.countRepositories > userOne.countRepositories && userTwo.countRepositories > userThree.countRepositories)
        {
            println(userTwo.UserInfo())
            println()

            if (userThree.countRepositories > userOne.countRepositories)
            {
                println(userThree.UserInfo())
                println()

                println(userOne.UserInfo())
            }
            else
            {
                println(userOne.UserInfo())
                println()

                println(userThree.UserInfo())
            }
        }
        else if (userThree.countRepositories > userOne.countRepositories && userThree.countRepositories > userTwo.countRepositories)
        {
            println(userThree.UserInfo())
            println()

            if (userOne.countRepositories > userTwo.countRepositories)
            {
                println(userOne.UserInfo())
                println()

                println(userTwo.UserInfo())
            }
            else
            {
                println(userTwo.UserInfo())
                println()

                println(userOne.UserInfo())
            }
        }
    }
    catch(e: Exception){
        println("Ошибка ввода")
    }
}