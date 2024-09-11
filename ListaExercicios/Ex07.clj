(ns ex07.core)

(defn primo? [n]
  (cond
    (<= n 1) false
    (<= n 3) true
    (zero? (mod n 2)) false
    (zero? (mod n 3)) false
    :else
    (let [sqrt-n (Math/sqrt n)]
      (loop [i 5]
        (cond
          (> i sqrt-n) true
          (zero? (mod n i)) false
          (zero? (mod n (+ i 2))) false
          :else (recur (+ i 6)))))))

(defn soma-quadrados-primos [numeros]
  (->> numeros
       (filter primo?)
       (map #(Math/pow % 2))
       (reduce +)))

(defn -main [& args]
  (println (soma-quadrados-primos [1 2 3 4 5 7 11 13])))