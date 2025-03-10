(ns koans.07-functions
  (:require [koan-engine.core :refer :all]))

(defn multiply-by-ten [n]
  (* 10 n))

(defn square [n] (* n n))

(meditations
  "함수를 호출하는 것은 마치 괄호와 인사하는 것 같다"
  (= __ (square 9))

  "함수는 보통 쓰기 전에 미리 정의한다"
  (= __ (multiply-by-ten 2))

  "하지만 즉석에서 정의해 쓸 수도 있다"
  (= __ ((fn [n] (* 5 n)) 2))

  "아니면 훨씬 간단한 문법으로 쓸 수도 있다"
  (= __ (#(* 15 %) 4))

  "익명 함수도 여러 전달인자(argument)를 받을 수 있다"
  (= __ (#(+ %1 %2 %3) 4 5 6))

  "필요 없는 전달인자는 건너 뛸 수도 있다"
  (= __ (#(str "AA" %2) "bb" "CC"))

  "함수가 다른 함수를 만들어 낼 수 있다"
  (= 9 (((fn [] ___)) 4 5))

  "함수가 다른 함수를 입력값으로 받을 수도 있다"
  (= 20 ((fn [f] (f 4 5))
           ___))

  "고차함수(Higher-order functions)는 함수를 전달인자로 받는다"
  (= 25 (___
          (fn [n] (* n n))))

  "그러나 함수 이름을 사용하는 것이 나을 때가 많다"
  (= 25 (___ square)))
