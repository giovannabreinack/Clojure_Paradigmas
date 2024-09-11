(def lista-caracteres
  ["a" "b" "c" "f" "g" "m" "e" "i" "k"])

(def vogais
  ["a" "e" "i" "o" "u"])

(defn eh-vogal?
  [n]
  (some #{n} vogais))

(defn so-vogais
  [lista-caracteres]
  (filter eh-vogal? lista-caracteres))

(println (so-vogais lista-caracteres))
