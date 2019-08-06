(ns clojure-review.core-test
  (:require [clojure.test :refer :all]
            [clojure-review.core :refer :all]))

(deftest make-pair-test
  (testing "make-pair"
    (is (= [3 3] (make-pair 3)))
    (is (= [[:howdy] [:howdy]] (make-pair [:howdy])))
    (is (= ["Yum!" "Yum!"] (make-pair "Yum!")))
    (is (= ['(:x :y) '(:x :y)] (make-pair '(:x :y))))
    ))

(deftest double-apply-test
  (testing "double-apply"
    (is (= 4 (double-apply inc 2)))
    (is (= :a (double-apply first [[:a :b] :c [:d [:e]]])))
    (is (= '([:d [:e]]) (double-apply rest [[:a :b] :c [:d [:e]]])))
    (is (= 81 (double-apply (fn [x] (* x x)) 3)))
    ))

(deftest double-applicator-test
  (testing "double-applicator"
    (is (= 4  ((double-applicator inc) 2)))
    (is (= :a ((double-applicator first) [[:a :b] :c [:d [:e]]])))
    (is (= '([:d [:e]]) ((double-applicator rest) [[:a :b] :c [:d [:e]]])))
    (is (= 81 ((double-applicator (fn [x] (* x x))) 3)))
    ))

(deftest my-flatten-test
  (testing "my-flatten"
    (is (= [] (my-flatten [])))
    (is (= [] (my-flatten [[[]]])))
    (is (= [:hithere] (my-flatten [[[:hithere]]])))
    (is (= '(:a :b :c) (my-flatten [:a [[[:b] :c]]])))
    (is (= '(:spam :spam :spam :spam :spam :baked-beans :spam :spam :spam)
           (my-flatten [:spam :spam :spam :spam :spam [:baked-beans [:spam] [[:spam]] [[[:spam]]]]])))
    (is (= [:stop :me :if :youve :heard :this :one :before]
           (my-flatten [[[:stop [:me]] :if] :youve :heard [:this [[:one]]] :before])))
    ))

(deftest conj-all-test
 (testing "conj-all"
   (is (=  [:a :b :c :d :e :f] (conj-all [:a :b :c] [:d :e :f])))
   (is (= ["x" "y" "z"] (conj-all [] ["x" "y" "z"])))
   (is (= ["baked" "beans"] (conj-all ["baked" "beans"] [])))
   ))
