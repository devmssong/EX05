fun main(){
    // getTotal 함수 테스트
    // var a1 = getTotal()
    // println("a1 : $a1 ")

    // printTotal 함수 테스트
    // printTotal(100)

    // 1부터 100까지의 합을 구한다
    val total = getTotal()

    // 출력한다.
    printTotal(total)

}

//1. 1부터 100까지의 총합을 구한다.
fun getTotal():Int{

    var total = 0

    // 1부터 100까지 반복한다.
    for(v1 in 1..100){
        total += v1
    }

    return total
}

// 2. 총합을 출력한다.
fun printTotal(total:Int){
    println("1부터 100까지의 총합은 ${total}입니다.")
}

