package ch4BasicKotlin

interface User3 {
    val nickname: String
}
//class AccountID(val realID: String) {
//    val nickname: String = realID.substringBefore(':')
//}
interface EmailUser {
    val email: String
    val nickname: String
    get() = email.substringBefore('@')
}
fun getNameFromSocialNetwork(accountID: String) : String? {
      val nickname = accountID.substringAfter(':')
    println("nickname: $nickname")
    if(nickname == "") {
        println("There is no nickname in accountID : $accountID is substituted to nickname")
        return accountID.substringBefore(':')
    }
    else {
        println("nickname in else : $nickname")
        return nickname
    }
}
class User3Impl(override val nickname: String) : User3

class SubcribingUser3Impl(override val email: String) : EmailUser

class SocialUser3Impl(val accountID: String) : User3 {
    override val nickname: String = getNameFromSocialNetwork(accountID).toString()
}

fun main() {
    println(User3Impl("huck.kim@kakao.com").nickname)
    println(SubcribingUser3Impl("huck.kim@kaka.com").nickname)
    println(SocialUser3Impl("huck.kim:").nickname)
}