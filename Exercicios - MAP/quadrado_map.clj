(ns quadrado-map.core)

(defn quadrado [numeros]
  (map #(* % %) numeros))

(defn -main [& args]
  (println (quadrado [1 2 3 4 5])))