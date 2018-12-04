 (def input (clojure.string/split-lines (slurp "./resources/day_1"))) (println input)

 (reduce + (map read-string input))
 
(defn part2b [changes] 
  (let [freq (reductions + (cycle changes))] 
    (loop [[x & xs] freq seen #{0}] 
      (if (seen x) 
        x 
        (recur xs (conj seen x))))))