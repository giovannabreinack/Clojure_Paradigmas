(defn filtroImpar [palavras]
  (->> palavras
       (filter #(odd? (count %)))  
       (map count)))               

(def palavras ["clojure" "alface" "brigadeiro" "vida" "jogo" "jovens" "mes"])
(println (filtroImpar palavras))
