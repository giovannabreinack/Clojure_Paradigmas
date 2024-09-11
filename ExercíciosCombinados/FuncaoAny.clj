(defn any?
    
  [pred coll]
    
  (some pred coll))

(defn maior-que-7? [n]
    
  (> n 7))

(println (any? maior-que-7? [1 3 4 2 0])) 

(println (any? maior-que-7? [5 8 9 10 20]))  
