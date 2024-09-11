(require '[clojure.string :as str])

(def lista-palavras
  ["arr" "t" "t" "uva" "l" "v" "m"])

(defn concatenar
  [lista-palavras]
  (->> lista-palavras
       (filter #(> (count %) 2))    
       (apply str)                  
       (str/upper-case)))           

(println (concatenar lista-palavras))

