(def lista-inteiros
  [1 2 14 17 33 61 66 80 92])

(defn eh-impar?
  [n]
  (odd? n)) 

(defn cubo
  [n]
  (* n n n))

(defn soma-dos-cubos
  [lista-inteiros]
  (->> lista-inteiros
       (filter eh-impar?)
       (map cubo)
       (reduce +)))

(println (soma-dos-cubos lista-inteiros))
