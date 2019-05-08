(ns coverage-test.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

; (declare ack)
; (defn ack
;   "The Ackermann function."
;   [m n]
;   (cond
;     (zero? m) (inc n)
;     (zero? n) (recur (dec m) 1)
;     :else (recur (dec m) (ack  m (dec n)))))

(defn foo-bar-baz [coll]
  (doseq [item coll]
    (printf "Item + 1 is %s\n" (inc item))))
