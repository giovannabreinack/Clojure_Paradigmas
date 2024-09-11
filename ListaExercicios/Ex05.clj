(ns ex05.core)

(defn media-positivos [numeros]
  (let [positivos (filter pos? numeros)
        soma (reduce + positivos)
        quantidade (count positivos)]
    (if (zero? quantidade)
      0
      ( double (/ soma quantidade)))))

(defn -main [& args]
  (println (media-positivos [-1 2 3 -4 5])))