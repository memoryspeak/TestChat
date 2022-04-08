package com.example.testchat

import android.content.Intent

object AppSingleton {

    var icon: Int? = null

    /*val setOfMessage: List<Message> = listOf(
        Message(false, "asldkjf;laksjd;lfkja;lsdkjf;lkajsd;lkfja;lksddjf;lkajsd;lkfj;alksdjf;lkajs;dlkfj;laksdjf;lkajsd;lkfj;als"),
        Message(false, "asldkfj;laskdj;lfkjas;dlkjfasd35fa65sd4f651a3sd51f3a5s1d"),
        Message(true, "465a11sd3f16a5sd46f54a6sd54f65a4sd65f46a5sd4f65a4s6d5f46a5s4d6f54as6d54f65as4d6f54"),
        Message(false, "asldkjf;laksjd;lfkja;lsdkjf;lkajsd;lkfja;lksddjf;lkajsd;lkfj;alksdjf;lkajs;dlkfj;laksdjf;lkajsd;lkfj;als"),
        Message(false, "asldkfj;laskdj;lfkjas;dlkjfasd35fa65sd4f651a3sd51f3a5s1d"),
        Message(true, "465a11sd3f16a5sd46f54a6sd54f65a4sd65f46a5sd4f65a4s6d5f46a5s4d6f54as6d54f65as4d6f54"),
        Message(false, "asldkjf;laksjd;lfkja;lsdkjf;lkajsd;lkfja;lksddjf;lkajsd;lkfj;alksdjf;lkajs;dlkfj;laksdjf;lkajsd;lkfj;als"),
        Message(false, "asldkfj;laskdj;lfkjas;dlkjfasd35fa65sd4f651a3sd51f3a5s1d"),
        Message(true, "465a11sd3f16a5sd46f54a6sd54f65a4sd65f46a5sd4f65a4s6d5f46a5s4d6f54as6d54f65as4d6f54"),
        Message(false, "asldkjf;laksjd;lfkja;lsdkjf;lkajsd;lkfja;lksddjf;lkajsd;lkfj;alksdjf;lkajs;dlkfj;laksdjf;lkajsd;lkfj;als"),
        Message(false, "asldkfj;laskdj;lfkjas;dlkjfasd35fa65sd4f651a3sd51f3a5s1d"),
        Message(true, "465a11sd3f16a5sd46f54a6sd54f65a4sd65f46a5sd4f65a4s6d5f46a5s4d6f54as6d54f65as4d6f54"),
        Message(false, "asldkjf;laksjd;lfkja;lsdkjf;lkajsd;lkfja;lksddjf;lkajsd;lkfj;alksdjf;lkajs;dlkfj;laksdjf;lkajsd;lkfj;als"),
        Message(false, "asldkfj;laskdj;lfkjas;dlkjfasd35fa65sd4f651a3sd51f3a5s1d"),
        Message(true, "465a11sd3f16a5sd46f54a6sd54f65a4sd65f46a5sd4f65a4s6d5f46a5s4d6f54as6d54f65as4d6f54"),
        Message(false, "asldkjf;laksjd;lfkja;lsdkjf;lkajsd;lkfja;lksddjf;lkajsd;lkfj;alksdjf;lkajs;dlkfj;laksdjf;lkajsd;lkfj;als"),
        Message(false, "asldkfj;laskdj;lfkjas;dlkjfasd35fa65sd4f651a3sd51f3a5s1d"),
        Message(true, "465a11sd3f16a5sd46f54a6sd54f65a4sd65f46a5sd4f65a4s6d5f46a5s4d6f54as6d54f65as4d6f54"),
        Message(false, "asldkjf;laksjd;lfkja;lsdkjf;lkajsd;lkfja;lksddjf;lkajsd;lkfj;alksdjf;lkajs;dlkfj;laksdjf;lkajsd;lkfj;als"),
        Message(false, "asldkfj;laskdj;lfkjas;dlkjfasd35fa65sd4f651a3sd51f3a5s1d"),
        Message(true, "465a11sd3f16a5sd46f54a6sd54f65a4sd65f46a5sd4f65a4s6d5f46a5s4d6f54as6d54f65as4d6f54"),
        Message(false, "asldkjf;laksjd;lfkja;lsdkjf;lkajsd;lkfja;lksddjf;lkajsd;lkfj;alksdjf;lkajs;dlkfj;laksdjf;lkajsd;lkfj;als"),
        Message(false, "asldkfj;laskdj;lfkjas;dlkjfasd35fa65sd4f651a3sd51f3a5s1d"),
        Message(true, "465a11sd3f16a5sd46f54a6sd54f65a4sd65f46a5sd4f65a4s6d5f46a5s4d6f54as6d54f65as4d6f54"),
    )*/

    val users: List<User> = listOf(
        User(R.drawable.a, "Ivan Bodhitharma", "Buddha and around this"),
        User(R.drawable.c, "Major Tom", "Astronomy and Astrology"),
        User(R.drawable.b, "Cleopatra Tsezarovna", "Egyptian Queen"),
        User(R.drawable.d, "Lady Chatterley", "123456789"),
        User(R.drawable.e, "Ubuntu Microsoft", "Linux system is very good"),
        User(R.drawable.f, "Lion Fat", "Anna Karenina and Natasha Rostova"),
        User(R.drawable.a, "Ivan Bodhitharma", "Buddha and around this"),
        User(R.drawable.c, "Major Tom", "Astronomy and Astrology"),
        User(R.drawable.b, "Cleopatra Tsezarovna", "Egyptian Queen"),
        User(R.drawable.d, "Lady Chatterley", "123456789"),
        User(R.drawable.e, "Ubuntu Microsoft", "Linux system is very good"),
        User(R.drawable.f, "Lion Fat", "Anna Karenina and Natasha Rostova"),
        User(R.drawable.a, "Ivan Bodhitharma", "Buddha and around this"),
        User(R.drawable.c, "Major Tom", "Astronomy and Astrology"),
        User(R.drawable.b, "Cleopatra Tsezarovna", "Egyptian Queen"),
        User(R.drawable.d, "Lady Chatterley", "123456789"),
        User(R.drawable.e, "Ubuntu Microsoft", "Linux system is very good"),
        User(R.drawable.f, "Lion Fat", "Anna Karenina and Natasha Rostova"),
        User(R.drawable.a, "Ivan Bodhitharma", "Buddha and around this"),
        User(R.drawable.c, "Major Tom", "Astronomy and Astrology"),
        User(R.drawable.b, "Cleopatra Tsezarovna", "Egyptian Queen"),
        User(R.drawable.d, "Lady Chatterley", "123456789"),
        User(R.drawable.e, "Ubuntu Microsoft", "Linux system is very good"),
        User(R.drawable.f, "Lion Fat", "Anna Karenina and Natasha Rostova"),
        User(R.drawable.a, "Ivan Bodhitharma", "Buddha and around this"),
        User(R.drawable.c, "Major Tom", "Astronomy and Astrology"),
        User(R.drawable.b, "Cleopatra Tsezarovna", "Egyptian Queen"),
        User(R.drawable.d, "Lady Chatterley", "123456789"),
        User(R.drawable.e, "Ubuntu Microsoft", "Linux system is very good"),
        User(R.drawable.f, "Lion Fat", "Anna Karenina and Natasha Rostova")
    )
}