(ns ex06.core
(:require [clojure.string :as str]))

(defn contar-vogais-em-string [s]
  (let [vogais #{\a \e \i \o \u}]
    (count (filter vogais (str/lower-case s)))))

(defn quantidade-vogais [strings]
  (let [contagem-vogais (map contar-vogais-em-string strings)
        total-vogais (apply + contagem-vogais)]
    {:total total-vogais
     :total-por-palavra contagem-vogais}))

(defn -main [& args]
  (println (quantidade-vogais ["Mayara", "Exemplo"])))