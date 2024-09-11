(def lista-inteiros
  [1 2 3 4 5 6])

(defn fatorial
  [n]
  (apply * (range 1 (inc n))))

(defn par?
  [n]
  (zero? (mod n 2)))

(defn produto-dos-fatoriais
  [lista-inteiros]
  (->> lista-inteiros
       (filter par?)               
       (map fatorial)              
       (reduce *)))                 

(println (produto-dos-fatoriais lista-inteiros))
