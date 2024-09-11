(def lista-inteiros
  [1 2 14 17 33 61 66 80 92])

(defn eh-divisivel-por-dois?
  [n]
  (= (mod n 2) 0))

(defn numeros-pares
  [lista-inteiros]
  (filter eh-divisivel-por-dois? lista-inteiros))

(println (numeros-pares lista-inteiros))
