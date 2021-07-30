(ns semana1.dados)
(use 'java-time)

(def cliente {:cliente {:nome  "Edna Moda"
                        :cpf    1
                        :email "edna@moda.com"}
              :cartao {:numero  1
                       :cvv   123
                       :validade "11/21"
                       :limite 1000
                       }
              :compra [{:data            (local-date-time 2021 12 18)
                        :valor           1
                        :estabelecimento "bazar 1"
                        :categoria       "tecido"}
                       {:data            (local-date-time 2020 12 18)
                        :valor           2
                        :estabelecimento "bazar 1"
                        :categoria       "tecido"}
                       {:data            (local-date-time 2021 05 18)
                        :valor           3
                        :estabelecimento "mcdonalds"
                        :categoria       "comida"}
                       {:data            (local-date-time 2020 12 18)
                        :valor           4
                        :estabelecimento "bobs"
                        :categoria       "comida"}]})

(def cliente2 {:cliente {:nome  "Rafiki Ma Maco"
                        :cpf    123456789
                        :email "rafiki@reileao.com"}
              :cartao {:numero  2
                       :cvv   234
                       :validade "12/22"
                       :limite 2000
                       }
              :compra [{:data            "data"
                        :valor           "valor"
                        :estabelecimento "estabelecimento"
                        :categoria       "categoria"}]})

(def cliente3 {:cliente {:nome  "Kiki Wicth"
                        :cpf    234567890
                        :email "kiki@delivery.com"}
              :cartao {:numero  3
                       :cvv   345
                       :validade "03/23"
                       :limite 3000
                       }
              :compra [{:data            "data"
                        :valor           "valor"
                        :estabelecimento "estabelecimento"
                        :categoria       "categoria"}]})

(def cliente4 {:cliente {:nome  "Phoenix Wright"
                        :cpf    345678901
                        :email "phoenix@exception.com"}
              :cartao {:numero  4
                       :cvv   456
                       :validade "04/24"
                       :limite 4000
                       }
              :compra [{:data            "data"
                        :valor           "valor"
                        :estabelecimento "estabelecimento"
                        :categoria       "categoria"}]})



(defn tudo-do-cliente []
  cliente)