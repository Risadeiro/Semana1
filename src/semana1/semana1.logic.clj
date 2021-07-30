(ns semana1.logic
  (:require [semana1.dados :as s.db]))
(use 'java-time)
(use '[clojure.string :as s])

(println   (map println ((s.db/tudo-do-cliente) :compra) ))

(defn total-por-categoria
  [compras]
  (->> compras
       (map :valor)
       (reduce +)))

(defn total-da-categoria
  [[categoria dados]]
  {:categoria categoria
   :gasto (total-por-categoria dados)})
(defn total-da-data
  [[data dados]]
  {:data (as data :month-of-year :year)
   :valor (total-por-categoria dados)})
(defn busca-estabelecimento
  [compras]
  (-> compras
      :estabelecimento))

(println "AGRUPAMENTO\n" (map total-da-categoria(group-by :categoria ((s.db/tudo-do-cliente) :compra))))
(println "FATURA\n" (map total-da-data (group-by :data ((s.db/tudo-do-cliente) :compra))))
(println "Busca\n" (group-by :estabelecimento (filter #(s/includes? (:estabelecimento %) "baza")  ((s.db/tudo-do-cliente) :compra))))
