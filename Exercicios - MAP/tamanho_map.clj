(ns tamanho-map.core)

(defn tamanho [palavras]
  (map count palavras))

(defn -main [& args]
  (println (tamanho ["mayara", "teste", "number", "oi"])))