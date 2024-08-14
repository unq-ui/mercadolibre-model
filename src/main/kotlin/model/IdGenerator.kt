package model

class IdGenerator {
    private var currentUserId = 0
    private var currentProductId = 0
    private var currentCategoryId = 0
    private var currentQuestionId = 0

    fun nextUserId(): String = "u_${++currentUserId}"
    fun nextProductId(): String = "p_${++currentProductId}"
    fun nextCategoryId(): String = "c_${++currentCategoryId}"
    fun nextQuestionId(): String = "q_${++currentQuestionId}"
}