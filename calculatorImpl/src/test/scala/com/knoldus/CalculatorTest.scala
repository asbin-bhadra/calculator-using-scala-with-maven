// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus
import scala.collection._
import org.scalatest.FunSpec

class CalculatorTest extends FunSpec {
  val obj = new Calculator()

    // Test case for add function
    describe("Add") {

        it ("should return result if interger number provided") {
            assert(obj.add(2,3) == 5)
        }

        it ("should return result if float number provided") {
            assert(obj.add(6.5,55.0) == 61.5)
        }

        it ("should return result if 0 provided") {
            assert(obj.add(0,3) == 3)
        }

        it ("should return result if negetive integer provided") {
            assert(obj.add(5.0,-3.0) == 2)
        }

        it ("should invalid as 5+4 will not return 10 as output") {
            assert(!(obj.add(5.0,4.0) == 10))
        }

    }
    // Test case for sub function
    describe("Sub"){
        it ("should return result if interger number provided") {
            assert(obj.sub(3,2) == 1)
        }
        it ("should return result if float number provided") {
            assert(obj.sub(15.5,3) == 12.5)
        }
        it ("should return result if 0 provided") {
            assert(obj.sub(0,3.0) == -3.0)
        }
        it ("should return result if negetive integer provided") {
            assert(obj.sub(5.0,-3.0) == 8)
        }
        it ("should invalid as 5-4 will not return 6 as output") {
            assert(!(obj.sub(5.0,4.0) == 6))
        }
    }

    // Test case for mul function
    describe("Mul"){
        it ("should return result if interger number provided") {
            assert(obj.mul(3.0,2.0) == 6)
        }
        it ("should return result if float number provided") {
            assert(obj.mul(4.5,3.0) == 13.5)
        }
        it ("should return result if 0 provided") {
            assert(obj.mul(0,3.0) == 0)
        }
        it ("should return result if negetive integer provided") {
            assert(obj.mul(5.0,-3.0) == -15.0)
        }
        it ("should invalid as 5*4 will not return 10 as output") {
            assert(!(obj.mul(5.0,4.0) == 10))
        }
    }

    // Test case for div function
    describe("Div"){
        it ("should return result if integer number provided") {
            assert(obj.div(4.0,2.0) == 2)
        }
        it ("should return result if float number provided") {
            assert(obj.div(4.5,2.0) == 2.25)
        }
        it ("should return result if negetive number is provided") {
            assert(obj.div(-54.0,2.0) == -27.0)
        }
        it ("should return result if large numbers provided") {
            assert(obj.div(50000000.0, 10000000.0) == 5)
        }
        it ("should return 0 if 0 is provided as numerator") {
            assert(obj.div(0,2.0) == 0)
        }
        it ("should throw ArithmeticException if 0 is provided as denominator") {
            assertThrows[ArithmeticException]{
                obj.div(2.0,0)
            }
        }
        it ("should invalid as 5/4 will not return 12 as output") {
            assert(!(obj.div(5.0,4.0) == 12))
        }
    }

    // Test case for pow function
    describe("Pow"){
        it ("should return result if integer number provided as base and exponent") {
            val base = 4
            val exp = 2
            assert(obj.pow(base,exp) == 16)
        }
        it ("should return result if float number provided as base") {
            val base = 4.5
            val exp = 2
            assert(obj.pow(base,exp) == 20.25)
        }
        it ("should return negetive result if negetive integer number provided as base with odd exponent") {
            val base = -4.0
            val exp = 3
            assert(obj.pow(base,exp) == -64.0)
        }
        it ("should return possitive result if negetive integer number provided as base with even exponent") {
            val base = -4
            val exp = 4
            assert(obj.pow(base,exp) == 256)
        }
        it ("should invalid as 5 raise to the power 4 will not return 12 as output") {
            val base = 5
            val exp = 4
            assert(!(obj.pow(base,exp) == 12))
        }
        it ("should return result if negetive integer number provided as exponent") {
            val base = 4
            val exp = -4
            assert(obj.pow(base,exp) == 0.00390625)
        }
    }

    // Test case for abs function
    describe("Abs"){
        it ("should return result if possitive integer number provided") {
            assert(obj.abs(10.0) == 10)
        }
        it ("should return result if negetive integer number provided") {
            assert(obj.abs(-10.0) == 10)
        }
        it ("should return result if possitive float number provided") {
            assert(obj.abs(15.5) == 15.5)
        }
        it ("should return result if negetive float number provided") {
            assert(obj.abs(-15.5) == 15.5)
        }
        it ("should invalid as absolute value of 5 will not return 12 as output") {
            assert(!(obj.abs(5.0) == 12))
        }
    }

    // Test case for mod function
    describe("Mod"){
        it ("should return result if positive integer number provided") {
            assert(obj.mod(10.0,4.0) == 2)
        }
        it ("should return result if negetive integer number provided as divident") {
            assert(obj.mod(-10.0,4.0) == -2.0)
        }
        it ("should return result if negetive integer number provided as divisor") {
            assert(obj.mod(10.0,-4.0) == 2)
        }
        it ("should return result if positive float number provided") {
            assert(obj.mod(10.5,4.0) == 2.5)
        }
        it ("should return result if negetive float number provided") {
            assert(obj.mod(-10.5,4.0) == -2.5)
        }
        it ("should throw ArithmeticException if 0 is provided as divisor") {
            assertThrows[ArithmeticException]{
                obj.mod(10.0,0)
            }
        }
        it ("should invalid as 5%4 will not return 10 as output") {
            assert(!(obj.mod(5.0,4.0) == 10))
        }
    }

    // Test case for max function
    describe("Max"){
        it ("should return result if positive integer number provided") {
            assert(obj.max(10.0,4.0) == 10)
        }
        it ("should return result if negetive integer number provided") {
            assert(obj.max(-10.0,4.0) == 4)
        }
        it ("should return result if positive float number provided") {
            assert(obj.max(10.0,14.5f) == 14.5)
        }
        it ("should return result if negetive float number provided") {
            assert(obj.max(10.0,-14.5) == 10)
        }
        it ("should invalid as largest of 5 and 10 will not be 5") {
            assert(!(obj.max(5.0,10.0) == 5))
        }
    }

    // Test case for min function
    describe("Min"){
        it ("should return result if positive integer number provided") {
            assert(obj.min(20.0,41.0) == 20.0)
        }
        it ("should return result if negetive integer number provided") {
            assert(obj.min(-20.0,41.0) == -20.0)
        }
        it ("should return result if positive float number provided") {
            assert(obj.min(52.0,62.5f) == 52.0)
        }
        it ("should return result if negetive float number provided") {
            assert(obj.min(20.0,-75.5) == -75.5)
        }
        it ("should invalid as min of 5 and 10 will not be 10") {
            assert(!(obj.min(5.0,10.0) == 10))
        }
    }
}
