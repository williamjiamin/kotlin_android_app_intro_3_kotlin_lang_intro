package com.lexueoude.kotlinintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val a : Int = 88
//        val b : Int = 66
//        val c : Int = 44
//        val d : Int = 22
//
//        var result : Int = a + b
//
//        Log.d("KotlinIntroLog","The result of a + b is : $result")
//
//        result = a - b
//
//        Log.d("KotlinIntroLog","The result of a - b is : $result")
//
//        result = a*b
//
//        Log.d("KotlinIntroLog","The result of a*b is : $result")
//
//        result = a/b
//
//        Log.d("KotlinIntroLog","The result of a/b is : $result")
//
//        result = a%b
//
//        Log.d("KotlinIntroLog","The result of a%b is : $result")
//
//        result = a*b + c/d
//
//        Log.d("KotlinIntroLog","The result of a*b + c/d is : $result")
//
//        result = a*b - c/d
//
//        Log.d("KotlinIntroLog","The result of a*b - c/d is : $result")
//
//        result = a*(b + c)/d
//
//        Log.d("KotlinIntroLog","The result of a*b - c/d is : $result")
//
//        val william : Int = 1
//        val williamAge : Int = 18
//        val yearsLater : Int = 30
//        val results : Int = william + williamAge + yearsLater
//
//        Log.d("KotlinIntroLog","The result of william's age's calculation is : $results")
//
//        val myNum1 : Float = 1.5f
//        val myNum2 : Float = 2.4f
//
//        result = (myNum1 + myNum2).toInt()
//
//        Log.d("KotlinIntroLog","The result of float addition is : $result")
//
//        val resultForHoldingFloatingPoints : Float = myNum1 + myNum2
//
//        Log.d("KotlinIntroLog","The result of real float addition is : $resultForHoldingFloatingPoints")
//
//
//        val loveLeXueOuDe: Boolean = true
//        val hateLeXueOuDe: Boolean = false
//
//        Log.d("KotlinIntroLog","Do you love lexueoude.com? $loveLeXueOuDe and do you hate lexueoude.com? $hateLeXueOuDe")

//        val firstCharacter : Char = 'a'
//        val secondCharacter : Char = '1'
//
//        Log.d("KotlinIntroLog","The firstCharacter is : $firstCharacter")
//        Log.d("KotlinIntroLog","The secondCharacter is : $secondCharacter")
//
//        val firstString : String = "Welcome to lexueoude.com "
//        val secondString : String = "My name is William"
//        val thirdString : String = " lxodxgj"
//
//        val resultOfStringCat : String = firstString + secondString + thirdString
//        val resultOfStringCat2 : String = "$firstString$secondString$thirdString"
//
//        Log.d("KotlinIntroLog","The result of three String cat is : $resultOfStringCat")
//        Log.d("KotlinIntroLog","The result of three String cat2 is : $resultOfStringCat2")
//
//        val intArray : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
//        val stringArray : Array<String> = arrayOf("1","2","3","4","5","6","7","8","9","10","Welcome to lexueoude.com","My name is Williamjiamin")
//        val mixArray : Array<Any> = arrayOf(1,"2",3,"4",5.1f,"6.0f",7,true,false,"10","This is the end",'a')

        val myNum1 : Int = 1
        val myNum2 : Int = 16
        val myNum3 : Int = 88
        val myNum4 : Int = 88

        Log.d("lexueoude.com","The result of myNum1 < myNum2 : ${myNum1 < myNum2}")
        Log.d("lexueoude.com","The result of myNum1 > myNum2 : ${myNum1 > myNum2}")

        Log.d("lexueoude.com","The result of myNum3 == myNum4 : ${myNum3 == myNum4}")
        Log.d("lexueoude.com","The result of myNum1 != myNum4 : ${myNum1 != myNum4}")

        Log.d("lexueoude.com","The result of myNum3 <= myNum4 : ${myNum3 <= myNum4}")
        Log.d("lexueoude.com","The result of myNum3 >= myNum4 : ${myNum3 >= myNum4}")



        Log.d("lexueoude.com","The result of (myNum1 < myNum2) && (myNum3 == myNum4) : ${(myNum1 < myNum2) && (myNum3 == myNum4)}")
        Log.d("lexueoude.com","The result of (myNum1 > myNum2) && (myNum3 != myNum4) : ${(myNum1 > myNum2) && (myNum3 != myNum4)}")
        Log.d("lexueoude.com","The result of (myNum1 < myNum2) && (myNum3 != myNum4) : ${(myNum1 < myNum2) && (myNum3 != myNum4)}")

        Log.d("lexueoude.com","The result of (myNum1 < myNum2) || (myNum3 == myNum4) : ${(myNum1 < myNum2) || (myNum3 == myNum4)}")
        Log.d("lexueoude.com","The result of (myNum1 > myNum2) || (myNum3 != myNum4) : ${(myNum1 > myNum2) || (myNum3 != myNum4)}")
        Log.d("lexueoude.com","The result of (myNum1 < myNum2) || (myNum3 != myNum4) : ${(myNum1 < myNum2) || (myNum3 != myNum4)}")

        Log.d("lexueoude.com","The result of (myNum1 < myNum2) && (myNum3 != myNum4) : ${(myNum1 < myNum2) && (myNum3 != myNum4) && (myNum3 != myNum4) && (myNum3 != myNum4) && (myNum3 != myNum4)}")
        Log.d("lexueoude.com","The result of (myNum1 < myNum2) && (myNum3 != myNum4) : ${(myNum1 < myNum2) || (myNum3 != myNum4) || (myNum3 != myNum4) || (myNum3 != myNum4) || (myNum3 != myNum4)}")







    }
}