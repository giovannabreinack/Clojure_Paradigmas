(defn all?
  [num coll]
  (reduce (fn [acc x] (and acc (num x))) true coll))

(defn negative? [n]
  (< n 0))

(println (all? negative? [0 -3 1 -5])) 
(println (all? negative? [-2 -1 -5 -8]))  
