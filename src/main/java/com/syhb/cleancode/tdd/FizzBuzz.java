package com.syhb.cleancode.tdd;

class FizzBuzz {

    String calculateFizzNumber(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return "Buzz";
    }

}
