(ns maiusculas-map.core
  (:require [clojure.string :as str]))

(defn maiusculas [lista]
  (map str/upper-case lista))

(defn -main [& args]
  (println (maiusculas ["mayara", "vieira", "da", "silva"])))