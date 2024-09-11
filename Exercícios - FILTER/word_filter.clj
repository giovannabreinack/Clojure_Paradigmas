(def lista-palavras
  ["arroz" "tomada" "torradeira" "uva" "lapis" "vento" "montanha"])

(defn tem-mais-de-cinco-caracteres?
  [n]
  (> (count n) 5))

(defn palavras-maiores
  [lista-palavras]
    (filter tem-mais-de-cinco-caracteres? lista-palavras))

(println (palavras-maiores lista-palavras))
