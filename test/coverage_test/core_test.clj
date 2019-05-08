(ns coverage-test.core-test
  (:require [clojure.test :refer :all]
            [clojure.string :as s]
            [coverage-test.core :as c]))

(deftest a-test
  (is (= 1 1)))

(deftest it-can-foo
  (is (= (s/join "\n"
                 ["Item + 1 is 2"
                  "Item + 1 is 3"
                  "Item + 1 is 4\n"])
         (with-out-str
           (c/foo-bar-baz [1 2 3])))))

(deftest ackerman-works
  (is (= 29 (c/ack 3 2))))
