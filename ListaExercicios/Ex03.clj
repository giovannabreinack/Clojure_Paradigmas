(def lista-inteiros
  [1 -2 14 -17 33 61 -66 80 -92])

(defn negative?
  [n]
  (< n 0))

(defn contar-negativos
  [lista-inteiros]
  (->> lista-inteiros
       (filter negative?) 
       (reduce (fn [acc _] (inc acc)) 0))) 

(println (contar-negativos lista-inteiros))
