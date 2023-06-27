package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_questions"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question( 1, "What country flag is this ?", R.drawable.afghanistan,
            "India", "Pakistan", "Sri Lanka", "Afghanistan",
            4
        )
questionsList.add(que1)


        val que2 = Question( 2, "What country flag is this ?", R.drawable.albania,
            "India", "Albania", "Sri Lanka", "Afghanistan",
            2
        )
        questionsList.add(que2)


        val que3 = Question( 3, "What country flag is this 3 ?", R.drawable.afghanistan,
            "India", "Pakistan", "Sri Lanka", "Afghanistan",
            4
        )
        questionsList.add(que3)



        val que4 = Question( 4, "What country flag is this 4?", R.drawable.afghanistan,
            "India", "Pakistan", "Sri Lanka", "Afghanistan",
            4
        )
        questionsList.add(que4)


        val que5= Question( 5, "What country flag is this5 ?", R.drawable.afghanistan,
            "India", "Pakistan", "Sri Lanka", "Afghanistan",
            4
        )
        questionsList.add(que5)

        return questionsList

    }


}