(ns clojure-practice.core
  (:gen-class))

(defn -main
 "I don't do a whole lot ... yet."
 [& args]
 (println "Hello, World!"))

; Pairwise disjoint sets solutions, 4clojure problem 153

(fn [s]
  (every? #(< % 2)
          (map
            #(reduce
               (fn [n x]
                 (if (not (= 0 x))
                   (inc n)
                   n))
               0
               %)
            (map
              #(map
                 (fn [x] (count (clojure.set/intersection x %)))
                 s)
              s))))

#(apply distinct? (mapcat seq %))

(fn pairwise-disjoint [set-of-sets]
  (or
    (empty? set-of-sets)
    (let [examined-set (first set-of-sets)
          remaining-sets (rest set-of-sets)
          disjoint-map (map #(clojure.set/intersection examined-set %) remaining-sets)
          disjoint (every? empty? disjoint-map)]
      (and disjoint (pairwise-disjoint remaining-sets))
      )))

(fn [s]
  (=
    (count
      (apply concat '() s))
    (count
      (apply clojure.set/union s))))

(fn [coll]
  (let [ss (for [a coll b coll
                 :when (not (identical? a b))]
             (clojure.set/intersection a b))]
    (every? empty? ss)))

